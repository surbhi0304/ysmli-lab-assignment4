package day4assignment;

import java.io.*;

public class WriteToFile {
	 public static void main(String args[])
	 {    
		  try
		  { 
			  BufferedReader brreader = new BufferedReader(new InputStreamReader(System.in));
			  BufferedWriter brwriter = new BufferedWriter(new FileWriter(new File("UserInput")));
			  System.out.println("Enter the data you want to add in file: ");
		  String line = "";
		  String data="";
	        while ((line = brreader.readLine()) != null && !line.equals("exit"))
	          data += line ; 
	        brwriter.write(data);
	        brreader.close();  
	        brwriter.close();
		  }
		  catch(FileNotFoundException e)
		  {
			  System.out.println(e.getMessage());
		  }    
		  catch(IOException e)
		  {
			  System.out.println(e.getMessage());
		  } 
    }    

}
