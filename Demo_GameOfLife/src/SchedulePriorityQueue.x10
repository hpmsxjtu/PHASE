import x10.regionarray.Array;
import x10.regionarray.Region;

/**
 * use the min Heap
 */

public class SchedulePriorityQueue {
	private var len: int;	//defalt length of Heap
	private var size: int;		//Number of the elements
	
	private var Heap: Array[ScheduledEvent](1);//
	private var Reg: Region(1);	
	
	//private var event: ScheduledEvent = null;
	
	public def this(){
		len = Setting.LEN_PRIORITYQUEUE as int;
		size = 0n;
		Reg =Region.make(0n,len-1n);
		Heap = new Array[ScheduledEvent](Reg, (Point)=>null);//(Point=>null)
	}
	
	/**
	 * First insert an event; Then increase the size; Last, adjust the Heap.
	 */
	public def push(var event:ScheduledEvent):void{
		//need adjust the Heap
		Heap(size) = event;//
		size ++;
		var i:int = size - 1n;
		var parent: int = ((i+1n)/2n)-1n;
		
		/**
		 * Only when the new event has smaller tick than its parent, adjust the Heap.
		 */
		while(i>=1 && (event.compare(Heap(parent)) == 0n)){
			val temp = Heap(i);
			Heap(i) = Heap(parent);
			Heap(parent) = temp;
			
			i = parent;
			parent = ((i+1n)/2n) -1n;
		}
		
	}
	
	/**
	 * First record the min element---Heap(0);
	 * Second assign the last element to the root---Heap(0);
	 * Third decrease the size;
	 * Lastly, adjust the Heap.
	 */
	public def pop():ScheduledEvent{	
		//need adjust the Heap
		val min: ScheduledEvent = Heap(0);
		Heap(0) = Heap(size-1);
		size--;
		adjustMinHeap(0n);
		return min;
	}
	
	
	public def empty():boolean{
		return size == 0n;
	}
	
	/**
	 * Return the min element---Heap(0).
	 */
	public def top():ScheduledEvent{
		return Heap(0);
	}
	
	/**
	 * Return the size of the Heap.
	 */
	public def size():int{
		return size;
	}
	
	/**
	 * make the subTree whose root's index is i to be the minHeap
	 */
	private def adjustMinHeap(i:int):void{//
		/**
		 * the index is begin from 0
		 */
		var lt: int = 2n * i + 1n;	//left child
		var rt: int = 2n * i + 2n;	//right child
		
		var smallest: int;	//used to store the smallest node's index
		
		/**
		 * if the left child is smaller than the parent, then smallest will be lt
		 */
		if(lt<size && (Heap(lt).compare(Heap(i)) == 0n)){
			smallest = lt;
		}else{
			smallest = i as int;
		}
		
		/**
		 * if the right child is smaller than the smallest, then smallest will be rt.
		 */
		if(rt<size && (Heap(rt).compare(Heap(smallest))) == 0n){
			smallest = rt;
		}
		
		/**
		 * when smallest != i, then swap the smallest with i.
		 */
		if(smallest != i){
			var temp:ScheduledEvent = Heap(i);
			Heap(i) = Heap(smallest);
			Heap(smallest) = temp;
			/**
			 * after the up change, it should have a new adjust with the smallest as the root of the sub tree.
			 */
			adjustMinHeap(smallest);
		}
	}
	
	/**
	 * From the middle position to build a minHeap by invoke the adjustMinHeap
	 */
	private def buildMinHeap():void{//
		for(var i:int= (size / 2n)-1n; i>=0n; i--){
			adjustMinHeap(i);
		}
	}
	
	/**
	 * NOT use.
	 */
	public def print():void{
		var Reg1:Region(1)= Region.make(0n,size-1n);
		for(p in Reg1){
			
		}
		Console.OUT.println("------------------------------------------------");
	}
}