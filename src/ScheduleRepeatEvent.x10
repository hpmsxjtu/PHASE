/**
 * One type of ScheduledEvent, which will be invoke only once.
 */
public class ScheduleRepeatEvent extends ScheduledEvent{
	/**
	 * @ parameter: interval. Determine how long the this event to be invoked next time.
	 */
	private var interval:double = 0.0;
	
	public def this(start:double, interval:double, event:ScheduleSimEvent){
		this.start = start;
		this.interval = interval;
		this.event = event;
	}
	
	/**
	 * Return true if this event is rescheduled on the specified queue, otherwise false;
	 * It also should to modify the tick of the event for it to be scheduled next time.
	 */
	public def reschedule(val queue: SchedulePriorityQueue):boolean{
		var tick: double = event.getTick();
		tick += interval;
		event.setTick(tick);
		
		/**
		 * Or queue.push(new RepeatingEvent(tick,interval,event)); ?
		 * No.
		 */
		queue.push(this);
		return true;
	}
}