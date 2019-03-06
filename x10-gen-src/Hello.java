/**
 * The canonical "Hello, World" demo class expressed in X10
 */
@x10.runtime.impl.java.X10Generated
public class Hello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Hello> $RTT = 
        x10.rtt.NamedType.<Hello> make("Hello",
                                       Hello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 9 "D:/x10ws/ASDC2/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Hello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> id$10491) {
        {
            
            //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
            final x10.xrx.FinishState fs$16323 = x10.xrx.Runtime.startFinish();
            
            //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
            try {{
                {
                    
                    //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                    final x10.lang.PlaceGroup t$16308 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                    final x10.lang.Iterator p$16306 = ((x10.lang.Iterable<x10.lang.Place>)t$16308).iterator();
                    
                    //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                        final boolean t$16312 = ((x10.lang.Iterator<x10.lang.Place>)p$16306).hasNext$O();
                        
                        //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                        if (!(t$16312)) {
                            
                            //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                            break;
                        }
                        
                        //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                        final x10.lang.Place p$16313 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$16306).next$G()));
                        
                        //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                        x10.xrx.Runtime.runAsync(((x10.lang.Place)(p$16313)), ((x10.core.fun.VoidFun_0_0)(new Hello.$Closure$9(p$16313))), ((x10.xrx.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable ct$16321) {
                
                //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$16321)));
                
                //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 10 "D:/x10ws/ASDC2/src/Hello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$16323)));
             }}
            }
        }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
            
            
            //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 4 "D:/x10ws/ASDC2/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$9 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$9> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$9> make($Closure$9.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello.$Closure$9 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$9.class + " calling"); } 
            $_obj.p$16313 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Hello.$Closure$9 $_obj = new Hello.$Closure$9((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$16313);
            
        }
        
        // constructor just for allocation
        public $Closure$9(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
            try {{
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                final x10.io.Printer t$16314 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                final long t$16315 = this.p$16313.id;
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                final java.lang.String t$16316 = (("Hello World from place ") + ((x10.core.Long.$box(t$16315))));
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                t$16314.println(((java.lang.Object)(t$16316)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 11 "D:/x10ws/ASDC2/src/Hello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.Place p$16313;
        
        public $Closure$9(final x10.lang.Place p$16313) {
             {
                this.p$16313 = ((x10.lang.Place)(p$16313));
            }
        }
        
    }
    
    }
    
    