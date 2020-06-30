public class Setting {
	
	//������Ϸ�趨
	public static val Agent_Quantity:Int=20000 as Int;//Agent��ʼ����
	public static val Iteration_Step=5 as Int;//������Ϸ��������
	//public static val File_Location="../DataCollection/" as String;//�����ռ�λ��
	public static val File_Location="F:/DataCollection/" as String;//�����ռ�λ��
	
	/**
	 * The default number of agents in Context.
	 * 
	 * It's also the len of agentArray.
	 * 
	 * It should less then size of a real projection, 
	 * such as: MAX_NUM_AGENT < Grid.width * Grid.height.
	 */
	public static val MAX_NUM_AGENT = 10000;//The initial count of agent
	
	
	
	/**
	 * The default len of Heap in PriorityQueue.
	 */
	public static val LEN_PRIORITYQUEUE = 1000;//The length of priority queue
	
}
