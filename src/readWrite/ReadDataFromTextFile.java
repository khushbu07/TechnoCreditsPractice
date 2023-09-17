package readWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException  {
		
		//Approach1: Using FileReader class and BufferedReader class
		
//		FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\Programs\\fis.txt");
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		 while((str=br.readLine())!= null){
//			 System.out.println(str);
//		}
//        br.close();
        
        
      //Approach2: Using Scanner & file
//       File file=new File("C:\\Users\\Dell\\Desktop\\Programs\\fis.txt");
//       Scanner sc=new Scanner(file);
//       while(sc.hasNextLine()){
//    	   System.out.println(sc.nextLine());
//       }
       
       //Approach3: Using Scanner & file but without loop and used usDelimeter method
       File file=new File("C:\\Users\\Dell\\Desktop\\Programs\\fis.txt");
       Scanner sc=new Scanner(file);
       sc.useDelimiter("\\z");
       System.out.println(sc.next());
       
        
	}

}
