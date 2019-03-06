import x10.regionarray.Array;
import x10.util.Random;

public class Agent {
	private var location:Point(2);//Agent位置信息
	private var state:Int;//Agent状态信息
	
	//AddCode
	private var neighbors:Array[Int];//生命游戏——邻居

	public def this()
	{
		location=[((new Random().nextDouble()*Grid.Grid_XMax) as Int)+1, ((new Random().nextDouble()*Grid.Grid_YMax) as Int)+1];//生命游戏——Agent位置标识
		state=0 as Int;	//生命游戏——Agent存活  0存活  1死亡
		neighbors=new Array[Int](8,0 as Int);//生命游戏——Agent邻居
	}
	public def this(po:Point(2),s:Int)
	{
		location=po;
		state=s;
		neighbors=new Array[Int](8,0 as Int);
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