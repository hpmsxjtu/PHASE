/**
 * Implements the ScheduledEvent.
 * Use to stop the simulation at the specific tick,
 * In fact it is set the "go" to false.
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleStopEvent extends ScheduledEvent implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleStopEvent> $RTT = 
        x10.rtt.NamedType.<ScheduleStopEvent> make("ScheduleStopEvent",
                                                   ScheduleStopEvent.class,
                                                   new x10.rtt.Type[] {
                                                       ScheduledEvent.$RTT
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleStopEvent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleStopEvent.class + " calling"); } 
        ScheduledEvent.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleStopEvent $_obj = new ScheduleStopEvent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public ScheduleStopEvent(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleStopEvent(final double start, final ScheduleSimEvent event) {
        this((java.lang.System[]) null);
        ScheduleStopEvent$$init$S(start, event);
    }
    
    // constructor for non-virtual call
    final public ScheduleStopEvent ScheduleStopEvent$$init$S(final double start, final ScheduleSimEvent event) {
         {
            
            //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
            /*super.*/ScheduledEvent$$init$S();
            
            //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
            
            
            //#line 7 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
            this.__fieldInitializers_ScheduleStopEvent();
            
            //#line 9 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
            this.start = start;
            
            //#line 10 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
            this.event = ((ScheduleSimEvent)(event));
        }
        return this;
    }
    
    
    
    //#line 16 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
    /**
	 * This always return false, to identify that it will not invoke again after the first time.
	 */
    public boolean reschedule$O(final SchedulePriorityQueue queue) {
        
        //#line 17 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
        return false;
    }
    
    
    //#line 7 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
    final public ScheduleStopEvent ScheduleStopEvent$$this$ScheduleStopEvent() {
        
        //#line 7 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
        return ScheduleStopEvent.this;
    }
    
    
    //#line 7 "D:/x10ws/ASDC2/src/ScheduleStopEvent.x10"
    final public void __fieldInitializers_ScheduleStopEvent() {
        
    }
}

