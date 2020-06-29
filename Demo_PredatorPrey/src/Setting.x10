public class Setting {
	
	//设定
	public static val PreyNum:Int=20000 as Int;//Agent初始数量
	public static val PredatorNum:Int=20000 as Int;//Agent初始数量
	public static val N:Int=20000 as Int;//Agent初始数量
	public static val Iteration_Step=(4+3*Setting.N) as Int;//生命游戏迭代次数
	
	public static val File_Location="../DataCollection/DC_File1.xls" as String;//数据收集位置
	//public static val File_Location="../DataCollectionTest1/DC_File3.xls" as String;//数据收集位置
	
	/**
	 * The default number of agents in Context.
	 * 
	 * It's also the len of agentArray.
	 * 
	 * It should less then size of a real projection, 
	 * such as: MAX_NUM_AGENT < Grid.width * Grid.height.
	 */
	public static val MAX_NUM_AGENT = 1000000;//The initial count of agent
	
	
	
	/**
	 * The default len of Heap in PriorityQueue.
	 */
	public static val LEN_PRIORITYQUEUE = 1000000;//The length of priority queue
	
}