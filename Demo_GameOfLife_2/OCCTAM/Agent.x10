import x10.regionarray.Array;
import x10.util.Random;
import x10.regionarray.*;
public class Agent {
	private var location:Point(2);//Agent的坐标
	private var state:Int;//Agent状态
	
	private var neighbors:Array[Int];//agent的8个邻居
	//private var overlap1:Array[Int];//Overlapped Region
	//private var overlap2:Array[Int];//Overlapped Region
	

	public def this()
	{
		location=[((new Random().nextDouble()*Grid.Grid_XMax) as Int)+1, ((new Random().nextDouble()*Grid.Grid_YMax) as Int)+1];//������Ϸ����Agentλ�ñ�ʶ
		state=0 as Int;	//表示Agent状态
		neighbors=new Array[Int](8,0 as Int);//agent周围8个位置，初始值为0
		//重叠区先设置为：0-4
		val  R1 = Region.make(0..4, 0..(Grid.Grid_YMax-1)); 
		// overlap1=new Array[Int](R1,0 as Int);
		// overlap2=new Array[Int](R1,0 as Int);
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
	public def getState():Int
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