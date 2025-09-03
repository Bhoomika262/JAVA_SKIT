import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.print("Factorial of "+n+" is "+f);
        sc.close();
    }
}