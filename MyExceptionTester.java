package day4assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTester {
	public static void main(String[] args) {
		int tester=1;
		int number=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			try
			{
				System.out.println("“Please enter a number or enter ‘-1’ if you want to quit” : ");
				number=sc.nextInt();
				try
				{
						if(number>100)
							throw new MyExceptionHandler(number); 
						else {
								if(number==-1)
								{
								 tester=0;
									continue;
								}
								if(number%2==0)
									System.out.println("“You must enter an even integer. ”");
								else
									System.out.println("“You have entered an odd number. ”");
									
								}
				}
				catch ( MyExceptionHandler ex) 
		        { 
		            System.out.println(ex.getMessage()); 
		        } 
			
			}
			catch(InputMismatchException e)
			{
				System.out.println("“You must enter an integer.”");
			}
			
			sc.nextLine();
		}while(tester!=0);
		System.out.println("Exit from the program");
		
		sc.close();
	}

}
