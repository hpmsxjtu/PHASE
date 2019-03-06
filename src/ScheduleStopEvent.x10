/**
 * Implements the ScheduledEvent.
 * Use to stop the simulation at the specific tick,
 * In fact it is set the "go" to false.
 */

public class ScheduleStopEvent extends ScheduledEvent{
	public def this(start: double, event: ScheduleSimEvent){
		this.start = start;
		this.event = event;
	}
	
	/**
	 * This always return false, to identify that it will not invoke again after the first time.
	 */
	public def reschedule(val queue: SchedulePriorityQueue):boolean{
		return false;
	}
}