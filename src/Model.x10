import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;
public class Model {
	private val runner: ScheduleRunner;
	//gjm_delcode
	// private var LiveCount:Long;
	private val CAList:DistArray[ModelAgent](2);
	private val Reg:Region(2);
	private val DC:DataCollection;
	
	public def this()
	{   
		// LiveCount=0;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		CAList=DistArray.make[ModelAgent](D,(p:Point(2))=>null);
		runner = new ScheduleRunner();
		DC = new DataCollection();
	}

	public def initSchedule():void
	{
		// Console.OUT.println("The initSchedule is Starting!");
		/*gjm_addCode
		 * The endTick is 20;
		 * the 1n'st event's tick is 0;
		 * the 2n'nd event's tick is 1;
		 * the 3n'rd event's tick is 2;
		 * 
		 * when event starts iteration,
		 * scheduleEvent(int a1,ScheduleMethodFunctor s1) means schedule once;
		 * scheduleEvent(int a2,int b2,ScheduleMethodFunctor s2) means reSchedule more times;
		 * the second para 'b2' means next time schduled tick is (tick+b);
		 * until tick > a(a is the first para in scheduleStopEvent(int a,ScheduleStopFunctor s))
		 * 
		 * Eg:012,67,1112,1617,over;
		 */
		val eventsum=new EventSequence();
		runner.scheduleStopEvent(20,new ScheduleStopFunctor(runner));//20
		runner.scheduleEvent(0, new ScheduleMethodFunctor(eventsum,1n));//2
		runner.scheduleEvent(1,5, new ScheduleMethodFunctor(eventsum,2n));//3.3
		runner.scheduleEvent(2,5, new ScheduleMethodFunctor(eventsum,3n));//4.3
		
		// runner.scheduleStopEvent(10,new ScheduleStopFunctor(runner));//20
		// runner.scheduleEvent(1, new ScheduleMethodFunctor(eventsum,1n));//2
		// runner.scheduleEvent(5, new ScheduleMethodFunctor(eventsum,2n));//3.3
		// runner.scheduleEvent(3,3, new ScheduleMethodFunctor(eventsum,3n));//4.3
		
	}
	
	public def step():void{
		
	}
	
	public def getRunner(): ScheduleRunner{
		return runner;
	}
	
}