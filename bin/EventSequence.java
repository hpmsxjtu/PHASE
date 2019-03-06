
@x10.runtime.impl.java.X10Generated
public class EventSequence extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<EventSequence> $RTT = 
        x10.rtt.NamedType.<EventSequence> make("EventSequence",
                                               EventSequence.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(EventSequence $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + EventSequence.class + " calling"); } 
        $_obj.AgentList = $deserializer.readObject();
        $_obj.DC = $deserializer.readObject();
        $_obj.Reg = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        EventSequence $_obj = new EventSequence((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.AgentList);
        $serializer.write(this.DC);
        $serializer.write(this.Reg);
        
    }
    
    // constructor just for allocation
    public EventSequence(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 12 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public x10.regionarray.DistArray<Agent> AgentList;
    
    //#line 13 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public x10.regionarray.Region Reg;
    
    //#line 14 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public DataCollection DC;
    
    
    //#line 16 "D:/x10ws/ASDC2/src/EventSequence.x10"
    // creation method for java code (1-phase java constructor)
    public EventSequence() {
        this((java.lang.System[]) null);
        EventSequence$$init$S();
    }
    
    // constructor for non-virtual call
    final public EventSequence EventSequence$$init$S() {
         {
            
            //#line 16 "D:/x10ws/ASDC2/src/EventSequence.x10"
            
            
            //#line 7 "D:/x10ws/ASDC2/src/EventSequence.x10"
            this.__fieldInitializers_EventSequence();
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final int t$27606 = Grid.get$Grid_XMax();
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final long t$27607 = ((long)(((int)(t$27606))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final long t$27608 = ((t$27607) - (((long)(1L))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.lang.LongRange t$27612 = ((x10.lang.LongRange)(new x10.lang.LongRange((java.lang.System[]) null).x10$lang$LongRange$$init$S(((long)(0L)), ((long)(t$27608)))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final int t$27609 = Grid.get$Grid_YMax();
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final long t$27610 = ((long)(((int)(t$27609))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final long t$27611 = ((t$27610) - (((long)(1L))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.lang.LongRange t$27613 = ((x10.lang.LongRange)(new x10.lang.LongRange((java.lang.System[]) null).x10$lang$LongRange$$init$S(((long)(0L)), ((long)(t$27611)))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.regionarray.Region t$27614 = ((x10.regionarray.Region)(x10.regionarray.Region.make(((x10.lang.LongRange)(t$27612)), ((x10.lang.LongRange)(t$27613)))));
            
            //#line 21 "D:/x10ws/ASDC2/src/EventSequence.x10"
            this.Reg = ((x10.regionarray.Region)(t$27614));
            
            //#line 22 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.regionarray.Region t$27615 = ((x10.regionarray.Region)(this.Reg));
            
            //#line 22 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.regionarray.Dist D = ((x10.regionarray.Dist)(x10.regionarray.Dist.makeBlockBlock(((x10.regionarray.Region)(t$27615)))));
            
            //#line 23 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.core.fun.Fun_0_1 t$27616 = ((x10.core.fun.Fun_0_1)(new EventSequence.$Closure$11()));
            
            //#line 23 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final x10.regionarray.DistArray t$27617 = ((x10.regionarray.DistArray)(x10.regionarray.DistArray.<Agent> make__1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2(Agent.$RTT, ((x10.regionarray.Dist)(D)), ((x10.core.fun.Fun_0_1)(t$27616)))));
            
            //#line 23 "D:/x10ws/ASDC2/src/EventSequence.x10"
            this.AgentList = ((x10.regionarray.DistArray)(t$27617));
            
            //#line 24 "D:/x10ws/ASDC2/src/EventSequence.x10"
            final DataCollection t$27618 = ((DataCollection)(new DataCollection((java.lang.System[]) null).DataCollection$$init$S()));
            
            //#line 24 "D:/x10ws/ASDC2/src/EventSequence.x10"
            this.DC = ((DataCollection)(t$27618));
        }
        return this;
    }
    
    
    
    //#line 27 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public void step1() {
        
        //#line 32 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final x10.io.Printer t$27621 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 32 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final long t$27619 = x10.x10rt.X10RT.here().id;
        
        //#line 32 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27620 = (("LP_") + ((x10.core.Long.$box(t$27619))));
        
        //#line 32 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27622 = ((t$27620) + ("  \u6211\u662f\u7b2c1\u4ef6\u8981\u505a\u7684\u4e8b\u60c5"));
        
        //#line 32 "D:/x10ws/ASDC2/src/EventSequence.x10"
        t$27621.println(((java.lang.Object)(t$27622)));
    }
    
    
    //#line 34 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public void step2() {
        
        //#line 39 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final x10.io.Printer t$27625 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 39 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final long t$27623 = x10.x10rt.X10RT.here().id;
        
        //#line 39 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27624 = (("LP_") + ((x10.core.Long.$box(t$27623))));
        
        //#line 39 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27626 = ((t$27624) + ("  \u6211\u662f\u7b2c2\u4ef6\u8981\u505a\u7684\u4e8b\u60c5"));
        
        //#line 39 "D:/x10ws/ASDC2/src/EventSequence.x10"
        t$27625.println(((java.lang.Object)(t$27626)));
    }
    
    
    //#line 41 "D:/x10ws/ASDC2/src/EventSequence.x10"
    public void step3() {
        
        //#line 46 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final x10.io.Printer t$27629 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 46 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final long t$27627 = x10.x10rt.X10RT.here().id;
        
        //#line 46 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27628 = (("LP_") + ((x10.core.Long.$box(t$27627))));
        
        //#line 46 "D:/x10ws/ASDC2/src/EventSequence.x10"
        final java.lang.String t$27630 = ((t$27628) + ("  \u6211\u662f\u7b2c3\u4ef6\u8981\u505a\u7684\u4e8b\u60c5"));
        
        //#line 46 "D:/x10ws/ASDC2/src/EventSequence.x10"
        t$27629.println(((java.lang.Object)(t$27630)));
    }
    
    
    //#line 7 "D:/x10ws/ASDC2/src/EventSequence.x10"
    final public EventSequence EventSequence$$this$EventSequence() {
        
        //#line 7 "D:/x10ws/ASDC2/src/EventSequence.x10"
        return EventSequence.this;
    }
    
    
    //#line 7 "D:/x10ws/ASDC2/src/EventSequence.x10"
    final public void __fieldInitializers_EventSequence() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$11 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$11> $RTT = 
            x10.rtt.StaticFunType.<$Closure$11> make($Closure$11.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.Types.ANY)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(EventSequence.$Closure$11 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$11.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            EventSequence.$Closure$11 $_obj = new EventSequence.$Closure$11((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$11(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply((x10.lang.Point)a1);
            
        }
        
        
    
        
        public java.lang.Object $apply(final x10.lang.Point p) {
            
            //#line 23 "D:/x10ws/ASDC2/src/EventSequence.x10"
            return null;
        }
        
        public $Closure$11() {
             {
                
            }
        }
        
    }
    
}

