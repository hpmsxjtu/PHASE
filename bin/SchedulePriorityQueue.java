
/**
 * use the min Heap
 */
@x10.runtime.impl.java.X10Generated
public class SchedulePriorityQueue extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SchedulePriorityQueue> $RTT = 
        x10.rtt.NamedType.<SchedulePriorityQueue> make("SchedulePriorityQueue",
                                                       SchedulePriorityQueue.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(SchedulePriorityQueue $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + SchedulePriorityQueue.class + " calling"); } 
        $_obj.Heap = $deserializer.readObject();
        $_obj.Reg = $deserializer.readObject();
        $_obj.len = $deserializer.readInt();
        $_obj.size = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        SchedulePriorityQueue $_obj = new SchedulePriorityQueue((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.Heap);
        $serializer.write(this.Reg);
        $serializer.write(this.len);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public SchedulePriorityQueue(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    public int len;
    
    //#line 10 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    public int size;
    
    //#line 12 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    public x10.regionarray.Array<ScheduledEvent> Heap;
    
    //#line 13 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    public x10.regionarray.Region Reg;
    
    
    //#line 17 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    // creation method for java code (1-phase java constructor)
    public SchedulePriorityQueue() {
        this((java.lang.System[]) null);
        SchedulePriorityQueue$$init$S();
    }
    
    // constructor for non-virtual call
    final public SchedulePriorityQueue SchedulePriorityQueue$$init$S() {
         {
            
            //#line 17 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            
            
            //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.__fieldInitializers_SchedulePriorityQueue();
            
            //#line 18 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16151 = Setting.LEN_PRIORITYQUEUE;
            
            //#line 18 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16152 = ((int)(long)(((long)(t$16151))));
            
            //#line 18 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.len = t$16152;
            
            //#line 19 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.size = 0;
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16155 = ((long)(((int)(0))));
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16153 = this.len;
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16154 = ((t$16153) - (((int)(1))));
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16156 = ((long)(((int)(t$16154))));
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Region t$16157 = ((x10.regionarray.Region)(x10.regionarray.Region.make((long)(t$16155), (long)(t$16156))));
            
            //#line 20 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.Reg = ((x10.regionarray.Region)(t$16157));
            
            //#line 21 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Region t$16158 = ((x10.regionarray.Region)(this.Reg));
            
            //#line 21 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.core.fun.Fun_0_1 t$16159 = ((x10.core.fun.Fun_0_1)(new SchedulePriorityQueue.$Closure$8()));
            
            //#line 21 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16160 = ((x10.regionarray.Array)(new x10.regionarray.Array<ScheduledEvent>((java.lang.System[]) null, ScheduledEvent.$RTT).x10$regionarray$Array$$init$S(((x10.regionarray.Region)(t$16158)), ((x10.core.fun.Fun_0_1)(t$16159)), (x10.regionarray.Array.__1$1x10$lang$Point$3x10$regionarray$Array$$T$2) null)));
            
            //#line 21 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.Heap = ((x10.regionarray.Array)(t$16160));
        }
        return this;
    }
    
    
    
    //#line 27 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * First insert an event; Then increase the size; Last, adjust the Heap.
	 */
    public void push(ScheduledEvent event) {
        
        //#line 29 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Array t$16162 = ((x10.regionarray.Array)(this.Heap));
        
        //#line 29 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16161 = this.size;
        
        //#line 29 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final long t$16163 = ((long)(((int)(t$16161))));
        
        //#line 29 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final ScheduledEvent t$16164 = ((ScheduledEvent)(event));
        
        //#line 29 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        ((x10.regionarray.Array<ScheduledEvent>)t$16162).$set__1x10$regionarray$Array$$T$G((long)(t$16163), ((ScheduledEvent)(t$16164)));
        
        //#line 30 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16165 = this.size;
        
        //#line 30 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16166 = ((t$16165) + (((int)(1))));
        
        //#line 30 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.size = t$16166;
        
        //#line 31 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16167 = this.size;
        
        //#line 31 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int i = ((t$16167) - (((int)(1))));
        
        //#line 32 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16168 = i;
        
        //#line 32 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16169 = ((t$16168) + (((int)(1))));
        
        //#line 32 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16170 = ((t$16169) / (((int)(2))));
        
        //#line 32 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int parent = ((t$16170) - (((int)(1))));
        
        //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        while (true) {
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16171 = i;
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16172 = ((long)(((int)(t$16171))));
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            boolean t$16179 = ((t$16172) >= (((long)(1L))));
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            if (t$16179) {
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final ScheduledEvent t$16176 = ((ScheduledEvent)(event));
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final x10.regionarray.Array t$16174 = ((x10.regionarray.Array)(this.Heap));
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final int t$16173 = parent;
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final long t$16175 = ((long)(((int)(t$16173))));
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final ScheduledEvent t$16177 = ((x10.regionarray.Array<ScheduledEvent>)t$16174).$apply$G((long)(t$16175));
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                final int t$16178 = t$16176.compare$O(((ScheduledEvent)(t$16177)));
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                t$16179 = ((int) t$16178) == ((int) 0);
            }
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final boolean t$16198 = t$16179;
            
            //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            if (!(t$16198)) {
                
                //#line 37 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                break;
            }
            
            //#line 38 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16274 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 38 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16275 = i;
            
            //#line 38 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16276 = ((long)(((int)(t$16275))));
            
            //#line 38 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent temp$16277 = ((x10.regionarray.Array<ScheduledEvent>)t$16274).$apply$G((long)(t$16276));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16278 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16279 = i;
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16280 = ((long)(((int)(t$16279))));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16281 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16282 = parent;
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16283 = ((long)(((int)(t$16282))));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16284 = ((x10.regionarray.Array<ScheduledEvent>)t$16281).$apply$G((long)(t$16283));
            
            //#line 39 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            ((x10.regionarray.Array<ScheduledEvent>)t$16278).$set__1x10$regionarray$Array$$T$G((long)(t$16280), ((ScheduledEvent)(t$16284)));
            
            //#line 40 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16285 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 40 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16286 = parent;
            
            //#line 40 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16287 = ((long)(((int)(t$16286))));
            
            //#line 40 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            ((x10.regionarray.Array<ScheduledEvent>)t$16285).$set__1x10$regionarray$Array$$T$G((long)(t$16287), ((ScheduledEvent)(temp$16277)));
            
            //#line 42 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16288 = parent;
            
            //#line 42 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            i = t$16288;
            
            //#line 43 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16289 = i;
            
            //#line 43 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16290 = ((t$16289) + (((int)(1))));
            
            //#line 43 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16291 = ((t$16290) / (((int)(2))));
            
            //#line 43 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16292 = ((t$16291) - (((int)(1))));
            
            //#line 43 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            parent = t$16292;
        }
    }
    
    
    //#line 54 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * First record the min element---Heap(0);
	 * Second assign the last element to the root---Heap(0);
	 * Third decrease the size;
	 * Lastly, adjust the Heap.
	 */
    public ScheduledEvent pop() {
        
        //#line 56 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Array t$16199 = ((x10.regionarray.Array)(this.Heap));
        
        //#line 56 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final ScheduledEvent min = ((x10.regionarray.Array<ScheduledEvent>)t$16199).$apply$G((long)(0L));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Array t$16204 = ((x10.regionarray.Array)(this.Heap));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Array t$16202 = ((x10.regionarray.Array)(this.Heap));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16200 = this.size;
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final long t$16201 = ((long)(((int)(t$16200))));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final long t$16203 = ((t$16201) - (((long)(1L))));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final ScheduledEvent t$16205 = ((x10.regionarray.Array<ScheduledEvent>)t$16202).$apply$G((long)(t$16203));
        
        //#line 57 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        ((x10.regionarray.Array<ScheduledEvent>)t$16204).$set__1x10$regionarray$Array$$T$G((long)(0L), ((ScheduledEvent)(t$16205)));
        
        //#line 58 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16206 = this.size;
        
        //#line 58 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16207 = ((t$16206) - (((int)(1))));
        
        //#line 58 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.size = t$16207;
        
        //#line 59 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.adjustMinHeap((int)(0));
        
        //#line 60 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        return min;
    }
    
    
    //#line 64 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    public boolean empty$O() {
        
        //#line 65 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16208 = this.size;
        
        //#line 65 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final boolean t$16209 = ((int) t$16208) == ((int) 0);
        
        //#line 65 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        return t$16209;
    }
    
    
    //#line 71 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * Return the min element---Heap(0).
	 */
    public ScheduledEvent top() {
        
        //#line 72 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Array t$16210 = ((x10.regionarray.Array)(this.Heap));
        
        //#line 72 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final ScheduledEvent t$16211 = ((x10.regionarray.Array<ScheduledEvent>)t$16210).$apply$G((long)(0L));
        
        //#line 72 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        return t$16211;
    }
    
    
    //#line 78 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * Return the size of the Heap.
	 */
    public int size$O() {
        
        //#line 79 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16212 = this.size;
        
        //#line 79 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        return t$16212;
    }
    
    
    //#line 85 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * make the subTree whose root's index is i to be the minHeap
	 */
    private void adjustMinHeap(final int i) {
        
        //#line 89 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16213 = ((2) * (((int)(i))));
        
        //#line 89 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int lt = ((t$16213) + (((int)(1))));
        
        //#line 90 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16214 = ((2) * (((int)(i))));
        
        //#line 90 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int rt = ((t$16214) + (((int)(2))));
        
        //#line 92 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int smallest =  0;
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16215 = lt;
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16216 = this.size;
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        boolean t$16225 = ((t$16215) < (((int)(t$16216))));
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        if (t$16225) {
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16218 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16217 = lt;
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16219 = ((long)(((int)(t$16217))));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16222 = ((x10.regionarray.Array<ScheduledEvent>)t$16218).$apply$G((long)(t$16219));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16220 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16221 = ((long)(((int)(i))));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16223 = ((x10.regionarray.Array<ScheduledEvent>)t$16220).$apply$G((long)(t$16221));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16224 = t$16222.compare$O(((ScheduledEvent)(t$16223)));
            
            //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            t$16225 = ((int) t$16224) == ((int) 0);
        }
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final boolean t$16228 = t$16225;
        
        //#line 97 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        if (t$16228) {
            
            //#line 98 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16226 = lt;
            
            //#line 98 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            smallest = t$16226;
        } else {
            
            //#line 100 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16227 = i;
            
            //#line 100 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            smallest = t$16227;
        }
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16229 = rt;
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16230 = this.size;
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        boolean t$16240 = ((t$16229) < (((int)(t$16230))));
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        if (t$16240) {
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16232 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16231 = rt;
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16233 = ((long)(((int)(t$16231))));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16237 = ((x10.regionarray.Array<ScheduledEvent>)t$16232).$apply$G((long)(t$16233));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16235 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16234 = smallest;
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16236 = ((long)(((int)(t$16234))));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16238 = ((x10.regionarray.Array<ScheduledEvent>)t$16235).$apply$G((long)(t$16236));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16239 = t$16237.compare$O(((ScheduledEvent)(t$16238)));
            
            //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            t$16240 = ((int) t$16239) == ((int) 0);
        }
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final boolean t$16242 = t$16240;
        
        //#line 106 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        if (t$16242) {
            
            //#line 107 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16241 = rt;
            
            //#line 107 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            smallest = t$16241;
        }
        
        //#line 113 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16243 = smallest;
        
        //#line 113 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final boolean t$16257 = ((int) t$16243) != ((int) i);
        
        //#line 113 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        if (t$16257) {
            
            //#line 114 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16244 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 114 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16245 = ((long)(((int)(i))));
            
            //#line 114 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            ScheduledEvent temp = ((x10.regionarray.Array<ScheduledEvent>)t$16244).$apply$G((long)(t$16245));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16249 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16250 = ((long)(((int)(i))));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16247 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16246 = smallest;
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16248 = ((long)(((int)(t$16246))));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16251 = ((x10.regionarray.Array<ScheduledEvent>)t$16247).$apply$G((long)(t$16248));
            
            //#line 115 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            ((x10.regionarray.Array<ScheduledEvent>)t$16249).$set__1x10$regionarray$Array$$T$G((long)(t$16250), ((ScheduledEvent)(t$16251)));
            
            //#line 116 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.regionarray.Array t$16253 = ((x10.regionarray.Array)(this.Heap));
            
            //#line 116 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16252 = smallest;
            
            //#line 116 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final long t$16254 = ((long)(((int)(t$16252))));
            
            //#line 116 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final ScheduledEvent t$16255 = ((ScheduledEvent)(temp));
            
            //#line 116 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            ((x10.regionarray.Array<ScheduledEvent>)t$16253).$set__1x10$regionarray$Array$$T$G((long)(t$16254), ((ScheduledEvent)(t$16255)));
            
            //#line 120 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16256 = smallest;
            
            //#line 120 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.adjustMinHeap((int)(t$16256));
        }
    }
    
    public static void adjustMinHeap$P(final int i, final SchedulePriorityQueue SchedulePriorityQueue) {
        SchedulePriorityQueue.adjustMinHeap((int)(i));
    }
    
    
    //#line 127 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * From the middle position to build a minHeap by invoke the adjustMinHeap
	 */
    private void buildMinHeap() {
        
        //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16259 = this.size;
        
        //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16260 = ((t$16259) / (((int)(2))));
        
        //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        int i = ((t$16260) - (((int)(1))));
        
        //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        for (;
             true;
             ) {
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16261 = i;
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final boolean t$16265 = ((t$16261) >= (((int)(0))));
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            if (!(t$16265)) {
                
                //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                break;
            }
            
            //#line 129 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16293 = i;
            
            //#line 129 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            this.adjustMinHeap((int)(t$16293));
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16294 = i;
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final int t$16295 = ((t$16294) - (((int)(1))));
            
            //#line 128 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            i = t$16295;
        }
    }
    
    public static void buildMinHeap$P(final SchedulePriorityQueue SchedulePriorityQueue) {
        SchedulePriorityQueue.buildMinHeap();
    }
    
    
    //#line 136 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    /**
	 * NOT use.
	 */
    public void print() {
        
        //#line 137 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final long t$16268 = ((long)(((int)(0))));
        
        //#line 137 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16266 = this.size;
        
        //#line 137 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final int t$16267 = ((t$16266) - (((int)(1))));
        
        //#line 137 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final long t$16269 = ((long)(((int)(t$16267))));
        
        //#line 137 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        x10.regionarray.Region Reg1 = ((x10.regionarray.Region)(x10.regionarray.Region.make((long)(t$16268), (long)(t$16269))));
        
        //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.regionarray.Region t$16297 = ((x10.regionarray.Region)(Reg1));
        
        //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.lang.Iterator p$16298 = t$16297.iterator();
        
        //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        for (;
             true;
             ) {
            
            //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final boolean t$16299 = ((x10.lang.Iterator<x10.lang.Point>)p$16298).hasNext$O();
            
            //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            if (!(t$16299)) {
                
                //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
                break;
            }
            
            //#line 138 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            final x10.lang.Point p$16296 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$16298).next$G()));
        }
        
        //#line 141 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        final x10.io.Printer t$16273 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 141 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        t$16273.println(((java.lang.Object)("------------------------------------------------")));
    }
    
    
    //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    final public SchedulePriorityQueue SchedulePriorityQueue$$this$SchedulePriorityQueue() {
        
        //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        return SchedulePriorityQueue.this;
    }
    
    
    //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
    final public void __fieldInitializers_SchedulePriorityQueue() {
        
        //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.len = 0;
        
        //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.size = 0;
        
        //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.Heap = null;
        
        //#line 8 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
        this.Reg = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$8 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$8> $RTT = 
            x10.rtt.StaticFunType.<$Closure$8> make($Closure$8.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.Types.ANY)
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(SchedulePriorityQueue.$Closure$8 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$8.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            SchedulePriorityQueue.$Closure$8 $_obj = new SchedulePriorityQueue.$Closure$8((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$8(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply((x10.lang.Point)a1);
            
        }
        
        
    
        
        public java.lang.Object $apply(final x10.lang.Point id$10479) {
            
            //#line 21 "D:/x10ws/ASDC2/src/SchedulePriorityQueue.x10"
            return null;
        }
        
        public $Closure$8() {
             {
                
            }
        }
        
    }
    
}

