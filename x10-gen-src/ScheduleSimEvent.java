/**
 * only wrapped the agent's act to be a SimEvent, which has the tick.
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleSimEvent extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleSimEvent> $RTT = 
        x10.rtt.NamedType.<ScheduleSimEvent> make("ScheduleSimEvent",
                                                  ScheduleSimEvent.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleSimEvent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleSimEvent.class + " calling"); } 
        $_obj.fun = $deserializer.readObject();
        $_obj.tick = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleSimEvent $_obj = new ScheduleSimEvent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.fun);
        $serializer.write(this.tick);
        
    }
    
    // constructor just for allocation
    public ScheduleSimEvent(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    /**
	 * tick used for sort in heap.
	 */
    public double tick;
    
    //#line 10 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    public Functor fun;
    
    
    //#line 12 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleSimEvent() {
        this((java.lang.System[]) null);
        ScheduleSimEvent$$init$S();
    }
    
    // constructor for non-virtual call
    final public ScheduleSimEvent ScheduleSimEvent$$init$S() {
         {
            
            //#line 12 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.__fieldInitializers_ScheduleSimEvent();
            
            //#line 13 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            final double t$15096 = 0.0;
            
            //#line 13 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.tick = t$15096;
            
            //#line 14 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.fun = null;
        }
        return this;
    }
    
    
    
    //#line 17 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleSimEvent(final double tick, final Functor fun) {
        this((java.lang.System[]) null);
        ScheduleSimEvent$$init$S(tick, fun);
    }
    
    // constructor for non-virtual call
    final public ScheduleSimEvent ScheduleSimEvent$$init$S(final double tick, final Functor fun) {
         {
            
            //#line 17 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.__fieldInitializers_ScheduleSimEvent();
            
            //#line 18 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.tick = tick;
            
            //#line 19 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
            this.fun = ((Functor)(fun));
        }
        return this;
    }
    
    
    
    //#line 22 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    public double getTick$O() {
        
        //#line 23 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        final double t$15097 = this.tick;
        
        //#line 23 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        return t$15097;
    }
    
    
    //#line 26 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    public void setTick(final double tick) {
        
        //#line 27 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        this.tick = tick;
    }
    
    
    //#line 30 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    public Functor getFun() {
        
        //#line 31 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        final Functor t$15098 = ((Functor)(this.fun));
        
        //#line 31 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        return t$15098;
    }
    
    
    //#line 34 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    public void setFun(Functor fun) {
        
        //#line 35 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        final Functor t$15099 = ((Functor)(fun));
        
        //#line 35 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        this.fun = ((Functor)(t$15099));
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    final public ScheduleSimEvent ScheduleSimEvent$$this$ScheduleSimEvent() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        return ScheduleSimEvent.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
    final public void __fieldInitializers_ScheduleSimEvent() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        this.tick = 0.0;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleSimEvent.x10"
        this.fun = null;
    }
}

