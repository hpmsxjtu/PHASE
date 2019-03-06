/**
 * One type of ScheduledEvent, which will be invoke only once.
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleOneTimeEvent extends ScheduledEvent implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleOneTimeEvent> $RTT = 
        x10.rtt.NamedType.<ScheduleOneTimeEvent> make("ScheduleOneTimeEvent",
                                                      ScheduleOneTimeEvent.class,
                                                      new x10.rtt.Type[] {
                                                          ScheduledEvent.$RTT
                                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleOneTimeEvent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleOneTimeEvent.class + " calling"); } 
        ScheduledEvent.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleOneTimeEvent $_obj = new ScheduleOneTimeEvent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public ScheduleOneTimeEvent(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 6 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleOneTimeEvent(final double start, final ScheduleSimEvent event) {
        this((java.lang.System[]) null);
        ScheduleOneTimeEvent$$init$S(start, event);
    }
    
    // constructor for non-virtual call
    final public ScheduleOneTimeEvent ScheduleOneTimeEvent$$init$S(final double start, final ScheduleSimEvent event) {
         {
            
            //#line 6 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
            /*super.*/ScheduledEvent$$init$S();
            
            //#line 6 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
            this.__fieldInitializers_ScheduleOneTimeEvent();
            
            //#line 7 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
            this.start = start;
            
            //#line 8 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
            this.event = ((ScheduleSimEvent)(event));
        }
        return this;
    }
    
    
    
    //#line 14 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
    /**
	 * This always return false, to identify that it will not invoke again after the first time.
	 */
    public boolean reschedule$O(final SchedulePriorityQueue queue) {
        
        //#line 15 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
        return false;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
    final public ScheduleOneTimeEvent ScheduleOneTimeEvent$$this$ScheduleOneTimeEvent() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
        return ScheduleOneTimeEvent.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleOneTimeEvent.x10"
    final public void __fieldInitializers_ScheduleOneTimeEvent() {
        
    }
}

