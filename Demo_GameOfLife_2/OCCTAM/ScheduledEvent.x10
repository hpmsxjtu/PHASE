/**
 * wrapped the SimEvent by specify the tick, at which the SimEvent will be scheduled//SimEvent是simulationEvent
 */

public abstract class ScheduledEvent {
	/**
	 * Both event and start are protected, so that their subclasses will inherent them from them.
	 */
	protected var event:ScheduleSimEvent;
	
	/**
	 * The tick at which the SimEvent will be begin be scheduled
	 */
	protected var start: double;
	
	
	public def this(){
		event = null;
		start = 0.0 as double;
	}
	
	public def this(start:double, event:ScheduleSimEvent){
		this.start = start;
		this.event = event;
	}
	
	/**
	 * Return true if this event is rescheduled on the specified queue, otherwise false;
	 */
	public abstract def reschedule(val queue: SchedulePriorityQueue):boolean;
	
	public def getEvent():ScheduleSimEvent{
		return event;
	}
	
	/**
	 * To compare by their tick, if this'tick is greater, then return 1, or 0.
	 */
	public def compare(other:ScheduledEvent):int{
		val tick1: double = event.getTick();
		val tick2: double = other.getEvent().getTick();
		/**
		 * If tick1 == tick2, then we also think that tick1 is bigger than tick2.
		 */
		return tick1 >= tick2 ? 1n : 0n;
	}
}