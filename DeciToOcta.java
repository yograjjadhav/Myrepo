import java.util.Scanner;
public class DeciToOcta
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int octa=0;
        while(num > 0 )
        {
            int rem = num%8;
            num = num/8;
            System.out.print(rem);
            rem = rem*10;
        }
    }   
}
