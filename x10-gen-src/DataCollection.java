
@x10.runtime.impl.java.X10Generated
public class DataCollection extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DataCollection> $RTT = 
        x10.rtt.NamedType.<DataCollection> make("DataCollection",
                                                DataCollection.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(DataCollection $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + DataCollection.class + " calling"); } 
        $_obj.DataFile = $deserializer.readObject();
        $_obj.DataRecord = $deserializer.readObject();
        $_obj.File = $deserializer.readObject();
        $_obj.FileWrite = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        DataCollection $_obj = new DataCollection((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.DataFile);
        $serializer.write(this.DataRecord);
        $serializer.write(this.File);
        $serializer.write(this.FileWrite);
        
    }
    
    // constructor just for allocation
    public DataCollection(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public java.lang.String DataFile;
    
    //#line 10 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public java.lang.String DataRecord;
    
    //#line 11 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public x10.io.File File;
    
    //#line 12 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public x10.io.FileWriter FileWrite;
    
    
    //#line 14 "D:/x10ws/ASDC2/src/DataCollection.x10"
    // creation method for java code (1-phase java constructor)
    public DataCollection() {
        this((java.lang.System[]) null);
        DataCollection$$init$S();
    }
    
    // constructor for non-virtual call
    final public DataCollection DataCollection$$init$S() {
         {
            
            //#line 14 "D:/x10ws/ASDC2/src/DataCollection.x10"
            
            
            //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
            this.__fieldInitializers_DataCollection();
        }
        return this;
    }
    
    
    
    //#line 18 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public void RecordBuild(final java.lang.String RecordName) {
        
        //#line 20 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15265 = ((java.lang.String)(Setting.File_Location));
        
        //#line 20 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15266 = ((java.lang.String)
                                           RecordName);
        
        //#line 20 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15267 = ((t$15265) + (t$15266));
        
        //#line 20 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.DataFile = ((java.lang.String)(t$15267));
        
        //#line 21 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15268 = ((java.lang.String)(this.DataFile));
        
        //#line 21 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.File t$15269 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$15268)));
        
        //#line 21 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.File = ((x10.io.File)(t$15269));
        
        //#line 22 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.File t$15270 = ((x10.io.File)(this.File));
        
        //#line 22 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.FileWriter FileWrite = new x10.io.FileWriter((java.lang.System[]) null).x10$io$FileWriter$$init$S(t$15270);
        
        //#line 23 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.Printer t$15272 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 23 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15271 = (("RecordBuild Finished ") + (RecordName));
        
        //#line 23 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15273 = ((t$15271) + ("\n"));
        
        //#line 23 "D:/x10ws/ASDC2/src/DataCollection.x10"
        t$15272.println(((java.lang.Object)(t$15273)));
    }
    
    
    //#line 26 "D:/x10ws/ASDC2/src/DataCollection.x10"
    public void RecordWrite(final java.lang.String Record) {
        
        //#line 28 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15274 = ((java.lang.String)(Setting.File_Location));
        
        //#line 28 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15275 = ((java.lang.String)
                                           ("File.txt"));
        
        //#line 28 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15276 = "D:/x10ws/ASDC/DataCollection/File.txt";
        
        //#line 28 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.DataFile = ((java.lang.String)(t$15276));
        
        //#line 29 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final java.lang.String t$15277 = ((java.lang.String)(this.DataFile));
        
        //#line 29 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.File t$15278 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$15277)));
        
        //#line 29 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.File = ((x10.io.File)(t$15278));
        
        //#line 30 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.File t$15279 = ((x10.io.File)(this.File));
        
        //#line 30 "D:/x10ws/ASDC2/src/DataCollection.x10"
        final x10.io.FileWriter FileWrite = new x10.io.FileWriter((java.lang.System[]) null).x10$io$FileWriter$$init$S(t$15279, ((boolean)(true)));
        
        //#line 33 "D:/x10ws/ASDC2/src/DataCollection.x10"
        FileWrite.write(((java.lang.String)(Record)));
        
        //#line 34 "D:/x10ws/ASDC2/src/DataCollection.x10"
        FileWrite.write(((java.lang.String)("\r\n")));
        
        //#line 35 "D:/x10ws/ASDC2/src/DataCollection.x10"
        FileWrite.flush();
        
        //#line 36 "D:/x10ws/ASDC2/src/DataCollection.x10"
        FileWrite.close();
    }
    
    
    //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
    final public DataCollection DataCollection$$this$DataCollection() {
        
        //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
        return DataCollection.this;
    }
    
    
    //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
    final public void __fieldInitializers_DataCollection() {
        
        //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.DataFile = null;
        
        //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.DataRecord = null;
        
        //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.File = null;
        
        //#line 8 "D:/x10ws/ASDC2/src/DataCollection.x10"
        this.FileWrite = null;
    }
}

