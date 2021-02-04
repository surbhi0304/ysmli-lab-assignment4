package day4assignment;

import day4assignment.InputExceptionHandler;
import java.io.IOException;

class ThrowException
{
 ThrowException()
 {
	 
 }
 void ThrowException() throws InputExceptionHandler, IOException
 {
	 System.out.println("In throwException Method");
	 throw new IOException("IOException Occurs");
 }
}

