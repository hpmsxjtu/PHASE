import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;

public class EventSequence {
	// gjm_delcode
	// public var LiveCount:Long;
	// public var LiveCountBorn:Long;
	// public var LiveCountDead:Long;	
	public val AgentList:DistArray[Agent](2);
	public val Reg:Region(2);
	public val DC:DataCollection;
	
	public def this()
	{
		// LiveCount=0 as Long;
		// LiveCountBorn=0 as Long;
		// LiveCountDead=0 as Long;
		Reg = Region.make((0..(Grid.Grid_XMax-1)),(0..(Grid.Grid_YMax-1)));
		val D=Dist.makeBlockBlock(Reg);
		AgentList=DistArray.make[Agent](D,(p:Point(2))=>null);
		DC = new DataCollection();
	}
	
	public def step1():void
	{
		// init();
		// AgentNeighborState();
		
		Console.OUT.println("LP_"+here.id+"  我是第1件要做的事情");
	}
	public def step2():void
	{
		// Interactive();
		// AgentNeighborState();
		
		Console.OUT.println("LP_"+here.id+"  我是第2件要做的事情");
	}
	public def step3():void
	{
		
		// Display();
		
		Console.OUT.println("LP_"+here.id+"  我是第3件要做的事情");
	}
	
}