/**
 * SubClass of Functor, used to wrapped agent's method.
 * But how to wrapped agent's any method ???
 */

public class ScheduleMethodFunctor extends Functor {
	var eventSum:PPEventSequence;
	val i:int;
	
	public def this(eventSum:PPEventSequence, i:int){
		this.eventSum = eventSum;
		this.i = i;
	}
	
	/**
	 * To call agent's method of step1, step2, or step3.
	 * The content of step is varied.
	 * The moduler can specify to invoke agent's other action,
	 * and these actions' sequence can async.
	 */
	public operator this(){
		switch (i){
		     case 1n:	eventSum.step1();
		                break;
		     case 2n:    eventSum.step2();
		                break;
		     case 3n:    eventSum.step3();
		                break;
		     case 4n:    eventSum.step4();
		     			break;
		}
	}
}