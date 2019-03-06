/**
 * wrapped the SimEvent by specify the tick, at which the SimEvent will be scheduled//SimEvent\u93c4\u75f5imulationEvent
 */
@x10.runtime.impl.java.X10Generated
abstract public class ScheduledEvent extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduledEvent> $RTT = 
        x10.rtt.NamedType.<ScheduledEvent> make("ScheduledEvent",
                                                ScheduledEvent.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduledEvent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduledEvent.class + " calling"); } 
        $_obj.event = $deserializer.readObject();
        $_obj.start = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.event);
        $serializer.write(this.start);
        
    }
    
    // constructor just for allocation
    public ScheduledEvent(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    /**
	 * Both event and start are protected, so that their subclasses will inherent them from them.
	 */
    public ScheduleSimEvent event;
    
    //#line 14 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    /**
	 * The tick at which the SimEvent will be begin be scheduled
	 */
    public double start;
    
    
    //#line 17 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    
    // constructor for non-virtual call
    final public ScheduledEvent ScheduledEvent$$init$S() {
         {
            
            //#line 17 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.__fieldInitializers_ScheduledEvent();
            
            //#line 18 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.event = null;
            
            //#line 19 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            final double t$15468 = 0.0;
            
            //#line 19 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.start = t$15468;
        }
        return this;
    }
    
    
    
    //#line 22 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    
    // constructor for non-virtual call
    final public ScheduledEvent ScheduledEvent$$init$S(final double start, final ScheduleSimEvent event) {
         {
            
            //#line 22 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.__fieldInitializers_ScheduledEvent();
            
            //#line 23 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.start = start;
            
            //#line 24 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            this.event = ((ScheduleSimEvent)(event));
        }
        return this;
    }
    
    
    
    //#line 30 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    /**
	 * Return true if this event is rescheduled on the specified queue, otherwise false;
	 */
    abstract public boolean reschedule$O(final SchedulePriorityQueue queue);
    
    
    //#line 32 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    public ScheduleSimEvent getEvent() {
        
        //#line 33 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final ScheduleSimEvent t$15469 = ((ScheduleSimEvent)(this.event));
        
        //#line 33 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        return t$15469;
    }
    
    
    //#line 39 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    /**
	 * To compare by their tick, if this'tick is greater, then return 1, or 0.
	 */
    public int compare$O(final ScheduledEvent other) {
        
        //#line 40 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final ScheduleSimEvent t$15470 = ((ScheduleSimEvent)(this.event));
        
        //#line 40 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final double tick1 = t$15470.getTick$O();
        
        //#line 41 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final ScheduleSimEvent t$15471 = other.getEvent();
        
        //#line 41 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final double tick2 = t$15471.getTick$O();
        
        //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final boolean t$15472 = ((tick1) >= (((double)(tick2))));
        
        //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        int t$15473 =  0;
        
        //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        if (t$15472) {
            
            //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            t$15473 = 1;
        } else {
            
            //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
            t$15473 = 0;
        }
        
        //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        final int t$15474 = t$15473;
        
        //#line 45 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        return t$15474;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    final public ScheduledEvent ScheduledEvent$$this$ScheduledEvent() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        return ScheduledEvent.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
    final public void __fieldInitializers_ScheduledEvent() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        this.event = null;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduledEvent.x10"
        this.start = 0.0;
    }
}

