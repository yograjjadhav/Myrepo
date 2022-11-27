import java.util.Scanner;
public class Power 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for base value :");
        int base = sc.nextInt();
        System.out.println("Enter a number for raise value :");
        int raise = sc.nextInt();
        int power = 1;
        for(int i = 1 ; i<=raise ; i++)
        {
            power = power * base ;
        }
        System.out.println(base+"^"+raise+" = " +power);
        sc.close();

    }
    
}
