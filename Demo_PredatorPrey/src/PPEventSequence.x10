import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.array.Array_2;
import x10.regionarray.Dist;

public class PPEventSequence {
	public var PreyCount:Long;
	public var PredatorCount:Long;
	public var CountInfect:Long;
	public var CountUnInfect:Long;	
	public val AgentList:DistArray[Agent];
	//gjm_addcode
	public val FrequencyList:Array_2[Int];
	//public var times:Cell[Long];
	
	public val Reg:Region(2);  
	public val DC:DataCollection;
	public val times=GlobalRef[Cell[Long]](new Cell[Long](0));
	//gjmadd
	private val runner:ScheduleRunner;
	
	public def this()
	{
		PreyCount=0;
		PredatorCount=0;
		CountInfect=0;
		CountUnInfect=0;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		AgentList=DistArray.make[Agent](D,(p:Point(2))=>null);
		
		// FrequencyList=DistArray.make[Int](D,0 as Int);//init:(Point(dist.rank))=>T
		val numPlace:Int = Place.numPlaces() as Int;
		FrequencyList =  new Array_2[Int](numPlace , numPlace, 0n);  
		DC = new DataCollection();
		times().set(0);
		//gjmadd
		runner = new ScheduleRunner();
	}
	
	public def step1():void
	{
		init();//this
		
		//Console.OUT.println(here.id+"我是第1件要做的事情");
		
	}
	public def step2():void
	{
		// Interactive();
		// AgentNeighbor();
		// AgentNeighborsState();
		
        saveAgentNeighbors();//this
       
		//Interactive();
		
		//Console.OUT.println(here.id+"我是第2件要做的事情");
	}
	public def step3():void
	{
		//DisplayAgent();//this
		//DisplaySugarAmount();
		//test();
		// Display();
		Interactive();//this
		//Console.OUT.println(here.id+"我是第3件要做的事情");
	}
	
	public def step4():void
	{
		//ShowAgent();//this
		//Count();
		if(Count()<=0L){
			runner.scheduleStopEvent(new ScheduleRunner().getGlobalNextTick() ,new ScheduleStopFunctor(runner));
			//new ScheduleRunner().stop();
		}
		// DisplayAgentAccess();
		//Console.OUT.println(here.id+"我是第4件要做的事情");
		initMoved();
	}
	
	public def test():void
	{
		var Uptime:Long = -System.nanoTime();
		DC.RecordWrite(" at Place "+ here.id +".");
		Uptime += System.nanoTime();
		//Uptime /= 1000000;//将时间由纳秒转化为毫秒
		Console.OUT.println( here.id +"." +"Total time consuming is " +Uptime +"ms.");
	}
	
	public def init():void
	{
		    //Every place creates Agent.
		    PreyCount=0;
		    Console.OUT.println("PP is initializing in palce "+ here.id);	
		    finish while(PreyCount<Setting.PreyNum/AgentList.dist.numPlaces())//Return the number of the places of the Distarray
		    {
			        po:Point(2) = [((new Random().nextDouble()*Grid.Grid_XMax) as Int), 
			               ((new Random().nextDouble()*Grid.Grid_YMax) as Int)];	
			        if(AgentList.dist.operator()(po)==here && AgentList(po)==null)
			        {
				        AgentList(po)=new Agent(po,2n);
				        atomic PreyCount++;
			        }  
		    }
		    Console.OUT.println("       "+"Now the number of Prey is "+ PreyCount +" in "+here+".");
		    
		    PredatorCount=0;
		    //第二种agent的创建
		    finish while(PredatorCount<Setting.PredatorNum/AgentList.dist.numPlaces())//Return the number of the places of the Distarray
		    {
		    	po:Point(2) = [((new Random().nextDouble()*Grid.Grid_XMax) as Int), 
		    	               ((new Random().nextDouble()*Grid.Grid_YMax) as Int)];	
			    if(AgentList.dist.operator()(po)==here&&AgentList(po)==null)
			    {
			    	AgentList(po)=new Agent(po,1n);
			    	atomic PredatorCount++;
			    }  
		    }
		    Console.OUT.println("       "+"Now the number of Predator is "+ PredatorCount +" in "+here+".");
		    //空余cell的agent的创建
		   finish  for(po in AgentList|here)
		    {	
		         if(AgentList(po)==null){
			     	AgentList(po)=new Agent(po); 
		         }
		    }
		   
		    // Console.OUT.println(n);
		
	}
	
	
	

