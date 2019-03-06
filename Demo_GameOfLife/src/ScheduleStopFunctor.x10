/**
 * Wrapped ScheduleRunner's functor of stop.
 */

public class ScheduleStopFunctor extends Functor {
	private var sr: ScheduleRunner;
	
	public def this(sr: ScheduleRunner){
		this.sr = sr;
	}
	
	public operator this(){
		sr.stop();
	}
}