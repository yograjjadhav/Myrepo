import java.util.Scanner;
	class Palindrome
	{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("----- Check whether number is Palindrome or not. -----");
			System.out.println("Enter a number : ");
			int num = sc.nextInt();
			int rev = 0,temp=num;
			while(num>0)
			{
				int rem = num%10;
				rev = (rev*10)+rem;
				num/=10;
			}
			System.out.println("The reversed number is "+rev);
			if(temp==rev)
			{
				System.out.println(rev+" is a Palindrome.");
			}
			else
			{
				System.out.println(rev+" is not a Palindrome.");
			}
		}
	}
	