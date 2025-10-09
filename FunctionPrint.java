import java.util.Scanner;

public class FunctionPrint
{
    public static void printName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter yout name: ");
        String name=sc.next();
        printName(name);
        sc.close();
    }       
}