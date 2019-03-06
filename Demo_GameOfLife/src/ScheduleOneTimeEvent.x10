/**
 * One type of ScheduledEvent, which will be invoke only once.
 */

public class ScheduleOneTimeEvent extends ScheduledEvent{
	public def this(start:double, event: ScheduleSimEvent){
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