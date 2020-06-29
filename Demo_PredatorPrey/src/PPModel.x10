import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;

public class PPModel {
	
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
	
	public def initSchedule():void
	{
		
		val eventsum=new PPEventSequence();
		runner.scheduleStopEvent((Setting.Iteration_Step+1),new ScheduleStopFunctor(runner));
		runner.scheduleEvent(0, new ScheduleMethodFunctor(eventsum,1n));
		// runner.scheduleEvent(1, new ScheduleMethodFunctor(eventsum,3n));
		runner.scheduleEvent(1, 3, new ScheduleMethodFunctor(eventsum,4n));//showAgent+initMoved
		runner.scheduleEvent(2, 3, new ScheduleMethodFunctor(eventsum,2n));//saveAgentNeighbors
		runner.scheduleEvent(3, 3, new ScheduleMethodFunctor(eventsum,3n));//Interactive
		
		
		// runner.scheduleEvent(1, 1, new ScheduleMethodFunctor(eventsum,2n));
		// runner.scheduleEvent(2, 1, new ScheduleMethodFunctor(eventsum,3n));
		// runner.scheduleEvent(3, 1, new ScheduleMethodFunctor(eventsum,4n));
		//runner.scheduleEvent(4, 2.5, new MethodFunctor(eventsum,3n));
		//runner.scheduleEvent(1, 2, new MethodFunctor(context.getAgent([300]),1));
	}
	
	public def step():void{
		
	}
	
	public def getRunner(): ScheduleRunner{
		return runner;
	}
	
	
}