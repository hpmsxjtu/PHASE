/**
 * only wrapped the agent's act to be a SimEvent, which has the tick.
 */

public class ScheduleSimEvent {
	/**
	 * tick used for sort in heap.
	 */
	private var tick: double;
	private var fun: Functor;
	
	public def this(){
		tick = 0.0 as double;
		fun = null;
	}
	
	public def this(tick:double, fun:Functor){
		this.tick = tick;
		this.fun = fun;
	}
	
	public def getTick():double{
		return tick;
	}
	
	public def setTick(tick:double):void{
		this.tick = tick;
	}
	
	public def getFun():Functor{
		return fun;
	}
	
	public def setFun(var fun:Functor):void{
		this.fun = fun;
	}
}