
@x10.runtime.impl.java.X10Generated
public class Model extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Model> $RTT = 
        x10.rtt.NamedType.<Model> make("Model",
                                       Model.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Model $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Model.class + " calling"); } 
        $_obj.CAList = $deserializer.readObject();
        $_obj.DC = $deserializer.readObject();
        $_obj.Reg = $deserializer.readObject();
        $_obj.runner = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Model $_obj = new Model((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.CAList);
        $serializer.write(this.DC);
        $serializer.write(this.Reg);
        $serializer.write(this.runner);
        
    }
    
    // constructor just for allocation
    public Model(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "D:/x10ws/ASDC2/src/Model.x10"
    public ScheduleRunner runner;
    
    //#line 10 "D:/x10ws/ASDC2/src/Model.x10"
    public x10.regionarray.DistArray<ModelAgent> CAList;
    
    //#line 11 "D:/x10ws/ASDC2/src/Model.x10"
    public x10.regionarray.Region Reg;
    
    //#line 12 "D:/x10ws/ASDC2/src/Model.x10"
    public DataCollection DC;
    
    
    //#line 14 "D:/x10ws/ASDC2/src/Model.x10"
    // creation method for java code (1-phase java constructor)
    public Model() {
        this((java.lang.System[]) null);
        Model$$init$S();
    }
    
    // constructor for non-virtual call
    final public Model Model$$init$S() {
         {
            
            //#line 14 "D:/x10ws/ASDC2/src/Model.x10"
            
            
            //#line 6 "D:/x10ws/ASDC2/src/Model.x10"
            this.__fieldInitializers_Model();
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final int t$34954 = Grid.get$Grid_XMax();
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final long t$34955 = ((long)(((int)(t$34954))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final long t$34956 = ((t$34955) - (((long)(1L))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.lang.LongRange t$34960 = ((x10.lang.LongRange)(new x10.lang.LongRange((java.lang.System[]) null).x10$lang$LongRange$$init$S(((long)(0L)), ((long)(t$34956)))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final int t$34957 = Grid.get$Grid_YMax();
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final long t$34958 = ((long)(((int)(t$34957))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final long t$34959 = ((t$34958) - (((long)(1L))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.lang.LongRange t$34961 = ((x10.lang.LongRange)(new x10.lang.LongRange((java.lang.System[]) null).x10$lang$LongRange$$init$S(((long)(0L)), ((long)(t$34959)))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.regionarray.Region t$34962 = ((x10.regionarray.Region)(x10.regionarray.Region.make(((x10.lang.LongRange)(t$34960)), ((x10.lang.LongRange)(t$34961)))));
            
            //#line 17 "D:/x10ws/ASDC2/src/Model.x10"
            this.Reg = ((x10.regionarray.Region)(t$34962));
            
            //#line 18 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.regionarray.Region t$34963 = ((x10.regionarray.Region)(this.Reg));
            
            //#line 18 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.regionarray.Dist D = ((x10.regionarray.Dist)(x10.regionarray.Dist.makeBlockBlock(((x10.regionarray.Region)(t$34963)))));
            
            //#line 19 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.core.fun.Fun_0_1 t$34964 = ((x10.core.fun.Fun_0_1)(new Model.$Closure$19()));
            
            //#line 19 "D:/x10ws/ASDC2/src/Model.x10"
            final x10.regionarray.DistArray t$34965 = ((x10.regionarray.DistArray)(x10.regionarray.DistArray.<ModelAgent> make__1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2(ModelAgent.$RTT, ((x10.regionarray.Dist)(D)), ((x10.core.fun.Fun_0_1)(t$34964)))));
            
            //#line 19 "D:/x10ws/ASDC2/src/Model.x10"
            this.CAList = ((x10.regionarray.DistArray)(t$34965));
            
            //#line 20 "D:/x10ws/ASDC2/src/Model.x10"
            final ScheduleRunner t$34966 = ((ScheduleRunner)(new ScheduleRunner((java.lang.System[]) null).ScheduleRunner$$init$S()));
            
            //#line 20 "D:/x10ws/ASDC2/src/Model.x10"
            this.runner = ((ScheduleRunner)(t$34966));
            
            //#line 21 "D:/x10ws/ASDC2/src/Model.x10"
            final DataCollection t$34967 = ((DataCollection)(new DataCollection((java.lang.System[]) null).DataCollection$$init$S()));
            
            //#line 21 "D:/x10ws/ASDC2/src/Model.x10"
            this.DC = ((DataCollection)(t$34967));
        }
        return this;
    }
    
    
    
    //#line 24 "D:/x10ws/ASDC2/src/Model.x10"
    public void initSchedule() {
        
        //#line 41 "D:/x10ws/ASDC2/src/Model.x10"
        final EventSequence eventsum = ((EventSequence)(new EventSequence((java.lang.System[]) null).EventSequence$$init$S()));
        
        //#line 42 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34969 = ((ScheduleRunner)(this.runner));
        
        //#line 42 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34970 = ((double)(long)(((long)(20L))));
        
        //#line 42 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34968 = ((ScheduleRunner)(this.runner));
        
        //#line 42 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleStopFunctor t$34971 = ((ScheduleStopFunctor)(new ScheduleStopFunctor((java.lang.System[]) null).ScheduleStopFunctor$$init$S(((ScheduleRunner)(t$34968)))));
        
        //#line 42 "D:/x10ws/ASDC2/src/Model.x10"
        t$34969.scheduleStopEvent((double)(t$34970), ((Functor)(t$34971)));
        
        //#line 43 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34972 = ((ScheduleRunner)(this.runner));
        
        //#line 43 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34973 = ((double)(long)(((long)(0L))));
        
        //#line 43 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleMethodFunctor t$34974 = ((ScheduleMethodFunctor)(new ScheduleMethodFunctor((java.lang.System[]) null).ScheduleMethodFunctor$$init$S(((EventSequence)(eventsum)), ((int)(1)))));
        
        //#line 43 "D:/x10ws/ASDC2/src/Model.x10"
        t$34972.scheduleEvent((double)(t$34973), ((Functor)(t$34974)));
        
        //#line 44 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34975 = ((ScheduleRunner)(this.runner));
        
        //#line 44 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34976 = ((double)(long)(((long)(1L))));
        
        //#line 44 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34977 = ((double)(long)(((long)(5L))));
        
        //#line 44 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleMethodFunctor t$34978 = ((ScheduleMethodFunctor)(new ScheduleMethodFunctor((java.lang.System[]) null).ScheduleMethodFunctor$$init$S(((EventSequence)(eventsum)), ((int)(2)))));
        
        //#line 44 "D:/x10ws/ASDC2/src/Model.x10"
        t$34975.scheduleEvent((double)(t$34976), (double)(t$34977), ((Functor)(t$34978)));
        
        //#line 45 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34979 = ((ScheduleRunner)(this.runner));
        
        //#line 45 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34980 = ((double)(long)(((long)(2L))));
        
        //#line 45 "D:/x10ws/ASDC2/src/Model.x10"
        final double t$34981 = ((double)(long)(((long)(5L))));
        
        //#line 45 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleMethodFunctor t$34982 = ((ScheduleMethodFunctor)(new ScheduleMethodFunctor((java.lang.System[]) null).ScheduleMethodFunctor$$init$S(((EventSequence)(eventsum)), ((int)(3)))));
        
        //#line 45 "D:/x10ws/ASDC2/src/Model.x10"
        t$34979.scheduleEvent((double)(t$34980), (double)(t$34981), ((Functor)(t$34982)));
    }
    
    
    //#line 54 "D:/x10ws/ASDC2/src/Model.x10"
    public void step() {
        
    }
    
    
    //#line 58 "D:/x10ws/ASDC2/src/Model.x10"
    public ScheduleRunner getRunner() {
        
        //#line 59 "D:/x10ws/ASDC2/src/Model.x10"
        final ScheduleRunner t$34983 = ((ScheduleRunner)(this.runner));
        
        //#line 59 "D:/x10ws/ASDC2/src/Model.x10"
        return t$34983;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/Model.x10"
    final public Model Model$$this$Model() {
        
        //#line 6 "D:/x10ws/ASDC2/src/Model.x10"
        return Model.this;
    }
    
    
    //#line 6 "D:/x10ws/ASDC2/src/Model.x10"
    final public void __fieldInitializers_Model() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$19 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$19> $RTT = 
            x10.rtt.StaticFunType.<$Closure$19> make($Closure$19.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.Types.ANY)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Model.$Closure$19 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$19.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Model.$Closure$19 $_obj = new Model.$Closure$19((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$19(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply((x10.lang.Point)a1);
            
        }
        
        
    
        
        public java.lang.Object $apply(final x10.lang.Point p) {
            
            //#line 19 "D:/x10ws/ASDC2/src/Model.x10"
            return null;
        }
        
        public $Closure$19() {
             {
                
            }
        }
        
    }
    
}

