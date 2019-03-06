/**
 * The schedule, which will determine the sequence of the scheduled event.
 * Everyone schedule has the only one queue.
 */
@x10.runtime.impl.java.X10Generated
public class Schedule extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Schedule> $RTT = 
        x10.rtt.NamedType.<Schedule> make("Schedule",
                                          Schedule.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Schedule $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Schedule.class + " calling"); } 
        $_obj.EndTick = $deserializer.readDouble();
        $_obj.currentTick = $deserializer.readDouble();
        $_obj.queue = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Schedule $_obj = new Schedule((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.EndTick);
        $serializer.write(this.currentTick);
        $serializer.write(this.queue);
        
    }
    
    // constructor just for allocation
    public Schedule(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "D:/x10ws/ASDC2/src/Schedule.x10"
    public SchedulePriorityQueue queue;
    
    //#line 8 "D:/x10ws/ASDC2/src/Schedule.x10"
    public double currentTick;
    
    //#line 10 "D:/x10ws/ASDC2/src/Schedule.x10"
    public double EndTick;
    
    
    //#line 15 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * how to init the schedule ???
	 */
    // creation method for java code (1-phase java constructor)
    public Schedule() {
        this((java.lang.System[]) null);
        Schedule$$init$S();
    }
    
    // constructor for non-virtual call
    final public Schedule Schedule$$init$S() {
         {
            
            //#line 15 "D:/x10ws/ASDC2/src/Schedule.x10"
            
            
            //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
            this.__fieldInitializers_Schedule();
            
            //#line 16 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15686 = ((SchedulePriorityQueue)(new SchedulePriorityQueue((java.lang.System[]) null).SchedulePriorityQueue$$init$S()));
            
            //#line 16 "D:/x10ws/ASDC2/src/Schedule.x10"
            this.queue = ((SchedulePriorityQueue)(t$15686));
            
            //#line 17 "D:/x10ws/ASDC2/src/Schedule.x10"
            this.currentTick = 0.0;
            
            //#line 18 "D:/x10ws/ASDC2/src/Schedule.x10"
            this.EndTick = 0.0;
        }
        return this;
    }
    
    
    
    //#line 28 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * Schedule fun at start, and return the scheduled event.
	 * From parameter that has only start, we can know that it's OneTimeEvent.
	 * 
	 * @ parameter: fun.	Before excuting, it should pass the fact fun, which maybe a methodFuctor,
	 * 						that wrapped the object's action.
	 */
    public ScheduledEvent schedule_event(final double start, final Functor fun) {
        
        //#line 32 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleSimEvent evt = new ScheduleSimEvent((java.lang.System[]) null).ScheduleSimEvent$$init$S();
        
        //#line 34 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setFun(((Functor)(fun)));
        
        //#line 35 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setTick((double)(start));
        
        //#line 40 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleOneTimeEvent event = new ScheduleOneTimeEvent((java.lang.System[]) null).ScheduleOneTimeEvent$$init$S(((double)(start)), ((ScheduleSimEvent)(evt)));
        
        //#line 45 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15687 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 45 "D:/x10ws/ASDC2/src/Schedule.x10"
        t$15687.push(((ScheduledEvent)(event)));
        
        //#line 50 "D:/x10ws/ASDC2/src/Schedule.x10"
        return event;
    }
    
    
    //#line 60 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * Schedule fun at start, and repeat schedule it every interval, last return the scheduled event.
	 * From parameter that has both start, and interval, we can know that it's RepeatingEvent.
	 * 
	 * @ parameter: fun.	Before excuting, it should pass the fact fun, which maybe a methodFuctor,
	 * 						that wrapped the object's action.
	 */
    public ScheduledEvent schedule_event(final double start, final double interval, final Functor fun) {
        
        //#line 64 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleSimEvent evt = new ScheduleSimEvent((java.lang.System[]) null).ScheduleSimEvent$$init$S();
        
        //#line 65 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setFun(((Functor)(fun)));
        
        //#line 66 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setTick((double)(start));
        
        //#line 71 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleRepeatEvent event = new ScheduleRepeatEvent((java.lang.System[]) null).ScheduleRepeatEvent$$init$S(((double)(start)), ((double)(interval)), ((ScheduleSimEvent)(evt)));
        
        //#line 76 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15688 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 76 "D:/x10ws/ASDC2/src/Schedule.x10"
        t$15688.push(((ScheduledEvent)(event)));
        
        //#line 83 "D:/x10ws/ASDC2/src/Schedule.x10"
        return event;
    }
    
    
    //#line 86 "D:/x10ws/ASDC2/src/Schedule.x10"
    public ScheduledEvent schedule_stop_event(final double start, final Functor fun) {
        
        //#line 90 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleSimEvent evt = new ScheduleSimEvent((java.lang.System[]) null).ScheduleSimEvent$$init$S();
        
        //#line 92 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setFun(((Functor)(fun)));
        
        //#line 93 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setTick((double)(start));
        
        //#line 98 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleStopEvent event = new ScheduleStopEvent((java.lang.System[]) null).ScheduleStopEvent$$init$S(((double)(start)), ((ScheduleSimEvent)(evt)));
        
        //#line 103 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15689 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 103 "D:/x10ws/ASDC2/src/Schedule.x10"
        t$15689.push(((ScheduledEvent)(event)));
        
        //#line 104 "D:/x10ws/ASDC2/src/Schedule.x10"
        return event;
    }
    
    
    //#line 108 "D:/x10ws/ASDC2/src/Schedule.x10"
    public ScheduledEvent schedule_Endevent(final double start, final Functor fun) {
        
        //#line 112 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleSimEvent evt = new ScheduleSimEvent((java.lang.System[]) null).ScheduleSimEvent$$init$S();
        
        //#line 114 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setFun(((Functor)(fun)));
        
        //#line 115 "D:/x10ws/ASDC2/src/Schedule.x10"
        evt.setTick((double)(start));
        
        //#line 117 "D:/x10ws/ASDC2/src/Schedule.x10"
        this.EndTick = start;
        
        //#line 121 "D:/x10ws/ASDC2/src/Schedule.x10"
        final ScheduleOneTimeEvent event = new ScheduleOneTimeEvent((java.lang.System[]) null).ScheduleOneTimeEvent$$init$S(((double)(start)), ((ScheduleSimEvent)(evt)));
        
        //#line 126 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15690 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 126 "D:/x10ws/ASDC2/src/Schedule.x10"
        t$15690.push(((ScheduledEvent)(event)));
        
        //#line 131 "D:/x10ws/ASDC2/src/Schedule.x10"
        return event;
    }
    
    
    //#line 141 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * This is wrong!!!!!
	 * 
	 * Used to schedule the event of this queue on this queue.
	 */
    public void execute1() {
        
        //#line 142 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15691 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 142 "D:/x10ws/ASDC2/src/Schedule.x10"
        final boolean t$15692 = t$15691.empty$O();
        
        //#line 142 "D:/x10ws/ASDC2/src/Schedule.x10"
        final boolean t$15705 = !(t$15692);
        
        //#line 142 "D:/x10ws/ASDC2/src/Schedule.x10"
        if (t$15705) {
            
            //#line 143 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15693 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 143 "D:/x10ws/ASDC2/src/Schedule.x10"
            ScheduledEvent event = t$15693.top();
            
            //#line 144 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15694 = ((ScheduledEvent)(event));
            
            //#line 144 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduleSimEvent t$15695 = t$15694.getEvent();
            
            //#line 144 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double next = t$15695.getTick$O();
            
            //#line 145 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double currentTick = next;
            
            //#line 150 "D:/x10ws/ASDC2/src/Schedule.x10"
            boolean go = true;
            
            //#line 151 "D:/x10ws/ASDC2/src/Schedule.x10"
            while (true) {
                
                //#line 151 "D:/x10ws/ASDC2/src/Schedule.x10"
                final boolean t$15704 = go;
                
                //#line 151 "D:/x10ws/ASDC2/src/Schedule.x10"
                if (!(t$15704)) {
                    
                    //#line 151 "D:/x10ws/ASDC2/src/Schedule.x10"
                    break;
                }
                
                //#line 157 "D:/x10ws/ASDC2/src/Schedule.x10"
                final SchedulePriorityQueue t$15735 = ((SchedulePriorityQueue)(this.queue));
                
                //#line 157 "D:/x10ws/ASDC2/src/Schedule.x10"
                t$15735.top();
                
                //#line 158 "D:/x10ws/ASDC2/src/Schedule.x10"
                final ScheduledEvent t$15736 = ((ScheduledEvent)(event));
                
                //#line 158 "D:/x10ws/ASDC2/src/Schedule.x10"
                final ScheduleSimEvent t$15737 = t$15736.getEvent();
                
                //#line 158 "D:/x10ws/ASDC2/src/Schedule.x10"
                final Functor fun$15738 = t$15737.getFun();
                
                //#line 159 "D:/x10ws/ASDC2/src/Schedule.x10"
                fun$15738.$apply();
                
                //#line 166 "D:/x10ws/ASDC2/src/Schedule.x10"
                final ScheduledEvent t$15739 = ((ScheduledEvent)(event));
                
                //#line 166 "D:/x10ws/ASDC2/src/Schedule.x10"
                final SchedulePriorityQueue t$15740 = ((SchedulePriorityQueue)(this.queue));
                
                //#line 166 "D:/x10ws/ASDC2/src/Schedule.x10"
                t$15739.reschedule$O(((SchedulePriorityQueue)(t$15740)));
                
                //#line 167 "D:/x10ws/ASDC2/src/Schedule.x10"
                final SchedulePriorityQueue t$15741 = ((SchedulePriorityQueue)(this.queue));
                
                //#line 167 "D:/x10ws/ASDC2/src/Schedule.x10"
                t$15741.pop();
                
                //#line 178 "D:/x10ws/ASDC2/src/Schedule.x10"
                final SchedulePriorityQueue t$15742 = ((SchedulePriorityQueue)(this.queue));
                
                //#line 178 "D:/x10ws/ASDC2/src/Schedule.x10"
                final boolean t$15743 = t$15742.empty$O();
                
                //#line 178 "D:/x10ws/ASDC2/src/Schedule.x10"
                if (t$15743) {
                    
                    //#line 179 "D:/x10ws/ASDC2/src/Schedule.x10"
                    go = false;
                }
            }
        }
        
        //#line 198 "D:/x10ws/ASDC2/src/Schedule.x10"
        return;
    }
    
    
    //#line 204 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * Only execute one event coming from the top of queue every time.
	 */
    public void execute() {
        
        //#line 205 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15706 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 205 "D:/x10ws/ASDC2/src/Schedule.x10"
        final boolean t$15707 = t$15706.empty$O();
        
        //#line 205 "D:/x10ws/ASDC2/src/Schedule.x10"
        final boolean t$15720 = !(t$15707);
        
        //#line 205 "D:/x10ws/ASDC2/src/Schedule.x10"
        if (t$15720) {
            
            //#line 206 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15708 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 206 "D:/x10ws/ASDC2/src/Schedule.x10"
            ScheduledEvent event = t$15708.top();
            
            //#line 207 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15709 = ((ScheduledEvent)(event));
            
            //#line 207 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduleSimEvent t$15710 = t$15709.getEvent();
            
            //#line 207 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15711 = t$15710.getTick$O();
            
            //#line 207 "D:/x10ws/ASDC2/src/Schedule.x10"
            this.currentTick = t$15711;
            
            //#line 208 "D:/x10ws/ASDC2/src/Schedule.x10"
            final x10.io.Printer t$15713 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 208 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15712 = this.currentTick;
            
            //#line 208 "D:/x10ws/ASDC2/src/Schedule.x10"
            final java.lang.String t$15714 = (("currentTick=") + ((x10.core.Double.$box(t$15712))));
            
            //#line 208 "D:/x10ws/ASDC2/src/Schedule.x10"
            t$15713.println(((java.lang.Object)(t$15714)));
            
            //#line 209 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15715 = ((ScheduledEvent)(event));
            
            //#line 209 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduleSimEvent t$15716 = t$15715.getEvent();
            
            //#line 209 "D:/x10ws/ASDC2/src/Schedule.x10"
            final Functor fun = t$15716.getFun();
            
            //#line 210 "D:/x10ws/ASDC2/src/Schedule.x10"
            fun.$apply();
            
            //#line 211 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15717 = ((ScheduledEvent)(event));
            
            //#line 211 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15718 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 211 "D:/x10ws/ASDC2/src/Schedule.x10"
            t$15717.reschedule$O(((SchedulePriorityQueue)(t$15718)));
            
            //#line 212 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15719 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 212 "D:/x10ws/ASDC2/src/Schedule.x10"
            t$15719.pop();
        }
    }
    
    
    //#line 216 "D:/x10ws/ASDC2/src/Schedule.x10"
    public double getCurrentTick$O() {
        
        //#line 217 "D:/x10ws/ASDC2/src/Schedule.x10"
        final double t$15721 = this.currentTick;
        
        //#line 217 "D:/x10ws/ASDC2/src/Schedule.x10"
        return t$15721;
    }
    
    
    //#line 224 "D:/x10ws/ASDC2/src/Schedule.x10"
    /**
	 * Get the next tick at which event should to be excuted at.
	 * If there is no event for schedule, then return -1, or return the first event's tick of this queue.
	 */
    public double getNextTick$O() {
        
        //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
        final SchedulePriorityQueue t$15722 = ((SchedulePriorityQueue)(this.queue));
        
        //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
        boolean t$15728 = t$15722.empty$O();
        
        //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
        if (!(t$15728)) {
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15723 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15724 = t$15723.top();
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduleSimEvent t$15725 = t$15724.getEvent();
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15726 = t$15725.getTick$O();
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15727 = this.EndTick;
            
            //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
            t$15728 = ((double) t$15726) == ((double) t$15727);
        }
        
        //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
        final boolean t$15734 = t$15728;
        
        //#line 225 "D:/x10ws/ASDC2/src/Schedule.x10"
        if (t$15734) {
            
            //#line 226 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15729 = -1.0;
            
            //#line 226 "D:/x10ws/ASDC2/src/Schedule.x10"
            return t$15729;
        } else {
            
            //#line 228 "D:/x10ws/ASDC2/src/Schedule.x10"
            final SchedulePriorityQueue t$15730 = ((SchedulePriorityQueue)(this.queue));
            
            //#line 228 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduledEvent t$15731 = t$15730.top();
            
            //#line 228 "D:/x10ws/ASDC2/src/Schedule.x10"
            final ScheduleSimEvent t$15732 = t$15731.getEvent();
            
            //#line 228 "D:/x10ws/ASDC2/src/Schedule.x10"
            final double t$15733 = t$15732.getTick$O();
            
            //#line 228 "D:/x10ws/ASDC2/src/Schedule.x10"
            return t$15733;
        }
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
    final public Schedule Schedule$$this$Schedule() {
        
        //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
        return Schedule.this;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
    final public void __fieldInitializers_Schedule() {
        
        //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
        this.queue = null;
        
        //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
        this.currentTick = 0.0;
        
        //#line 6 "D:/x10ws/ASDC2/src/Schedule.x10"
        this.EndTick = 0.0;
    }
}

