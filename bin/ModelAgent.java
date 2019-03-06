
@x10.runtime.impl.java.X10Generated
public class ModelAgent extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ModelAgent> $RTT = 
        x10.rtt.NamedType.<ModelAgent> make("ModelAgent",
                                            ModelAgent.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ModelAgent $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ModelAgent.class + " calling"); } 
        $_obj.location = $deserializer.readObject();
        $_obj.state = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ModelAgent $_obj = new ModelAgent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.location);
        $serializer.write(this.state);
        
    }
    
    // constructor just for allocation
    public ModelAgent(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    public x10.lang.Point location;
    
    //#line 8 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    public int state;
    
    
    //#line 12 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    // creation method for java code (1-phase java constructor)
    public ModelAgent() {
        this((java.lang.System[]) null);
        ModelAgent$$init$S();
    }
    
    // constructor for non-virtual call
    final public ModelAgent ModelAgent$$init$S() {
         {
            
            //#line 12 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            
            
            //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.__fieldInitializers_ModelAgent();
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final x10.util.Random t$31717 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31719 = t$31717.nextDouble$O();
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final int t$31718 = Grid.get$Grid_XMax();
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31720 = ((double)(int)(((int)(t$31718))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31721 = ((t$31719) * (((double)(t$31720))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final int t$31722 = ((int)(double)(((double)(t$31721))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final long t$31723 = ((long)(((int)(t$31722))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final long t$31731 = ((t$31723) + (((long)(1L))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final x10.util.Random t$31724 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S()));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31726 = t$31724.nextDouble$O();
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final int t$31725 = Grid.get$Grid_YMax();
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31727 = ((double)(int)(((int)(t$31725))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final double t$31728 = ((t$31726) * (((double)(t$31727))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final int t$31729 = ((int)(double)(((double)(t$31728))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final long t$31730 = ((long)(((int)(t$31729))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final long t$31732 = ((t$31730) + (((long)(1L))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final x10.core.Rail t$31733 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$31731, t$31732})));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            final x10.lang.Point t$31734 = ((x10.lang.Point)(x10.lang.Point.$implicit_convert__0$1x10$lang$Long$2(((x10.core.Rail)(t$31733)))));
            
            //#line 14 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.location = ((x10.lang.Point)(t$31734));
            
            //#line 15 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.state = 1;
        }
        return this;
    }
    
    
    
    //#line 18 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    // creation method for java code (1-phase java constructor)
    public ModelAgent(final x10.lang.Point p, final int s) {
        this((java.lang.System[]) null);
        ModelAgent$$init$S(p, s);
    }
    
    // constructor for non-virtual call
    final public ModelAgent ModelAgent$$init$S(final x10.lang.Point p, final int s) {
         {
            
            //#line 18 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            
            
            //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.__fieldInitializers_ModelAgent();
            
            //#line 20 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.location = ((x10.lang.Point)(p));
            
            //#line 21 "D:/x10ws/ASDC2/src/ModelAgent.x10"
            this.state = s;
        }
        return this;
    }
    
    
    
    //#line 24 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    public x10.lang.Point getLocation() {
        
        //#line 26 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        final x10.lang.Point t$31735 = ((x10.lang.Point)(this.location));
        
        //#line 26 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        return t$31735;
    }
    
    
    //#line 28 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    public long getState$O() {
        
        //#line 30 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        final int t$31736 = this.state;
        
        //#line 30 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        final long t$31737 = ((long)(((int)(t$31736))));
        
        //#line 30 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        return t$31737;
    }
    
    
    //#line 32 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    public void setState(final int sta) {
        
        //#line 34 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        this.state = sta;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    final public ModelAgent ModelAgent$$this$ModelAgent() {
        
        //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        return ModelAgent.this;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
    final public void __fieldInitializers_ModelAgent() {
        
        //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        this.location = null;
        
        //#line 6 "D:/x10ws/ASDC2/src/ModelAgent.x10"
        this.state = 0;
    }
}

