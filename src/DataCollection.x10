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
	
	public def RecordBuild(RecordName:String)
	{	
		DataFile=Setting.File_Location+RecordName as String;
		File = new File(DataFile);
		FileWrite:FileWriter = new FileWriter(File);
		Console.OUT.println("RecordBuild Finished "+RecordName+"\n");
	}
	
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