package day4assignment;

import java.io.*;

public class ReadFromFile {
	 public static void main(String args[])
	 {    
		  try{    
			    FileInputStream fin=new FileInputStream("gita");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1)
			    {    System.out.print(i);
			     System.out.print((char)i);    
			    }		    
		    bin.close();    
		    fin.close();    
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
