/**
 * SubClass of Functor, used to wrapped agent's method.
 * But how to wrapped agent's any method ???
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleMethodFunctor extends Functor implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleMethodFunctor> $RTT = 
        x10.rtt.NamedType.<ScheduleMethodFunctor> make("ScheduleMethodFunctor",
                                                       ScheduleMethodFunctor.class,
                                                       new x10.rtt.Type[] {
                                                           Functor.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleMethodFunctor $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleMethodFunctor.class + " calling"); } 
        Functor.$_deserialize_body($_obj, $deserializer);
        $_obj.eventSum = $deserializer.readObject();
        $_obj.i = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleMethodFunctor $_obj = new ScheduleMethodFunctor((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.eventSum);
        $serializer.write(this.i);
        
    }
    
    // constructor just for allocation
    public ScheduleMethodFunctor(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 8 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    public EventSequence eventSum;
    
    //#line 9 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    public int i;
    
    
    //#line 11 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleMethodFunctor(final EventSequence eventSum, final int i) {
        this((java.lang.System[]) null);
        ScheduleMethodFunctor$$init$S(eventSum, i);
    }
    
    // constructor for non-virtual call
    final public ScheduleMethodFunctor ScheduleMethodFunctor$$init$S(final EventSequence eventSum, final int i) {
         {
            
            //#line 11 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            /*super.*/Functor$$init$S();
            
            //#line 11 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            
            
            //#line 6 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            this.__fieldInitializers_ScheduleMethodFunctor();
            
            //#line 12 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            this.eventSum = ((EventSequence)(eventSum));
            
            //#line 13 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            this.i = i;
        }
        return this;
    }
    
    
    
    //#line 23 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    /**
	 * To call agent's method of step1, step2, or step3.
	 * The content of step is varied.
	 * The moduler can specify to invoke agent's other action,
	 * and these actions' sequence can async.
	 */
    public void $apply() {
        
        //#line 24 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
        final int t$34933 = this.i;
        
        //#line 24 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
        switch (t$34933) {
            
            //#line 25 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            case 1:
                
                //#line 25 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                final EventSequence t$34930 = ((EventSequence)(this.eventSum));
                
                //#line 25 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                t$34930.step1();
                
                //#line 26 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                break;
            
            //#line 27 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            case 2:
                
                //#line 27 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                final EventSequence t$34931 = ((EventSequence)(this.eventSum));
                
                //#line 27 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                t$34931.step2();
                
                //#line 28 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                break;
            
            //#line 29 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
            case 3:
                
                //#line 29 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                final EventSequence t$34932 = ((EventSequence)(this.eventSum));
                
                //#line 29 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                t$34932.step3();
                
                //#line 30 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
                break;
        }
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    final public ScheduleMethodFunctor ScheduleMethodFunctor$$this$ScheduleMethodFunctor() {
        
        //#line 6 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
        return ScheduleMethodFunctor.this;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
    final public void __fieldInitializers_ScheduleMethodFunctor() {
        
        //#line 6 "D:/x10ws/ASDC2/src/ScheduleMethodFunctor.x10"
        this.eventSum = null;
    }
}

