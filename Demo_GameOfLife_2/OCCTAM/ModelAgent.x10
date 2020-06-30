import x10.util.Random;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.regionarray.Array;
import x10.regionarray.Dist;
public class ModelAgent {
	private var location:Point(2);
	private var state:Int;
	private var neighbors:Array[Int](1);

	public def this()
	{
		location=[((new Random().nextDouble()*Grid.Grid_XMax) as Int)+1, ((new Random().nextDouble()*Grid.Grid_YMax) as Int)+1];
		state=1n;	
		neighbors=new Array[Int](8,0n);
	}
	public def this(p:Point(2),s:Int)
	{
		location=p;
		state=s;
		neighbors=new Array[Int](8,0n);
	}
	public def getLocation():Point(2)
	{
		return location;
	}
	public def getState():Long
	{
		return state;
	}
	public def setState(sta:Int)
	{
		state=sta;
	}
	public def getNeighbors():Array[Int]
	{
		return neighbors;
	}
	public def setNeighbors(neigh:Array[Int])
	{
		neighbors=neigh;
	}
}