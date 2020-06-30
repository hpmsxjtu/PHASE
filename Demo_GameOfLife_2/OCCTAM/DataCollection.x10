import x10.io.File;
import x10.io.Reader;
import x10.io.FileReader;
import x10.io.Writer;
import x10.io.FileWriter;
import x10.io.Printer;

public class DataCollection {
	public var DataFile:String;
	public var DataRecord:String;
	public var File:File;
	public var FileWrite:FileWriter; 
	
	public def this()
	{
	}
	
	/*
	public def FileRead()
	{	
		finish for(p in Place.places())
			at(p) async
			{
				val f = new File("F:/FileTxt.txt");
				var fr:FileReader = new FileReader(f);
				var skipp:Int = p.id as Int;
				fr.skip(13*skipp);
				var str1:String = fr.readLine();
				var str2:String = fr.readLine();
				var str3:String = fr.readLine();
				//var str4:String = fr.readLine();
				Console.OUT.println("This is place"+p.id+" file contents "+"\n"+"\r"+"\r"+"\n"+" Line1 "+str1+" Line2 "+str2+" Line3 "+str3);
			}
	}
	*/
	
	public def RecordBuild(RecordName:String)
	{	
		DataFile=Setting.File_Location+RecordName as String;
		File = new File(DataFile);
		FileWrite:FileWriter = new FileWriter(File);
		Console.OUT.println("RecordBuild Finished "+RecordName+"\n");
	}
/*	
	public def RecordWrite(Record:String)
	{	
		DataFile=Setting.File_Location+"File.txt" as String;
		File = new File(DataFile);
		FileWrite:FileWriter = new FileWriter(File);
		Console.OUT.println("WriteContext "+Record+"\n");
		Console.OUT.println(DataFile);
		FileWrite.write(Record);
		FileWrite.write("\r\n");
		FileWrite.flush(); 
		Console.OUT.println("WriteFinished");
	}

	public def RecordWrite(Record:String)
	{	
		DataFile=Setting.File_Location+"File.txt" as String;
		
		class IOException extends Exception {};
		try {
			File = new File(DataFile);
			FileWrite:FileWriter = new FileWriter(File,true);
		} catch (IOException) {Console.OUT.println("FileWrite Failed"); }
	
		Console.OUT.println("WriteContext "+Record+"\n");
		Console.OUT.println(DataFile);
		FileWrite.write(Record);
		FileWrite.write("\r\n");
		FileWrite.flush();
		FileWrite.flush();
		Console.OUT.println("WriteFinished");
	}
*/	
	public def RecordWrite(Record:String)
	{	
		DataFile=Setting.File_Location+"File.txt" as String;
		File = new File(DataFile);
		FileWrite:FileWriter = new FileWriter(File,true);
		//Console.OUT.println("WriteContext "+Record+"\n");
		//Console.OUT.println(DataFile);
		FileWrite.write(Record);
		FileWrite.write("\r\n");
		FileWrite.flush();
		FileWrite.close();
		//Console.OUT.println("WriteFinished");
	}
	

}