	public def saveAgentNeighbors():void
	{	
		//Every Agent checks neighbor.
		for(po in AgentList|here)
		{
			if(AgentList(po).getLabel()!=0n){
				var Neighbor:Array[Int]=new Array[Int](8,0 as Int);
				/*
				Neighbor(0)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,po(1))) AgentList((po(0)+1)%Grid.Grid_XMax,po(1)).getLabel() as Int;
				Neighbor(1)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int;
				Neighbor(2)= at (AgentList.dist.operator()(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int;
				Neighbor(3)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))  AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int;
				Neighbor(4)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1))) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1)).getLabel() as Int;
				Neighbor(5)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax)) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int;
				Neighbor(6)= at (AgentList.dist.operator()(po(0),(po(1)+1)%Grid.Grid_YMax)) AgentList(po(0),(po(1)+1)%Grid.Grid_YMax).getLabel() as Int;
				Neighbor(7)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax))  AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int;
				//Console.OUT.println("  "+po +"'s Label is "+AgentList(po).getLabel()+" ,its Neighbor is :"+Neighbor);
				 */
				
				Neighbor(0)= (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,po(1)))!=here ? 
						(at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,po(1))) AgentList((po(0)+1)%Grid.Grid_XMax,po(1)).getLabel() as Int)
						:(AgentList((po(0)+1)%Grid.Grid_XMax,po(1)).getLabel() as Int);
				Neighbor(1)= (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))!=here ? 
						(at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int)
						:(AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int);
				Neighbor(2)= (AgentList.dist.operator()(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))!=here ? 
					    (at (AgentList.dist.operator()(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int)
					    :(AgentList(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int);
				Neighbor(3)= (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))!=here ?
						(at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))  AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int)
						:(AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getLabel() as Int);
				Neighbor(4)= (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1)))!=here ?
						(at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1))) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1)).getLabel() as Int)
						:(AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1)).getLabel() as Int);
				Neighbor(5)= (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax))!=here ?
						(at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax)) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int)
						:(AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int);
				Neighbor(6)= (AgentList.dist.operator()(po(0),(po(1)+1)%Grid.Grid_YMax))!=here ?
						(at (AgentList.dist.operator()(po(0),(po(1)+1)%Grid.Grid_YMax)) AgentList(po(0),(po(1)+1)%Grid.Grid_YMax).getLabel() as Int)
						:(AgentList(po(0),(po(1)+1)%Grid.Grid_YMax).getLabel() as Int);
				Neighbor(7)= (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax))!=here ? 
						(at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax))  AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int)
						:(AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getLabel() as Int);
				
				AgentList(po).setNeighbors(Neighbor);
			}
		}
		//Console.OUT.println("--------------save Neighbors--------------");
	}
	 
	
	public def Interactive()
	{	
		//Every Agent Interactives.
		at(Place(0))async atomic{ (times().set(times().operator()()+1));}
		Console.OUT.println("-----In "+ here +" , "+ (at(Place(0))((times().operator()() as Int)/4)) +" times-----");
		 
		//Console.OUT.println("  " +"Interactiving in Place " + here.id +".");

		finish for(po in AgentList|here)
		{
			var AgentState:Int;
			var AgentLabel:Int;
			//如果agent死亡，那么进行下一个;
			AgentState=AgentList(po).getState() as Int;	
			AgentLabel=AgentList(po).getLabel() as Int;
			if(AgentState==0n || AgentLabel==0n){
				continue;
			}

			//agent是活着的，则与所有该类型的agent进行交互；
			if(AgentState==1n && AgentLabel!=0n)//&& AgentList(po).getAccess()==false 
			finish {
				move(po);
			}//end if(AgentState==1n) finish	
		}//finish for every agent
		
		// Console.OUT.println("  "+"The number of Prey Agent (after interactive) is "+ PreyCount +" at Place "+ here.id +".");
		// Console.OUT.println("  "+"The number of Predator Agent (after interactive) is "+ PredatorCount +" at Place "+ here.id +".");
		
		// DC.RecordWrite("  "+"The number of changed Agent (after interactive) is "+ PreyCount +" at Place "+ here.id +".");
			
		//DC.RecordWrite(PreyCount+"\t"+ here.id );
    }

	private def move(p:Point):void {
		val label:Int = AgentList(p).getLabel();
		if(AgentList(p).getHasMoved() || AgentList(p).getState()==0n || label==0n){
			return;
		}
		//is Prey
		if(label==2n){
			var Prey_neighbors:Array[Int]=new Array[Int](8,0 as Int);
			Prey_neighbors=AgentList(p).getNeighbors();
			val MoveTo_p:Array[Point(2)]=new Array[Point(2)](1);
			MoveTo_p(0) = [AgentList(p).getLocation()(0), AgentList(p).getLocation()(1)];
			for(i in Prey_neighbors){
				//when prey meets null
				if(Prey_neighbors(i)==0n){
					var canMove:Boolean = true;
					switch(i(0) as Int){
					case 0n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, AgentList(p).getLocation()(1)];      
						break;
					case 1n:   
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 2n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];      
						break;
					case 3n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 4n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1))];   
						break;
					case 5n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					case 6n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax]; 
						break;
					case 7n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax,(AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					}	
					//Judge to be not null or has been moved.
					canMove = at(AgentList.dist.operator()(MoveTo_p(0))) (AgentList(MoveTo_p(0)).getLabel()==0n && (!AgentList(MoveTo_p(0)).getHasMoved()));
					if(canMove){
						//Console.OUT.println("猎物 "+p+" 从 "+p+" 移动到了 "+MoveTo_p(0)+" !"+" from "+here+"-"+canMove);              
						
						//change datas
						if(AgentList.dist.operator()(MoveTo_p(0)) != here){
							finish at(AgentList.dist.operator()(MoveTo_p(0))) async{
								AgentList(MoveTo_p(0)).setLabel(2n);
								AgentList(MoveTo_p(0)).setState(1n);
								AgentList(MoveTo_p(0)).setHasMoved(true);
							}
						}else{
							AgentList(MoveTo_p(0)).setLabel(2n);
							AgentList(MoveTo_p(0)).setState(1n);
							AgentList(MoveTo_p(0)).setHasMoved(true);
						}
						
						AgentList(p).setHasMoved(true);
						AgentList(p).setLabel(0n);
						AgentList(p).setState(0n);
						
						break;
					}
				}else if((i(0)==7) && (Prey_neighbors(i)!=0n)){
					//before seven neighbors all are not null
					//so no move
					//Console.OUT.println("猎物 "+p+" 从 "+p+" 移动到了 "+p+" !"+" from "+here+"---");
					
					break;
				}//endelse
				
			}//endfor
		}//end if

		//is Predator
		if(label==1n){
			var Predator_neighbors:Array[Int]=new Array[Int](8,0 as Int);
			Predator_neighbors=AgentList(p).getNeighbors();
			val MoveTo_p:Array[Point(2)]=new Array[Point(2)](1);
			MoveTo_p(0) = [AgentList(p).getLocation()(0), AgentList(p).getLocation()(1)];
			
			var moved:Boolean = false;
			
			for(i in Predator_neighbors){
				//when Predator meets Prey.
				if(Predator_neighbors(i)==2n){
					var canMove:Boolean = true;
					switch(i(0) as Int){
					case 0n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, AgentList(p).getLocation()(1)];      
						break;
					case 1n:   
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 2n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];      
						break;
					case 3n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 4n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1))];   
						break;
					case 5n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					case 6n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax]; 
						break;
					case 7n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax,(AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					}	
					//Judge whether to be Prey or has not been moved.
					canMove = at(AgentList.dist.operator()(MoveTo_p(0))) (AgentList(MoveTo_p(0)).getLabel()==2n && (!AgentList(MoveTo_p(0)).getHasMoved()));
					if(canMove){
						//Console.OUT.println("捕猎者 "+p+" 从 "+p+" 移动到了 "+MoveTo_p(0)+" !"+" from "+here+" 并吃了它！");
						moved=true;
						//change datas
						if(AgentList.dist.operator()(MoveTo_p(0)) != here){
							finish at(AgentList.dist.operator()(MoveTo_p(0))) async{
								AgentList(MoveTo_p(0)).setLabel(1n);
								AgentList(MoveTo_p(0)).setState(1n);
								AgentList(MoveTo_p(0)).setHasMoved(true);
							}
						}else{
							AgentList(MoveTo_p(0)).setLabel(1n);
							AgentList(MoveTo_p(0)).setState(1n);
							AgentList(MoveTo_p(0)).setHasMoved(true);
						}
						
						AgentList(p).setHasMoved(true);
						AgentList(p).setLabel(0n);
						AgentList(p).setState(0n);
						return;
					}
					
				}//endif==2n
			}//endfor
			
			//if no meet prey,jump a grid and find a null to move
			val MoveTo_p_temp:Array[Point(2)]=new Array[Point(2)](1);
			for(i in Predator_neighbors){
				//when Predator meets Prey.
				if(Predator_neighbors(i)==0n){
					var canMove:Boolean = true;
					//
					//3 - 4 - 5
					//- 0 0 0 -
					//2 0 X 0 6
					//- 0 0 0 -
					//1 - 0 - 7
					//
					switch(i(0) as Int){
					case 0n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+2)%Grid.Grid_XMax, AgentList(p).getLocation()(1)];      
						break;
					case 1n:   
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+2)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-2+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 2n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)-2+Grid.Grid_YMax)%Grid.Grid_YMax];      
						break;
					case 3n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-2+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-2+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 4n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-2+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1))];   
						break;
					case 5n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-2+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)+2)%Grid.Grid_YMax];
						break;
					case 6n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)+2)%Grid.Grid_YMax]; 
						break;
					case 7n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+2)%Grid.Grid_XMax,(AgentList(p).getLocation()(1)+2)%Grid.Grid_YMax];
						break;
					}	
					//Judge whether to be null or has not been moved.
					if(AgentList.dist.operator()(MoveTo_p(0)) != here){
						canMove = at(AgentList.dist.operator()(MoveTo_p(0))) (AgentList(MoveTo_p(0)).getLabel()==0n && (!AgentList(MoveTo_p(0)).getHasMoved()));
					}else{
						canMove = (AgentList(MoveTo_p(0)).getLabel()==0n && (!AgentList(MoveTo_p(0)).getHasMoved()));
					}
					
					if(canMove){
						//Console.OUT.println("捕猎者 "+p+" 从 "+p+" 移动到了 "+MoveTo_p(0)+" !"+" from "+here);
						moved=true;
						//change datas
						if(AgentList.dist.operator()(MoveTo_p(0)) != here){
							finish at(AgentList.dist.operator()(MoveTo_p(0))) async{
								AgentList(MoveTo_p(0)).setLabel(1n);
								AgentList(MoveTo_p(0)).setState(1n);
								AgentList(MoveTo_p(0)).setHasMoved(true);
							}
						}else{
							AgentList(MoveTo_p(0)).setLabel(1n);
							AgentList(MoveTo_p(0)).setState(1n);
							AgentList(MoveTo_p(0)).setHasMoved(true);
						}
						
						AgentList(p).setHasMoved(true);
						AgentList(p).setLabel(0n);
						AgentList(p).setState(0n);
						return;
					}
					
				}//endif==2n
			}//endfor
			
			/*
			//if no meet prey,find a null to move
			for(i in Predator_neighbors){
				//when Predator meets Prey.
				if(Predator_neighbors(i)==0n){
					var canMove:Boolean = true;
					switch(i(0) as Int){
					case 0n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, AgentList(p).getLocation()(1)];      
						break;
					case 1n:   
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 2n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];      
						break;
					case 3n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax];
						break;
					case 4n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1))];   
						break;
					case 5n:    
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax, (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					case 6n:
						MoveTo_p(0)=[AgentList(p).getLocation()(0), (AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax]; 
						break;
					case 7n:
						MoveTo_p(0)=[(AgentList(p).getLocation()(0)+1)%Grid.Grid_XMax,(AgentList(p).getLocation()(1)+1)%Grid.Grid_YMax];
						break;
					}	
					//Judge whether to be null or has not been moved.
					canMove = at(AgentList.dist.operator()(MoveTo_p(0))) (AgentList(MoveTo_p(0)).getLabel()==0n && (!AgentList(MoveTo_p(0)).getHasMoved()));
					if(canMove){
						//Console.OUT.println("捕猎者 "+p+" 从 "+p+" 移动到了 "+MoveTo_p(0)+" !"+" from "+here);
						moved=true;
						//change datas
						if(AgentList.dist.operator()(MoveTo_p(0)) != here){
							finish at(AgentList.dist.operator()(MoveTo_p(0))) async{
								AgentList(MoveTo_p(0)).setLabel(1n);
								AgentList(MoveTo_p(0)).setState(1n);
								AgentList(MoveTo_p(0)).setHasMoved(true);
							}
						}else{
							AgentList(MoveTo_p(0)).setLabel(1n);
							AgentList(MoveTo_p(0)).setState(1n);
							AgentList(MoveTo_p(0)).setHasMoved(true);
						}
						
						AgentList(p).setHasMoved(true);
						AgentList(p).setLabel(0n);
						AgentList(p).setState(0n);
						return;
					}
					
				}//endif==2n
			}//endfor
			*/
			if(!moved){
				//Console.OUT.println("捕猎者 "+p+" 从 "+p+" 移动到了 "+MoveTo_p(0)+" !"+" from "+here);
			}
		}//end if		
		
	}
	
	public def ShowAgent()
	{
		
		PreyCount = 0;
		PredatorCount = 0;	
		//show Predator and Prey.
		//Console.OUT.println("   "+"Show Predator in Place "+ here.id +".");
		finish for(po in AgentList|here)
		{
			if(AgentList(po).getState()==1n){
				if(AgentList(po).getLabel()==1n)
				{
					atomic PredatorCount++;
					//Console.OUT.println("   Predator："+ AgentList(po).getLocation());	
				}
				if(AgentList(po).getLabel()==2n)
				{
					atomic PreyCount++;
					//Console.OUT.println("   Prey："+ AgentList(po).getLocation());	
				}
			}
			
		}
		
		//Console.OUT.println("   "+"Show Prey in Place "+ here.id +".");
		
		//Console.OUT.println("--------------PreyCount："+PreyCount+" , PredatorCount: "+PredatorCount+" in "+here+"  --------------");
		//DC.RecordWrite(""+PreyCount+"\t"+PredatorCount);
	}
	
	public def initMoved():void{
		finish  for(po in AgentList|here)
		{	
			AgentList(po).setHasMoved(false);
		}
	}
	
	
	public def Count():Long{
		PreyCount = 0n;
		PreyCount = finish(Reducible.SumReducer[Long]()) {
			for(q in AgentList.dist.places())
				async at(q){
				var myResult:Long = 0L;
				finish for(p in AgentList|here){
					if(AgentList(p).getLabel()==2n && AgentList(p).getState()==1n){
						atomic myResult++;
					}
				}
				offer myResult;
			}
		};
		//Console.OUT.println(""+PreyCount+"\t"+here);
		//Console.OUT.println(""+PreyCount);
		//DC.RecordWrite(""+PreyCount+"\t"+here);
		return PreyCount;
	}
	
}
