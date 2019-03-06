import x10.regionarray.Array;

public class Launcher {
	public static def main(args: Rail[String]) {
		var Uptime:Long = -System.nanoTime();
		var model:Model;
		model = new Model(); 
		model.initSchedule();
		model.getRunner().run();
		
		Console.OUT.println("The simulation is Terminated!");
		Uptime += System.nanoTime();
		Uptime /= 1000000;//将时间由纳秒转化为毫秒
		Console.OUT.println("\n\r" +"  Game of life is over.\n" +"  Total time consuming is " +Uptime +"ms.");

	}
}