import x10.regionarray.Array;
import x10.util.Random;
import x10.array.Array_1;


public class Agent {
	
	private var state:Int;//Agent×´Ì¬ÐÅÏ¢1-live,0-dead;
	private var location:Point(2);	
	//AddCode
	private var label:Int;//0-null,1-predator,2-prey;
	
	private var neighbors:Array[Int];
	private var dist:Long;
	private var belong:Long;
	private var hasMoved:Boolean;//
	
	public def this(location:Point(2))
	{
		state = 0n;//1-live,0-dead;
		label = 0 as Int;
		this.location=location;	
		//neighbors=new Array[Int](8,0 as Int);
		dist=-1;
		belong=-1;
		hasMoved=false;
	}
	public def this(location:Point(2),label:Int)
	{
		state = 1n;//1-live,0-dead;
		this.label = label;
		this.location=location;		
		//neighbors=new Array[Int](8,0 as Int);
		dist=-1;
		belong=-1;
		hasMoved=false;
	}
	public def setState(state:Int):void{
		this.state=state;
	}
	public def getState():Int{
		return state;
	}
	public def setLabel(label:Int):void{
		this.label=label;
	}
	public def getLabel():Int{
		return label;
	}
	public def getLocation():Point(2)
	{
		return location;
	}
	public def setLocation(location:Point(2)):void
	{
		this.location=location;
	}
	
	public def getNeighbors():Array[Int]
	{
		return neighbors;
	}
	public def setNeighbors(neighbors:Array[Int])
	{
		this.neighbors=neighbors;
	}
	public def getDist():Long
	{
		return dist;
	}
	public def setDist(dist:Long)
	{
		this.dist=dist;
	}
	public def getBelong():Long
	{
		return belong;
	}
	public def setBelong(belong:Long)
	{
		this.belong=belong;
	}
	public def setHasMoved(hasMoved:Boolean):void{
		this.hasMoved=hasMoved;
	}
	public def getHasMoved():Boolean{
		return hasMoved;
	}
}