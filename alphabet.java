import java.util.Scanner;
public class alphabet
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Alphabets from A to Z -----");
        char start = 'a';
        while(start<='z')
        {
            System.out.println(start);
            start++;
        }


    }   
}
