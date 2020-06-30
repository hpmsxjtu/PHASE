import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;
public class Model {
	private val runner: ScheduleRunner;
	private var LiveCount:Long;
	private val CAList:DistArray[ModelAgent](2);
	private val Reg:Region(2);
	private val DC:DataCollection;
	
	public def this()
	{   
		LiveCount=0;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		CAList=DistArray.make[ModelAgent](D,(p:Point(2))=>null);
		runner = new ScheduleRunner();
		DC = new DataCollection();
	}
/*	
	public def init()
	{
		for(q in CAList.dist.places())
			async at(q)
		{
			
			while(LiveCount<400/CAList.dist.numPlaces())//Here numPlaces() return the number of the places of the Distarray
			{
				val ran=new Random();
				p:Point(2) = [((ran.nextDouble()*Grid.Grid_XMax) as Int), 
				              ((ran.nextDouble()*Grid.Grid_YMax) as Int)];	
				if(CAList.dist.operator()(p)==here&&CAList(p)==null)
				{
					CAList(p)=new ModelAgent(p,1 as Int);
					LiveCount++;
				}  
			} 
		}
	}
 */
	public def initSchedule():void
	{
	
		val eventsum=new GameOfLifeEventSequence();
		//runner.scheduleStopEvent(20,new ScheduleStopFunctor(runner));
		//runner.scheduleEvent(2, new ScheduleMethodFunctor(eventsum,1n));
		//runner.scheduleEvent(3,3, new ScheduleMethodFunctor(eventsum,2n));
		
		//runner.scheduleEvent(4,3, new ScheduleMethodFunctor(eventsum,3n));
	//	runner.scheduleEvent(4, 2.5, new MethodFunctor(eventsum,3n));
		
		//runner.scheduleEvent(1, 2, new MethodFunctor(context.getAgent([300]),1));
	}
	
	public def step():void{
		
	}
	
	public def getRunner(): ScheduleRunner{
		return runner;
	}
	
}