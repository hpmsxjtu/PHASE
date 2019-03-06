/**
 * It should be a single instance, that is there is only one ScheduleRunner in every model.
 * But how to impement this?
 */
@x10.runtime.impl.java.X10Generated
public class ScheduleRunner extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ScheduleRunner> $RTT = 
        x10.rtt.NamedType.<ScheduleRunner> make("ScheduleRunner",
                                                ScheduleRunner.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ScheduleRunner.class + " calling"); } 
        $_obj.endEvents = $deserializer.readObject();
        $_obj.globalNextTick = $deserializer.readDouble();
        $_obj.go = $deserializer.readBoolean();
        $_obj.localNextTick = $deserializer.readDouble();
        $_obj.stopTick = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ScheduleRunner $_obj = new ScheduleRunner((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.endEvents);
        $serializer.write(this.globalNextTick);
        $serializer.write(this.go);
        $serializer.write(this.localNextTick);
        $serializer.write(this.stopTick);
        
    }
    
    // constructor just for allocation
    public ScheduleRunner(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 15 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * @ parameter: go-----------------Decide whether to continue for this simulating.
	 * 
	 * @ parameter: schedule-----------????
	 * 
	 * @ parameter: globalNextTick-----The global tick for next.
	 * @ parameter: localNextTick------The local tick for next.
	 * @ parameter: endEvent-----------The end event for schedule.
	 */
    public boolean go;
    
    //#line 17 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    public double globalNextTick;
    
    //#line 17 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    public double localNextTick;
    
    //#line 18 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    public double stopTick;
    
    //#line 19 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    public Functor endEvents;
    
    //#line 20 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    private static x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>> plh;
    
    
    //#line 24 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    // creation method for java code (1-phase java constructor)
    public ScheduleRunner() {
        this((java.lang.System[]) null);
        ScheduleRunner$$init$S();
    }
    
    // constructor for non-virtual call
    final public ScheduleRunner ScheduleRunner$$init$S() {
         {
            
            //#line 24 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.__fieldInitializers_ScheduleRunner();
            
            //#line 25 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.go = true;
            
            //#line 26 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.globalNextTick = 0.0;
            
            //#line 27 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.localNextTick = 0.0;
            
            //#line 28 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final double t$15511 = 1.0;
            
            //#line 28 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final double t$15512 = -1.0;
            
            //#line 28 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.stopTick = t$15512;
            
            //#line 32 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.endEvents = null;
        }
        return this;
    }
    
    
    
    //#line 39 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Construct with parameter of endEvents.
	 * Pass the event(functor) which is the end event to be scheduled.
	 */
    // creation method for java code (1-phase java constructor)
    public ScheduleRunner(final Functor endEvents) {
        this((java.lang.System[]) null);
        ScheduleRunner$$init$S(endEvents);
    }
    
    // constructor for non-virtual call
    final public ScheduleRunner ScheduleRunner$$init$S(final Functor endEvents) {
         {
            
            //#line 39 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            
            
            //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.__fieldInitializers_ScheduleRunner();
            
            //#line 40 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.go = true;
            
            //#line 41 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.globalNextTick = 0.0;
            
            //#line 42 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.localNextTick = 0.0;
            
            //#line 43 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final double t$15513 = 1.0;
            
            //#line 43 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final double t$15514 = -1.0;
            
            //#line 43 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.stopTick = t$15514;
            
            //#line 45 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            this.endEvents = ((Functor)(endEvents));
        }
        return this;
    }
    
    
    
    //#line 52 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * This is right or wrong to implement single instance.
	 * Not USE!
	 */
    public static ScheduleRunner getInstance() {
        
        //#line 53 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final ScheduleRunner t$15515 = ((ScheduleRunner)(new ScheduleRunner((java.lang.System[]) null).ScheduleRunner$$init$S()));
        
        //#line 53 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        return t$15515;
    }
    
    
    //#line 61 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Schedule the OneTimeEvent which will invoke the schedule's schedule_event.
	 * In fact, it is push the event into queue of schedule firstly.
	 * 
	 */
    public void scheduleEvent(final double start, final Functor fun) {
        
        //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.PlaceGroup t$15517 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.Iterator p$15504 = ((x10.lang.Iterable<x10.lang.Place>)t$15517).iterator();
        
        //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        for (;
             true;
             ) {
            
            //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final boolean t$15521 = ((x10.lang.Iterator<x10.lang.Place>)p$15504).hasNext$O();
            
            //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            if (!(t$15521)) {
                
                //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                break;
            }
            
            //#line 62 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final x10.lang.Place p$15555 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$15504).next$G()));
            {
                
                //#line 65 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$15555)), ((x10.core.fun.VoidFun_0_0)(new ScheduleRunner.$Closure$1(start, fun))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 81 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Schedule the RepeatingEvent which will invoke the schedule's schedule_event.
	 * In fact, it is push the event into queue of schedule firstly.
	 * 
	 */
    public void scheduleEvent(final double start, final double interval, final Functor fun) {
        
        //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.PlaceGroup t$15523 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.Iterator p$15506 = ((x10.lang.Iterable<x10.lang.Place>)t$15523).iterator();
        
        //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        for (;
             true;
             ) {
            
            //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final boolean t$15527 = ((x10.lang.Iterator<x10.lang.Place>)p$15506).hasNext$O();
            
            //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            if (!(t$15527)) {
                
                //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                break;
            }
            
            //#line 84 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final x10.lang.Place p$15559 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$15506).next$G()));
            {
                
                //#line 87 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$15559)), ((x10.core.fun.VoidFun_0_0)(new ScheduleRunner.$Closure$2(start, interval, fun))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 100 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * OneTimeEvent, but this will end the simulation.
	 */
    public void scheduleStopEvent(final double start, final Functor fun) {
        
        //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.PlaceGroup t$15529 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.Iterator p$15508 = ((x10.lang.Iterable<x10.lang.Place>)t$15529).iterator();
        
        //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        for (;
             true;
             ) {
            
            //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final boolean t$15533 = ((x10.lang.Iterator<x10.lang.Place>)p$15508).hasNext$O();
            
            //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            if (!(t$15533)) {
                
                //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                break;
            }
            
            //#line 103 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final x10.lang.Place p$15563 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$15508).next$G()));
            {
                
                //#line 106 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$15563)), ((x10.core.fun.VoidFun_0_0)(new ScheduleRunner.$Closure$3(start, fun))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 120 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Schedule the end event.
	 * Which object's fun ?
	 */
    public void scheduleEndEvent(final double start, final Functor fun) {
        
    }
    
    
    //#line 132 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * This is wrong, because there maybe no such tick in schedule.
	 * So that, the simulation can't stop as expected!
	 * 
	 * The correct method is wrapped this as a StopEvent, and push it in the schedule.
	 */
    public void scheduleStop(final double stopAt) {
        
        //#line 133 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.stopTick = stopAt;
    }
    
    
    //#line 142 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Test run
	 * Right!!
	 */
    public void run() {
        {
            
            //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            final x10.xrx.FinishState fs$15604 = x10.xrx.Runtime.startFinish();
            
            //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                {
                    
                    //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                    final x10.lang.PlaceGroup t$15535 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                    final x10.lang.Iterator p$15510 = ((x10.lang.Iterable<x10.lang.Place>)t$15535).iterator();
                    
                    //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final boolean t$15549 = ((x10.lang.Iterator<x10.lang.Place>)p$15510).hasNext$O();
                        
                        //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        if (!(t$15549)) {
                            
                            //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                            break;
                        }
                        
                        //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final x10.lang.Place p$15573 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$15510).next$G()));
                        
                        //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ScheduleRunner.$Closure$5(this, p$15573))));
                    }
                }
            }}catch (java.lang.Throwable ct$15599) {
                
                //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$15599)));
                
                //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 154 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$15604)));
             }}
            }
        }
    
    
    //#line 187 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Stop the simulating.
	 */
    public void stop() {
        
        //#line 188 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.go = false;
    }
    
    
    //#line 201 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    /**
	 * Get the next tick to be schedule at.
	 */
    public void nextTick() {
        
        //#line 202 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.PlaceLocalHandle t$15550 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
        
        //#line 202 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final x10.lang.Cell t$15551 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15550).$apply$G();
        
        //#line 202 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final Schedule t$15552 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15551).$apply$G()));
        
        //#line 202 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final double t$15553 = t$15552.getNextTick$O();
        
        //#line 202 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.localNextTick = t$15553;
    }
    
    
    //#line 204 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    public boolean judgego$O() {
        
        //#line 206 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        final boolean t$15554 = this.go;
        
        //#line 206 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        return t$15554;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    final public ScheduleRunner ScheduleRunner$$this$ScheduleRunner() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        return ScheduleRunner.this;
    }
    
    
    //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
    final public void __fieldInitializers_ScheduleRunner() {
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.go = false;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.globalNextTick = 0.0;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.localNextTick = 0.0;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.stopTick = 0.0;
        
        //#line 5 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
        this.endEvents = null;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$plh = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$plh;
    
    public static x10.lang.PlaceLocalHandle get$plh() {
        if (((int) ScheduleRunner.initStatus$plh.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return ScheduleRunner.plh;
        }
        if (((int) ScheduleRunner.initStatus$plh.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: ScheduleRunner.plh")));
            }
            throw ScheduleRunner.exception$plh;
        }
        if (ScheduleRunner.initStatus$plh.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                ScheduleRunner.plh = x10.lang.PlaceLocalHandle.<x10.lang.Cell<Schedule>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, Schedule.$RTT), ((x10.lang.PlaceGroup)(x10.lang.Place.places())), ((x10.core.fun.Fun_0_0)(new ScheduleRunner.$Closure$6())));
            }}catch (java.lang.Throwable exc$15606) {
                ScheduleRunner.exception$plh = new x10.lang.ExceptionInInitializer(exc$15606);
                ScheduleRunner.initStatus$plh.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw ScheduleRunner.exception$plh;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: ScheduleRunner.plh")));
            }
            ScheduleRunner.initStatus$plh.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (ScheduleRunner.initStatus$plh.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (ScheduleRunner.initStatus$plh.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) ScheduleRunner.initStatus$plh.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: ScheduleRunner.plh")));
                    }
                    throw ScheduleRunner.exception$plh;
                }
            }
        }
        return ScheduleRunner.plh;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$1> make($Closure$1.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$1.class + " calling"); } 
            $_obj.fun = $deserializer.readObject();
            $_obj.start = $deserializer.readDouble();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$1 $_obj = new ScheduleRunner.$Closure$1((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.fun);
            $serializer.write(this.start);
            
        }
        
        // constructor just for allocation
        public $Closure$1(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 65 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                
                //#line 68 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.PlaceLocalHandle t$15556 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
                
                //#line 68 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.Cell t$15557 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15556).$apply$G();
                
                //#line 68 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final Schedule t$15558 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15557).$apply$G()));
                
                //#line 68 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                t$15558.schedule_event((double)(this.start), ((Functor)(this.fun)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 65 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public double start;
        public Functor fun;
        
        public $Closure$1(final double start, final Functor fun) {
             {
                this.start = start;
                this.fun = ((Functor)(fun));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$2> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$2> make($Closure$2.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$2.class + " calling"); } 
            $_obj.fun = $deserializer.readObject();
            $_obj.interval = $deserializer.readDouble();
            $_obj.start = $deserializer.readDouble();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$2 $_obj = new ScheduleRunner.$Closure$2((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.fun);
            $serializer.write(this.interval);
            $serializer.write(this.start);
            
        }
        
        // constructor just for allocation
        public $Closure$2(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 87 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                
                //#line 90 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.PlaceLocalHandle t$15560 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
                
                //#line 90 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.Cell t$15561 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15560).$apply$G();
                
                //#line 90 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final Schedule t$15562 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15561).$apply$G()));
                
                //#line 90 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                t$15562.schedule_event((double)(this.start), (double)(this.interval), ((Functor)(this.fun)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 87 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public double start;
        public double interval;
        public Functor fun;
        
        public $Closure$2(final double start, final double interval, final Functor fun) {
             {
                this.start = start;
                this.interval = interval;
                this.fun = ((Functor)(fun));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$3> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$3> make($Closure$3.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$3.class + " calling"); } 
            $_obj.fun = $deserializer.readObject();
            $_obj.start = $deserializer.readDouble();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$3 $_obj = new ScheduleRunner.$Closure$3((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.fun);
            $serializer.write(this.start);
            
        }
        
        // constructor just for allocation
        public $Closure$3(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 106 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                
                //#line 110 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.PlaceLocalHandle t$15564 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
                
                //#line 110 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.Cell t$15565 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15564).$apply$G();
                
                //#line 110 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final Schedule t$15566 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15565).$apply$G()));
                
                //#line 110 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                t$15566.schedule_Endevent((double)(this.start), ((Functor)(this.fun)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 106 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public double start;
        public Functor fun;
        
        public $Closure$3(final double start, final Functor fun) {
             {
                this.start = start;
                this.fun = ((Functor)(fun));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$4 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$4> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$4> make($Closure$4.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$4 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$4.class + " calling"); } 
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$4 $_obj = new ScheduleRunner.$Closure$4((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$4(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.PlaceLocalHandle t$15574 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final x10.lang.Cell t$15575 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15574).$apply$G();
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final Schedule t$15576 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15575).$apply$G()));
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final double t$15577 = t$15576.getNextTick$O();
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final double t$15578 = -1.0;
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                final boolean t$15579 = ((double) t$15577) != ((double) t$15578);
                
                //#line 160 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                if (t$15579) {
                    
                    //#line 161 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                    while (true) {
                        
                        //#line 161 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final boolean t$15580 = this.out$$.go;
                        
                        //#line 161 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        if (!(t$15580)) {
                            
                            //#line 161 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                            break;
                        }
                        
                        //#line 163 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final x10.lang.PlaceLocalHandle t$15567 = ((x10.lang.PlaceLocalHandle)(ScheduleRunner.get$plh()));
                        
                        //#line 163 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final x10.lang.Cell t$15568 = ((x10.lang.PlaceLocalHandle<x10.lang.Cell<Schedule>>)t$15567).$apply$G();
                        
                        //#line 163 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final Schedule t$15569 = ((Schedule)(((x10.lang.Cell<Schedule>)t$15568).$apply$G()));
                        
                        //#line 163 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        t$15569.execute();
                        
                        //#line 165 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        this.out$$.nextTick();
                        
                        //#line 167 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final double t$15570 = this.out$$.localNextTick;
                        
                        //#line 167 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final double t$15571 = -1.0;
                        
                        //#line 167 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        final boolean t$15572 = ((double) t$15570) == ((double) t$15571);
                        
                        //#line 167 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                        if (t$15572) {
                            
                            //#line 168 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                            this.out$$.go = false;
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public ScheduleRunner out$$;
        
        public $Closure$4(final ScheduleRunner out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$5 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$5> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$5> make($Closure$5.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$5 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$5.class + " calling"); } 
            $_obj.out$$ = $deserializer.readObject();
            $_obj.p$15573 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$5 $_obj = new ScheduleRunner.$Closure$5((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.p$15573);
            
        }
        
        // constructor just for allocation
        public $Closure$5(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            try {{
                {
                    
                    //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(this.p$15573)), ((x10.core.fun.VoidFun_0_0)(new ScheduleRunner.$Closure$4(this.out$$))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 157 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public ScheduleRunner out$$;
        public x10.lang.Place p$15573;
        
        public $Closure$5(final ScheduleRunner out$$, final x10.lang.Place p$15573) {
             {
                this.out$$ = out$$;
                this.p$15573 = ((x10.lang.Place)(p$15573));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$6 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$6> $RTT = 
            x10.rtt.StaticFunType.<$Closure$6> make($Closure$6.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, Schedule.$RTT))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ScheduleRunner.$Closure$6 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$6.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ScheduleRunner.$Closure$6 $_obj = new ScheduleRunner.$Closure$6((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$6(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.Cell $apply$G() {
            return $apply();
        }
        
        
    
        
        public x10.lang.Cell $apply() {
            
            //#line 20 "D:/x10ws/ASDC2/src/ScheduleRunner.x10"
            return new x10.lang.Cell<Schedule>((java.lang.System[]) null, Schedule.$RTT).x10$lang$Cell$$init$S(((Schedule)(new Schedule((java.lang.System[]) null).Schedule$$init$S())), (x10.lang.Cell.__0x10$lang$Cell$$T) null);
        }
        
        public $Closure$6() {
             {
                
            }
        }
        
    }
    
    }
    
    