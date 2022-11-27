import java.util.Scanner;
class Practice
{
    public static void main(String [] args)
    {
       /*int a=10;
        int b=20;
        System.out.println("Before swapping a = "+a+"\nBefore swapping b= "+b);
        //swapping of numbers without using temp variable.
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a = "+a+"\nAfter swapping b= "+b);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num==(num/2)*2)
        {
            System.out.println(num +" is an even number.");
        }
        else
        {
            System.out.println(num+" is an odd number.");
        }

    }
    
}
