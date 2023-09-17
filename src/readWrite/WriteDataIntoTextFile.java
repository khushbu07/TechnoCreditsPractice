package readWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		
		FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\Programs\\Coforge.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Difference b/w abstract and interface");
		bw.write("\ndiff b/w Stringbuffer & String builder");
		
		System.out.println("Check location : file and its content");
		bw.close();
				
		
		
     
		

	}

}
