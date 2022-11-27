import java.util.Scanner;
public class Lcm
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Find the LCM of two numbers. -----");
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        int big = n1>n2 ? n1:n2;
       /* while(true)
        {
            if(big%n1==0 && big%n2==0)
            {
                System.out.println("LCM = "+big);
                break;
            }
            big++;

        }*/
        for(;;)
        {
            if(big%n1==0 && big%n2==0)
            {
                System.out.println("LCM = "+big);
                break;

            }
            big++;
        }



        sc.close();
    }

    
}
