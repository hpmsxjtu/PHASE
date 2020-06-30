import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;

public class GameOfLifeModel {
	
	public var LiveCount:Long;
	public val AgentList:DistArray[Agent](2);
	public val Reg:Region(2);
	private val runner:ScheduleRunner;
	
	public def this()
	{
		LiveCount=0 as Long;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		AgentList=DistArray.make[Agent](D,(p:Point(2))=>null);
		runner = new ScheduleRunner();
	}
	
	public def initSchedule(eventsum:GameOfLifeEventSequence):void
	{
		

		// runner.scheduleEvent(1, new ScheduleMethodFunctor(eventsum,2n));	
		// runner.scheduleEvent(2, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(8, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(7, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(6, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(20, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(19, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(18, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(17, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(16, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(16, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(15, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(14, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(13, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(12, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(11, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(10, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(9, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(5, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(3, new ScheduleMethodFunctor(eventsum,2n));
		

		//调度1：grid:200*200 setting:20000 overlap:8 96次 20960ms
		//调度1：grid:200*200 setting:20000 overlap:7 100次 20618ms
		//调度1：grid:200*200 setting:20000 overlap:7 100次 20618ms
		//调度1：grid:500*500 setting:200000 overlap:7 100次 86694ms
		//调度2：grid:200*200 setting:20000 overlap:7 100次 18156ms
		//调度2：grid:500*500 setting:200000 overlap:7 100次 70045ms
		for(n in 1..200){
			runner.scheduleEvent(n, new ScheduleMethodFunctor(eventsum,2n));
		}
		//runner.scheduleEvent(2, new ScheduleMethodFunctor(eventsum,3n));
		
		//runner.scheduleEvent(4, 2.5, new MethodFunctor(eventsum,3n));
		//runner.scheduleEvent(1, 2, new MethodFunctor(context.getAgent([300]),1));
	}
	
	public def step():void{
		
	}
	
	public def getRunner(): ScheduleRunner{
		return runner;
	}
	
	
}