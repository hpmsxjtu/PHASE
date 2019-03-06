/**
 * Wrapped ScheduleRunner's functor of stop.
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleStopFunctor extends Functor implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleStopFunctor> $RTT = 
        x10.rtt.NamedType.<ScheduleStopFunctor> make("ScheduleStopFunctor",
                                                     ScheduleStopFunctor.class,
                                                     new x10.rtt.Type[] {
                                                         Functor.$RTT
                                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleStopFunctor $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleStopFunctor.class + " calling"); } 
        Functor.$_deserialize_body($_obj, $deserializer);
        $_obj.sr = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleStopFunctor $_obj = new ScheduleStopFunctor((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.sr);
        
    }
    
    // constructor just for allocation
    public ScheduleStopFunctor(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 6 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
    public ScheduleRunner sr;
    
    
    //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleStopFunctor(final ScheduleRunner sr) {
        this((java.lang.System[]) null);
        ScheduleStopFunctor$$init$S(sr);
    }
    
    // constructor for non-virtual call
    final public ScheduleStopFunctor ScheduleStopFunctor$$init$S(final ScheduleRunner sr) {
         {
            
            //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
            /*super.*/Functor$$init$S();
            
            //#line 8 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
            this.__fieldInitializers_ScheduleStopFunctor();
            
            //#line 9 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
            this.sr = ((ScheduleRunner)(sr));
        }
        return this;
    }
    
    
    
    //#line 12 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
    public void $apply() {
        
        //#line 13 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
        final ScheduleRunner t$15100 = ((ScheduleRunner)(this.sr));
        
        //#line 13 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
        t$15100.stop();
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
    final public ScheduleStopFunctor ScheduleStopFunctor$$this$ScheduleStopFunctor() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
        return ScheduleStopFunctor.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
    final public void __fieldInitializers_ScheduleStopFunctor() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleStopFunctor.x10"
        this.sr = null;
    }
}

