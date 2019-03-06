/**
 * Base class, which will be used to wrapped object's method.
 */
@x10.runtime.impl.java.X10Generated
public class Functor extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Functor> $RTT = 
        x10.rtt.NamedType.<Functor> make("Functor",
                                         Functor.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Functor $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Functor.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Functor $_obj = new Functor((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Functor(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 10 "D:/x10ws/ASDC2/src/Functor.x10"
    /**
	 * User-Defined Operator.
	 * The parameter i used to specify which step of Agent_Interface will be invoked.
	 */
    public void $apply() {
        
    }
    
    
    //#line 13 "D:/x10ws/ASDC2/src/Functor.x10"
    // creation method for java code (1-phase java constructor)
    public Functor() {
        this((java.lang.System[]) null);
        Functor$$init$S();
    }
    
    // constructor for non-virtual call
    final public Functor Functor$$init$S() {
         {
            
            //#line 13 "D:/x10ws/ASDC2/src/Functor.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/Functor.x10"
            this.__fieldInitializers_Functor();
        }
        return this;
    }
    
    
    
    //#line 5 "D:/x10ws/ASDC2/src/Functor.x10"
    final public Functor Functor$$this$Functor() {
        
        //#line 5 "D:/x10ws/ASDC2/src/Functor.x10"
        return Functor.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/Functor.x10"
    final public void __fieldInitializers_Functor() {
        
    }
}

