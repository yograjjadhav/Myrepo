import java.util.Scanner;
public class ProductOfDigits 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int mul = 1;
        while(num>0)
        {
            int rem = num%10;
            num = num/10;
            mul = mul*rem;
        }
        System.out.println("Multiplication of all digits : "+ mul);
    }
    
}
