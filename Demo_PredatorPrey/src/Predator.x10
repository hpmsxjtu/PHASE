import x10.regionarray.Array;

public class Predator extends Agent{
	private val label:Int;//1
	private var neighbors:Array[Int];
	
	public def this(location:Point(2))
	{
		super(location);
		label=1n;
		neighbors=new Array[Int](8,0 as Int);
	}
	public def this(location:Point(2),label:Int)
	{
		super(location,label);
		this.label=label;
		neighbors=new Array[Int](8,0 as Int);
	}
	
	
}