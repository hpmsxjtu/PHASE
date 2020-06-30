import x10.regionarray.Array;

public class Launcher {
	public static def main(args: Rail[String]) {		
		var model:GameOfLifeModel;
		model = new GameOfLifeModel(); 
		//���ĵĵط����ڳ���ʼʱ��ʼ��agent��״̬
		var GOLEventSequence:GameOfLifeEventSequence;
		GOLEventSequence=new GameOfLifeEventSequence();		
		model.initSchedule(GOLEventSequence);
		var Uptime:Long = -System.nanoTime();
		GOLEventSequence.init();		
		model.getRunner().run();
		Uptime += System.nanoTime();
		Uptime /= 1000000;//��ʱ��������ת��Ϊ����
		Console.OUT.println("\n\r" +"  Game of life is over.\n" +"  Total time consuming is " +Uptime +"ms.");

	}
}