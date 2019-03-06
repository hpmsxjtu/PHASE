
@x10.runtime.impl.java.X10Generated
public class Launcher extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Launcher> $RTT = 
        x10.rtt.NamedType.<Launcher> make("Launcher",
                                          Launcher.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Launcher $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Launcher.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Launcher $_obj = new Launcher((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Launcher(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 4 "D:/x10ws/ASDC2/src/Launcher.x10"
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
            Launcher.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 5 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29813 = x10.lang.System.nanoTime$O();
        
        //#line 5 "D:/x10ws/ASDC2/src/Launcher.x10"
        long Uptime = (-(t$29813));
        
        //#line 6 "D:/x10ws/ASDC2/src/Launcher.x10"
        Model model =  null;
        
        //#line 7 "D:/x10ws/ASDC2/src/Launcher.x10"
        final Model t$29814 = ((Model)(new Model((java.lang.System[]) null).Model$$init$S()));
        
        //#line 7 "D:/x10ws/ASDC2/src/Launcher.x10"
        model = ((Model)(t$29814));
        
        //#line 8 "D:/x10ws/ASDC2/src/Launcher.x10"
        final Model t$29815 = ((Model)(model));
        
        //#line 8 "D:/x10ws/ASDC2/src/Launcher.x10"
        t$29815.initSchedule();
        
        //#line 9 "D:/x10ws/ASDC2/src/Launcher.x10"
        final Model t$29816 = ((Model)(model));
        
        //#line 9 "D:/x10ws/ASDC2/src/Launcher.x10"
        final ScheduleRunner t$29817 = t$29816.getRunner();
        
        //#line 9 "D:/x10ws/ASDC2/src/Launcher.x10"
        t$29817.run();
        
        //#line 11 "D:/x10ws/ASDC2/src/Launcher.x10"
        final x10.io.Printer t$29818 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 11 "D:/x10ws/ASDC2/src/Launcher.x10"
        t$29818.println(((java.lang.Object)("The simulation is Terminated!")));
        
        //#line 12 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29819 = Uptime;
        
        //#line 12 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29820 = x10.lang.System.nanoTime$O();
        
        //#line 12 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29821 = ((t$29819) + (((long)(t$29820))));
        
        //#line 12 "D:/x10ws/ASDC2/src/Launcher.x10"
        Uptime = t$29821;
        
        //#line 13 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29822 = Uptime;
        
        //#line 13 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29823 = ((t$29822) / (((long)(1000000L))));
        
        //#line 13 "D:/x10ws/ASDC2/src/Launcher.x10"
        Uptime = t$29823;
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final x10.io.Printer t$29828 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final java.lang.String t$29824 = "\n\r  Game of life is over.\n";
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final java.lang.String t$29825 = "\n\r  Game of life is over.\n  Total time consuming is ";
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final long t$29826 = Uptime;
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final java.lang.String t$29827 = ((t$29825) + ((x10.core.Long.$box(t$29826))));
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        final java.lang.String t$29829 = ((t$29827) + ("ms."));
        
        //#line 14 "D:/x10ws/ASDC2/src/Launcher.x10"
        t$29828.println(((java.lang.Object)(t$29829)));
    }
    
    
    //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
    final public Launcher Launcher$$this$Launcher() {
        
        //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
        return Launcher.this;
    }
    
    
    //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
    // creation method for java code (1-phase java constructor)
    public Launcher() {
        this((java.lang.System[]) null);
        Launcher$$init$S();
    }
    
    // constructor for non-virtual call
    final public Launcher Launcher$$init$S() {
         {
            
            //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
            
            
            //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
            this.__fieldInitializers_Launcher();
        }
        return this;
    }
    
    
    
    //#line 3 "D:/x10ws/ASDC2/src/Launcher.x10"
    final public void __fieldInitializers_Launcher() {
        
    }
}

