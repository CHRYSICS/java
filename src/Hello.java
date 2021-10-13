import java.util.Scanner;

public class Hello
{
	public static void main(String[] args) 
	{
	
		if(args.length == 2) 
		{
			// check if args given
			System.out.println("Hello " + args[0] + " " + args[1] + "!");
		} 
		else 
		{
			// prompt user for name
			Scanner input = new Scanner (System.in);
			System.out.print("Input first name: ");
			String fname = input.next();
			System.out.print("Input last name: ");
			String lname = input.next();
			System.out.println("Hello " + fname + " " + lname + "!");
		}
	}
}