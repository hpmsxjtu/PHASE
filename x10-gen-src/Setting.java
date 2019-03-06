@x10.runtime.impl.java.X10Generated
public class Setting extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Setting> $RTT = 
        x10.rtt.NamedType.<Setting> make("Setting",
                                         Setting.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Setting $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Setting.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Setting $_obj = new Setting((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Setting(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "D:/x10ws/ASDC2/src/Setting.x10"
    final public static java.lang.String File_Location = ((java.lang.String)
                                                           ("D:/x10ws/ASDC/DataCollection/"));
    
    //#line 24 "D:/x10ws/ASDC2/src/Setting.x10"
    /**
	 * The default len of Heap in PriorityQueue.
	 */
    final public static long LEN_PRIORITYQUEUE = 1000L;
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
    final public Setting Setting$$this$Setting() {
        
        //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
        return Setting.this;
    }
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
    // creation method for java code (1-phase java constructor)
    public Setting() {
        this((java.lang.System[]) null);
        Setting$$init$S();
    }
    
    // constructor for non-virtual call
    final public Setting Setting$$init$S() {
         {
            
            //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
            
            
            //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
            this.__fieldInitializers_Setting();
        }
        return this;
    }
    
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Setting.x10"
    final public void __fieldInitializers_Setting() {
        
    }
    
    public static java.lang.String get$File_Location() {
        return Setting.File_Location;
    }
    
    public static long get$LEN_PRIORITYQUEUE() {
        return Setting.LEN_PRIORITYQUEUE;
    }
}

