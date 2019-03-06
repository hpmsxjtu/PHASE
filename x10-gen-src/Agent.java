
@x10.runtime.impl.java.X10Generated
public class Agent extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Agent> $RTT = 
        x10.rtt.NamedType.<Agent> make("Agent",
                                       Agent.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Agent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Agent.class + " calling"); } 
        $_obj.location = $deserializer.readObject();
        $_obj.state = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Agent $_obj = new Agent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.location);
        $serializer.write(this.state);
        
    }
    
    // constructor just for allocation
    public Agent(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 5 "D:/x10ws/ASDC2/src/Agent.x10"
    public x10.lang.Point location;
    
    //#line 6 "D:/x10ws/ASDC2/src/Agent.x10"
    public int state;
    
    
    //#line 11 "D:/x10ws/ASDC2/src/Agent.x10"
    // creation method for java code (1-phase java constructor)
    public Agent() {
        this((java.lang.System[]) null);
        Agent$$init$S();
    }
    
    // constructor for non-virtual call
    final public Agent Agent$$init$S() {
         {
            
            //#line 11 "D:/x10ws/ASDC2/src/Agent.x10"
            
            
            //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
            this.__fieldInitializers_Agent();
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final x10.util.Random t$24338 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24340 = t$24338.nextDouble$O();
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final int t$24339 = Grid.get$Grid_XMax();
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24341 = ((double)(int)(((int)(t$24339))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24342 = ((t$24340) * (((double)(t$24341))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final int t$24343 = ((int)(double)(((double)(t$24342))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final long t$24344 = ((long)(((int)(t$24343))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final long t$24352 = ((t$24344) + (((long)(1L))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final x10.util.Random t$24345 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24347 = t$24345.nextDouble$O();
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final int t$24346 = Grid.get$Grid_YMax();
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24348 = ((double)(int)(((int)(t$24346))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final double t$24349 = ((t$24347) * (((double)(t$24348))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final int t$24350 = ((int)(double)(((double)(t$24349))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final long t$24351 = ((long)(((int)(t$24350))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final long t$24353 = ((t$24351) + (((long)(1L))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final x10.core.Rail t$24354 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$24352, t$24353})));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            final x10.lang.Point t$24355 = ((x10.lang.Point)(x10.lang.Point.$implicit_convert__0$1x10$lang$Long$2(((x10.core.Rail)(t$24354)))));
            
            //#line 13 "D:/x10ws/ASDC2/src/Agent.x10"
            this.location = ((x10.lang.Point)(t$24355));
            
            //#line 14 "D:/x10ws/ASDC2/src/Agent.x10"
            final int t$24356 = ((int)(long)(((long)(0L))));
            
            //#line 14 "D:/x10ws/ASDC2/src/Agent.x10"
            this.state = t$24356;
        }
        return this;
    }
    
    
    
    //#line 17 "D:/x10ws/ASDC2/src/Agent.x10"
    // creation method for java code (1-phase java constructor)
    public Agent(final x10.lang.Point po, final int s) {
        this((java.lang.System[]) null);
        Agent$$init$S(po, s);
    }
    
    // constructor for non-virtual call
    final public Agent Agent$$init$S(final x10.lang.Point po, final int s) {
         {
            
            //#line 17 "D:/x10ws/ASDC2/src/Agent.x10"
            
            
            //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
            this.__fieldInitializers_Agent();
            
            //#line 19 "D:/x10ws/ASDC2/src/Agent.x10"
            this.location = ((x10.lang.Point)(po));
            
            //#line 20 "D:/x10ws/ASDC2/src/Agent.x10"
            this.state = s;
        }
        return this;
    }
    
    
    
    //#line 23 "D:/x10ws/ASDC2/src/Agent.x10"
    public x10.lang.Point getLocation() {
        
        //#line 25 "D:/x10ws/ASDC2/src/Agent.x10"
        final x10.lang.Point t$24357 = ((x10.lang.Point)(this.location));
        
        //#line 25 "D:/x10ws/ASDC2/src/Agent.x10"
        return t$24357;
    }
    
    
    //#line 27 "D:/x10ws/ASDC2/src/Agent.x10"
    public long getState$O() {
        
        //#line 29 "D:/x10ws/ASDC2/src/Agent.x10"
        final int t$24358 = this.state;
        
        //#line 29 "D:/x10ws/ASDC2/src/Agent.x10"
        final long t$24359 = ((long)(((int)(t$24358))));
        
        //#line 29 "D:/x10ws/ASDC2/src/Agent.x10"
        return t$24359;
    }
    
    
    //#line 31 "D:/x10ws/ASDC2/src/Agent.x10"
    public void setState(final int sta) {
        
        //#line 33 "D:/x10ws/ASDC2/src/Agent.x10"
        this.state = sta;
    }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
    final public Agent Agent$$this$Agent() {
        
        //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
        return Agent.this;
    }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
    final public void __fieldInitializers_Agent() {
        
        //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
        this.location = null;
        
        //#line 4 "D:/x10ws/ASDC2/src/Agent.x10"
        this.state = 0;
    }
}

