/**
 * One type of ScheduledEvent, which will be invoke only once.
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleRepeatEvent extends ScheduledEvent implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleRepeatEvent> $RTT = 
        x10.rtt.NamedType.<ScheduleRepeatEvent> make("ScheduleRepeatEvent",
                                                     ScheduleRepeatEvent.class,
                                                     new x10.rtt.Type[] {
                                                         ScheduledEvent.$RTT
                                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRepeatEvent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleRepeatEvent.class + " calling"); } 
        ScheduledEvent.$_deserialize_body($_obj, $deserializer);
        $_obj.interval = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleRepeatEvent $_obj = new ScheduleRepeatEvent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.interval);
        
    }
    
    // constructor just for allocation
    public ScheduleRepeatEvent(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 8 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
    /**
	 * @ parameter: interval. Determine how long the this event to be invoked next time.
	 */
    public double interval;
    
    
    //#line 10 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleRepeatEvent(final double start, final double interval, final ScheduleSimEvent event) {
        this((java.lang.System[]) null);
        ScheduleRepeatEvent$$init$S(start, interval, event);
    }
    
    // constructor for non-virtual call
    final public ScheduleRepeatEvent ScheduleRepeatEvent$$init$S(final double start, final double interval, final ScheduleSimEvent event) {
         {
            
            //#line 10 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            /*super.*/ScheduledEvent$$init$S();
            
            //#line 10 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            
            
            //#line 4 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            this.__fieldInitializers_ScheduleRepeatEvent();
            
            //#line 11 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            this.start = start;
            
            //#line 12 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            this.interval = interval;
            
            //#line 13 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
            this.event = ((ScheduleSimEvent)(event));
        }
        return this;
    }
    
    
    
    //#line 20 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
    /**
	 * Return true if this event is rescheduled on the specified queue, otherwise false;
	 * It also should to modify the tick of the event for it to be scheduled next time.
	 */
    public boolean reschedule$O(final SchedulePriorityQueue queue) {
        
        //#line 21 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final ScheduleSimEvent t$15662 = ((ScheduleSimEvent)(this.event));
        
        //#line 21 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        double tick = t$15662.getTick$O();
        
        //#line 22 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final double t$15663 = tick;
        
        //#line 22 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final double t$15664 = this.interval;
        
        //#line 22 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final double t$15665 = ((t$15663) + (((double)(t$15664))));
        
        //#line 22 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        tick = t$15665;
        
        //#line 23 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final ScheduleSimEvent t$15666 = ((ScheduleSimEvent)(this.event));
        
        //#line 23 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        final double t$15667 = tick;
        
        //#line 23 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        t$15666.setTick((double)(t$15667));
        
        //#line 29 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        queue.push(((ScheduledEvent)(this)));
        
        //#line 30 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        return true;
    }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
    final public ScheduleRepeatEvent ScheduleRepeatEvent$$this$ScheduleRepeatEvent() {
        
        //#line 4 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        return ScheduleRepeatEvent.this;
    }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
    final public void __fieldInitializers_ScheduleRepeatEvent() {
        
        //#line 4 "D:/x10ws/ASDC2/src/ScheduleRepeatEvent.x10"
        this.interval = 0.0;
    }
}

