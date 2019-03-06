public class GameOfLifeRun {
	
	public static def main(Rail[String]):void 
	{
		var Step:Int=0 as Int;
		val Run=new GameOfLifeModel();
		var Uptime:Long = -System.nanoTime();				
		
		Run.initSchedule();//调度初始化
		Run.getRunner().run();

		Uptime += System.nanoTime();
		Uptime /= 1000000;//将时间由纳秒转化为毫秒
		Console.OUT.println("\n\r"+"Game of life is over.\n"+"  "+"Total time consuming is "+"Total time consuming is "+ Uptime +"ms.");
	}

}