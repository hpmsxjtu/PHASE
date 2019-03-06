import x10.array.Array_2;


public class Array_2Test {
    public static def main(args: Rail[String]) {

    	var N:long = 3;
    	var M:long = 2;
    	val a = new Array_2[long](N, M, (i:long,j:long)=>(i*j));        //N row,M rol 
    	val b = new Array_2[long](N, M, (i:long,j:long)=>(i-j));
    	val c = new Array_2[long](N, M, (i:long,j:long)=>(i+j));
    	Console.OUT.println("array a(i*j) :");
    	for(i in 0..(N-1))
    	{
    		for(j in 0..(M-1))
    		{
    			Console.OUT.print(a(i,j)+" ");
    		}
    		Console.OUT.println();
    	}
    	
    	Console.OUT.println("array b(i-j) :");
    	for(i in 0..(b.numElems_1-1))
    	{
    		for(j in 0..(b.numElems_2-1))
    		{
    			Console.OUT.print(b(i,j)+" ");
    		}
    		Console.OUT.println();
    	}
    	
    	Console.OUT.println("array c(i+j) :");
    	for([i,j] in a.indices())
    	{
    		Console.OUT.print(c(i,j)+" ");
    		if(j==M-1)
    			Console.OUT.println();
    	}
    	//Êä³öÁ¿
    	Console.OUT.println("a's para : N="+N+";a.numElems_1 = "+a.numElems_1+"; a.numElems_2 = "+a.numElems_2+"; a.indices = "+a.indices());
    	Console.OUT.println("b's para : N="+N+";b.numElems_1 = "+b.numElems_1+"; b.numElems_2 = "+b.numElems_2+"; b.indices = "+b.indices());
    	Console.OUT.println("c's para : N="+N+";c.numElems_1 = "+c.numElems_1+"; c.numElems_2 = "+c.numElems_2+"; c.indices = "+c.indices());
    	Console.OUT.println("a:");
    	Console.OUT.println(a);
    	//Console.OUT.println(a.numElema_3);
    	Console.OUT.println("a.size : "+a.size);       //the size of a: a.size
    	for(i in 0..(a.numElems_1-1))
    	{
    		for(j in 0..(a.numElems_2-1))
    			Console.OUT.print("a("+i+","+j+")="+a(i,j)+"; ");
    	}
    	Console.OUT.println();
    	
    	
    	//val d:(i:long,j:long)=>long = new Array_2(N, M, (i:long,j:long)=>(i*j) as long);
    	val d= new Array_2[long](N, M, (i:long,j:long)=>(i*j));
    	Console.OUT.println("d.numElems_1:"+d.numElems_1+"; d.numElems_2:"+d.numElems_2);
    	for(i in 0..(d.numElems_1-1))
    	{
    		for(j in 0..(d.numElems_2-1))
    			Console.OUT.print("d("+i+","+j+")="+d(i,j)+"; ");        //Why£¿£¿£¿£¿d(0,0)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; d(0,1)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; d(1,0)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; d(1,1)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; d(2,0)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; d(2,1)=(x10.lang.Long,x10.lang.Long)=>x10.lang.Long@152912f; 
    	}
    	Console.OUT.println();
    	Console.OUT.println(" i in d:");
    	for(i in d){
    		Console.OUT.print(i+" ");
    	}
    }
}