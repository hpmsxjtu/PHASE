/**
 * The schedule, which will determine the sequence of the scheduled event.
 * Everyone schedule has the only one queue.
 */

public class Schedule {
	private var queue: SchedulePriorityQueue;
	private var currentTick: double;
	//锟斤拷锟斤拷锟芥储全锟斤拷锟斤拷小tick
	private var globalTick: double;
	
	private var EndTick: double;//20180312 stop
	
	/**
	 * how to init the schedule ???
	 */
	public def this(){
		queue = new SchedulePriorityQueue();
		currentTick = 0.0;
		globalTick = 0.0;
		EndTick = 0.0;
	}
	
	/**
	 * Schedule fun at start, and return the scheduled event.
	 * From parameter that has only start, we can know that it's OneTimeEvent.
	 * 
	 * @ parameter: fun.	Before excuting, it should pass the fact fun, which maybe a methodFuctor,
	 * 						that wrapped the object's action.
	 */
	public def schedule_event(start:double, fun:Functor):void{
		/**
		 * Create a new SimEvent with start and fun.
		 */
		val evt: ScheduleSimEvent = new ScheduleSimEvent();

		evt.setFun(fun);
		evt.setTick(start);

		/**
		 * Wrapped this SimEvent to a ScheduledEvent, here it is OneTimeEvent.
		 */
		val event: ScheduleOneTimeEvent = new ScheduleOneTimeEvent(start, evt);

		/**
		 * Push this event into the queue.
		 */
		queue.push(event);

	}
	
	/**
	 * Schedule fun at start, and repeat schedule it every interval, last return the scheduled event.
	 * From parameter that has both start, and interval, we can know that it's RepeatingEvent.
	 * 
	 * @ parameter: fun.	Before excuting, it should pass the fact fun, which maybe a methodFuctor,
	 * 						that wrapped the object's action.
	 */
	public def schedule_event(start:double, interval:double, fun:Functor):void{
		/**
		 * Create a new SimEvent with start and fun.
		 */
		val evt:ScheduleSimEvent = new ScheduleSimEvent();
		evt.setFun(fun);
		evt.setTick(start);
		
		/**
		 * Wrapped this SimEvent to a RepeatingEvent.
		 */
		val event: ScheduleRepeatEvent = new ScheduleRepeatEvent(start, interval, evt);
		
		/**
		 * Push this event in the queue.
		 */
		queue.push(event);
		
		/**
		 * Return this event.
		 * 
		 */
		//Console.OUT.println("Already in ScheduleEvent at Place " + here.id);
		//return event;
	}

	public def schedule_stop_event(start:double, fun:Functor):void{
		/**
		 * Create a new SimEvent with start and fun.
		 */
		val evt: ScheduleSimEvent = new ScheduleSimEvent();

		evt.setFun(fun);
		evt.setTick(start);

		/**
		 * Wrapped this SimEvent to a ScheduledEvent, here it is OneTimeEvent.
		 */
		val event: ScheduleStopEvent = new ScheduleStopEvent(start, evt);

		/**
		 * Push this event into the queue.
		 */
		queue.push(event);
		//return event;
	}

	//schedule_stop_event is not work,redo it. 20180312
	public def schedule_Endevent(start:double, fun:Functor):ScheduledEvent{
		/**
		 * Create a new SimEvent with start and fun.
		 */
		val evt: ScheduleSimEvent = new ScheduleSimEvent();
		
		evt.setFun(fun);
		evt.setTick(start);
		
		EndTick = start;
		/**
		 * Wrapped this SimEvent to a ScheduledEvent, here it is OneTimeEvent.
		 */
		val event: ScheduleOneTimeEvent = new ScheduleOneTimeEvent(start, evt);

		/**
		 * Push this event into the queue.
		 */
		queue.push(event);

		/**
		 * Return this event.
		 */
		return event;
	}


	
	/**
	 * This is wrong!!!!!
	 * 
	 * Used to schedule the event of this queue on this queue.
	 */
	public def execute1():void{
		if(!queue.empty()){
			var event:ScheduledEvent = queue.top();
			val next: double = event.getEvent().getTick();
			val currentTick: double = next;
			
			/**
			 * It's true of go when inited.
			 */
			var go:boolean = true;
			while(go){
				/**
				 * Schedule the first event of queue, by invoke fun();
				 * How to specify the parameter of fun?
				 * 		Pass the i in MethodFunctor!
				 */
				queue.top();
				val fun: Functor = event.getEvent().getFun();
				fun();	
				
				/**
				 * If this event will be scheduled again, that is if this event is a RepeatingEvent?
				 * By invoke the reschedule() we can know this.
				 */
				//val isLive: boolean = event.reschedule(queue);
				event.reschedule(queue);
				queue.pop();
				
				/**
				 * If it's only an OneTimeEvent, pop it out in order to invoke the next event of this queue.
				 */
				/*
				 * if(! isLive){
				 * queue.pop();
				 * }
				 */
				
				if(queue.empty()){
					go = false;
				}
				
				/**
				 * After pop the first event, then if there is also an event in this queue for schedule?
				 * If there isn't, modify the go to false.
				 * Or, there is also event in this queue, get it.
				 */
				/**
				 * if(queue.empty()){
				 * go = false;
				 * }else{
				 * event = queue.pop();
				 * 
				 * go = (event.getEvent().getTick() == next);
				 * }	
				 */
			}
		}
		return;
	}
	
	/**
	 * Only execute one event coming from the top of queue every time.
	 */
	public def execute():void{
		if(!queue.empty()){
			var event:ScheduledEvent = queue.top();
			 currentTick = event.getEvent().getTick();
			 Console.OUT.println("excuting"+"tick="+currentTick+" event");
			val fun: Functor = event.getEvent().getFun();
			fun();  
			//Console.OUT.println("璧板埌fun()");
			//event.reschedule(queue);
			queue.pop();
			//Console.OUT.println("璧板畬涓�娆xecute");
		}
	}
	
	public def getCurrentTick():double{
		// return currentTick;
		return queue.top().getEvent().getTick();
	}
	//锟斤拷取锟斤拷锟斤拷schedule锟叫碉拷全锟斤拷锟斤拷小tick
	public def getGlobalTick():double{
		return globalTick;
	}
	public def setGlobalTick(tick:double):void{
		globalTick=tick;
	}
	
	/**
	 * Get the next tick at which event should to be excuted at.
	 * If there is no event for schedule, then return -1, or return the first event's tick of this queue.
	 */
	//||(queue.top().getEvent().getTick())==EndTick锟叫达拷锟斤拷
	public def getNextTick():double{
		if(queue.empty()){
			return -1.0;
		}else{
			return queue.top().getEvent().getTick();
		}
	}
}