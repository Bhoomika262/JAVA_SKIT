import java.util.Scanner;

public class AddFunction
{
    public static void sum(int a,int b)
    {
        System.out.println("a+b="+(a+b));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        sum(a,b);
    }      
}