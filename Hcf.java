import java.util.Scanner;
public class Hcf
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Find the HCF of two numbers. -----");
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        int least = n1 < n2 ? n1:n2;
        while(true)
        {
            if(n1%least==0 && n2%least==0)
            {
                System.out.println("HCF = "+least);
                break;
            }
            least--;
        }

        sc.close();
    }
    
}
