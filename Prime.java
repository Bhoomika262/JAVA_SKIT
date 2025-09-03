import java.util.Scanner;

class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean prime=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                prime=true;
        }
        if(prime==true)
            System.out.print(n+" is not a prime number");
        else
            System.out.print(n+" is a prime number");
    }
}