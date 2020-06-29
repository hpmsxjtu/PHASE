/*
 * 可以运行，right!
 * 每个Agent的Label不一样,0是空,1是Predator,2是Prey.
 * 每个Agent都有8个邻居
 * 楼下服务器实验使用
 * 实验规格：
 * 1600*1600,
 * equal number
 * Predator:20000-180000/40000
 * Prey:20000-180000/40000
 * Prey策略：遇到空格即迁移，不考虑Predator的影响；
 * Predator策略：遇到Prey就吃掉，没有遇到则找一个空格跳过该空格。
 * 可以计算Prey=0的收敛时间
 */

public class PPRun {
	
	public static def main(Rail[String]):void 
	{
	    var Step:Int=0 as Int;
		val Run=new PPModel();
		val DC:DataCollection = new DataCollection();
		
		var Uptime:Long = -System.nanoTime();	
		
		Run.initSchedule();//调度初始化
		Run.getRunner().run();

		Uptime += System.nanoTime();
		Uptime /= 1000000;//将时间由纳秒转化为毫秒
		DC.RecordWrite(""+Uptime+" \t1600*1600_Predator:20000-Prey:20000_numAllPlaces:"+Place.numAllPlaces()+"  numPlaces()"+Place.numPlaces());
		//Console.OUT.println(""+Uptime+" \t1600*1600_Predator:20000-Prey:20000_numAllPlaces:"+Place.numAllPlaces()+"  numPlaces()"+Place.numPlaces());
		Console.OUT.println("\n\r"+" Predator-Prey model is over.\n"+"  "+"Total time consuming is "+"Total time consuming is "+ Uptime +"ms.");
	}

}