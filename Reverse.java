import java.util.*;

class Reverse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a,b=0;
        while(n!=0)
        {
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        System.out.print(b);
    }
}