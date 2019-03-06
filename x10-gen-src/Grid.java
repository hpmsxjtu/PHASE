@x10.runtime.impl.java.X10Generated
public class Grid extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Grid> $RTT = 
        x10.rtt.NamedType.<Grid> make("Grid",
                                      Grid.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Grid $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Grid.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Grid $_obj = new Grid((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Grid(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 3 "D:/x10ws/ASDC2/src/Grid.x10"
    private static int Grid_XMax = 0;
    
    //#line 4 "D:/x10ws/ASDC2/src/Grid.x10"
    private static int Grid_YMax = 0;
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
    final public Grid Grid$$this$Grid() {
        
        //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
        return Grid.this;
    }
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
    // creation method for java code (1-phase java constructor)
    public Grid() {
        this((java.lang.System[]) null);
        Grid$$init$S();
    }
    
    // constructor for non-virtual call
    final public Grid Grid$$init$S() {
         {
            
            //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
            
            
            //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
            this.__fieldInitializers_Grid();
        }
        return this;
    }
    
    
    
    //#line 1 "D:/x10ws/ASDC2/src/Grid.x10"
    final public void __fieldInitializers_Grid() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$Grid_YMax = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$Grid_YMax;
    final private static x10.core.concurrent.AtomicInteger initStatus$Grid_XMax = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$Grid_XMax;
    
    public static int get$Grid_XMax() {
        if (((int) Grid.initStatus$Grid_XMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return Grid.Grid_XMax;
        }
        if (((int) Grid.initStatus$Grid_XMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: Grid.Grid_XMax")));
            }
            throw Grid.exception$Grid_XMax;
        }
        if (Grid.initStatus$Grid_XMax.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                Grid.Grid_XMax = ((int)(long)(((long)(10L))));
            }}catch (java.lang.Throwable exc$15672) {
                Grid.exception$Grid_XMax = new x10.lang.ExceptionInInitializer(exc$15672);
                Grid.initStatus$Grid_XMax.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw Grid.exception$Grid_XMax;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: Grid.Grid_XMax")));
            }
            Grid.initStatus$Grid_XMax.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (Grid.initStatus$Grid_XMax.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (Grid.initStatus$Grid_XMax.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) Grid.initStatus$Grid_XMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: Grid.Grid_XMax")));
                    }
                    throw Grid.exception$Grid_XMax;
                }
            }
        }
        return Grid.Grid_XMax;
    }
    
    public static int get$Grid_YMax() {
        if (((int) Grid.initStatus$Grid_YMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return Grid.Grid_YMax;
        }
        if (((int) Grid.initStatus$Grid_YMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: Grid.Grid_YMax")));
            }
            throw Grid.exception$Grid_YMax;
        }
        if (Grid.initStatus$Grid_YMax.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                Grid.Grid_YMax = ((int)(long)(((long)(10L))));
            }}catch (java.lang.Throwable exc$15673) {
                Grid.exception$Grid_YMax = new x10.lang.ExceptionInInitializer(exc$15673);
                Grid.initStatus$Grid_YMax.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw Grid.exception$Grid_YMax;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: Grid.Grid_YMax")));
            }
            Grid.initStatus$Grid_YMax.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (Grid.initStatus$Grid_YMax.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (Grid.initStatus$Grid_YMax.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) Grid.initStatus$Grid_YMax.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: Grid.Grid_YMax")));
                    }
                    throw Grid.exception$Grid_YMax;
                }
            }
        }
        return Grid.Grid_YMax;
    }
}

