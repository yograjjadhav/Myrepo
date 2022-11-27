import java.util.Scanner;
class read1
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----:Addition of two numbers:----");
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		System.out.println("The sum of "+a+" and "+b+ " is "+(a+b));
		System.out.println("End of the program.");
	}
}