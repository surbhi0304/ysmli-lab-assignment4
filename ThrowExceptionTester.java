package day4assignment;

import java.io.IOException;

public class ThrowExceptionTester
{
	public static void main(String[] args)
	{
		ThrowException ob=new ThrowException();
		try {
			ob.ThrowException();
			throw new InputExceptionHandler("InputException Occurs");
		} catch (InputExceptionHandler | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
					}
	}
}
