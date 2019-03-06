import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;

public class GameOfLifeEventSequence {
	public var LiveCount:Long;
	public var LiveCountBorn:Long;
	public var LiveCountDead:Long;	
	public val AgentList:DistArray[Agent](2);
	public val Reg:Region(2);
	public val DC:DataCollection;
	
	public def this()
	{
		LiveCount=0 as Long;
		LiveCountBorn=0 as Long;
		LiveCountDead=0 as Long;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		AgentList=DistArray.make[Agent](D,(p:Point(2))=>null);
		DC = new DataCollection();
	}
	
	public def step1():void
	{
		init();
		AgentNeighborState();
		//InteractiveInside();
		//Console.OUT.println(here.id+"我是第1件要做的事情");
	}
	public def step2():void
	{
		Interactive();
		AgentNeighborState();
		//react();
		//update();
		//Console.OUT.println(here.id+"我是第2件要做的事情");
	}
	public def step3():void
	{
		//test();
		Display();
		//Console.OUT.println("  "+ here.id +".");
		//col();
		//Console.OUT.println(here.id+"我是第3件要做的事情");
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
		Console.OUT.println("Game of life is initializing in palce "+ here.id);	
		while(LiveCount<Setting.Agent_Quantity/AgentList.dist.numPlaces())//Return the number of the places of the Distarray
		{
			po:Point(2) = [((new Random().nextDouble()*Grid.Grid_XMax) as Int), 
			               ((new Random().nextDouble()*Grid.Grid_YMax) as Int)];	
			if(AgentList.dist.operator()(po)==here&&AgentList(po)==null)
			{
				AgentList(po)=new Agent(po,1 as Int);
				atomic LiveCount++;
				Console.OUT.println("  "+ po +"(at Place"+ here.id +")");
			}  
		}
		Console.OUT.println("  "+"Now the number of agent is "+ LiveCount +" at Place "+ here.id +".");
		for(po in AgentList|here)
		{	
			if(AgentList(po)==null)
				AgentList(po)=new Agent(po,0 as Int);     	
		}
		
	}

	public def AgentNeighborState()
	{	
		//Every Agent checks neighbor.
		for(po in AgentList|here)
		{
			var Neighbor:Array[Int]=new Array[Int](8,0 as Int);
			var AgentState:Int;
			AgentState=AgentList(po).getState() as Int;
			/*
			 * po(0)横坐标   po(1)纵坐标
			 * 3   4   5
			 * 2   po  6  
			 * 1   0   7  
			 */    
			Neighbor(0)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,po(1))) AgentList((po(0)+1)%Grid.Grid_XMax,po(1)).getState() as Int;
			Neighbor(1)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getState() as Int;
			Neighbor(2)= at (AgentList.dist.operator()(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax)) AgentList(po(0),(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getState() as Int;
			Neighbor(3)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax))  AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)-1+Grid.Grid_YMax)%Grid.Grid_YMax).getState() as Int;
			Neighbor(4)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1))) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,po(1)).getState() as Int;
			Neighbor(5)= at (AgentList.dist.operator()((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax)) AgentList((po(0)-1+Grid.Grid_XMax)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getState() as Int;
			Neighbor(6)= at  (AgentList.dist.operator()(po(0),(po(1)+1)%Grid.Grid_YMax)) AgentList(po(0),(po(1)+1)%Grid.Grid_YMax).getState() as Int;
			Neighbor(7)= at (AgentList.dist.operator()((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax))  AgentList((po(0)+1)%Grid.Grid_XMax,(po(1)+1)%Grid.Grid_YMax).getState() as Int;
			
			AgentList(po).setNeighbors(Neighbor);
		}
		
	}
	
	public def Interactive()
	{	
		//Every Agent Interactives.
		LiveCountBorn = 0;
		LiveCountDead = 0;
		Console.OUT.println("\n" +"  " +"Interactiving in Place " + here.id +".");
		for(po in AgentList|here)
		{ 
			var AgentState:Int;
			var NeighborInteractive:Array[Int]=new Array[Int](8,0 as Int);
			var NeighborLiveCount:Int=0 as Int;//NeighborLiveCount should set inside the loop in case of successive incrementing.
			AgentState=AgentList(po).getState() as Int;
			NeighborInteractive=AgentList(po).getNeighbors();
			
			for(j in NeighborInteractive)
			{
				if(NeighborInteractive(j)==1 as Int)
					atomic NeighborLiveCount++;
			}
			
			if(NeighborLiveCount<2 as Int && AgentState!=0 as Int)
			{
				AgentState=0 as Int;
				atomic LiveCountDead-=1;
			}
			
			//if(NeighborLiveCount==2 as Int)
			// 状态恒定，无需判断
			
			if(NeighborLiveCount==3 as Int && AgentState!=1 as Int)
			{
				AgentState=1 as Int;
				atomic LiveCountBorn+=1;
			}
			
			if(NeighborLiveCount>3 as Int && AgentState!=0 as Int)
			{
				AgentState=0 as Int;
				atomic  LiveCountDead-=1;
			}
			
			AgentList(po).setState(AgentState);
			
		}
		Console.OUT.println("  "+"The number of Born Agent (after interactive) is "+ LiveCountBorn +" at Place "+ here.id +".");
		Console.OUT.println("  "+"The number of Dead Agent (after interactive) is "+ LiveCountDead +" at Place "+ here.id +".");
		//var St:String="aa" as String;
		//St = Record。RecordWrite(St);
		//Console.OUT.println(St);
		DC.RecordWrite("  "+"The number of changed Agent (after interactive) is "+ LiveCount +" at Place "+ here.id +".");
			
	}
	
	public def Display()
	{
		var LiveCount:Int=0 as Int;
		Console.OUT.println("  "+"Display in Place("+ here.id +")");	
		finish{ 
		for(po in AgentList|here)
		{
			if(AgentList(po).getState()==1)
			{
				LiveCount++;
				Console.OUT.println("  "+ AgentList(po).getLocation());	
			}		
		}
		Console.OUT.println("  "+"The number of Agent (StepEnd) is "+ LiveCount +" in Place "+ here.id );
		}
		//gjm_addCode
		// finish for(po in AgentList|here)
		// {
		// 	
		// 		// Console.OUT.println("  "+ AgentList(po).getLocation());	
		// 	Console.OUT.println("  "+"The location of Agent (InStep) is "+ AgentList(po).getLocation() +" in Place "+ here.id );
		// }
		
		
	}
	
}