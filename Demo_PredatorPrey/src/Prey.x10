import x10.regionarray.Array;

public class Prey extends Agent{
	private val label:Int;//2
	private var neighbors:Array[Int];
	
	public def this(location:Point(2))
	{
		super(location);
		label = 2n;
		neighbors=new Array[Int](8,0 as Int);
	}
	public def this(location:Point(2),label:Int)
	{
		super(location,label);
		this.label=label;
		neighbors=new Array[Int](8,0 as Int);
	}
	
}