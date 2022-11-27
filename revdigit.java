import java.util.Scanner;
public class revdigit 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int sum= 0;
        System.out.println("Reversed number : ");
        while(num>0)
        {
            int rem = num%10;
            num/=10;
            System.out.print(rem);
            count++;
            sum=sum+rem;
        }
        System.out.println("\nCount of digits : "+count);
        System.out.println("Sum of digits of number : " + sum);
        
    }    
}
