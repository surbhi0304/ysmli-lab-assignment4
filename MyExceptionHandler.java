package day4assignment;

public class MyExceptionHandler extends Exception {
	public  MyExceptionHandler(int number) {
		super("Number can't be greater than [ "+ number+" ]."); 
	}

}
