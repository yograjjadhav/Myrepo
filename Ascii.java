import java.util.Scanner;
public class Ascii 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character to find its Ascii value : ");
        char ch = sc.next().charAt(0);
        int asc = ch;
        System.out.println(asc);
        sc.close();
    }
}
