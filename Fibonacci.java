import java.util.*;

class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int first=0,second=1,third;
        System.out.print(first+"\t"+second);
        for(int i=1;i<=n;i++)
        {
            third=first+second;
            System.out.print("\t"+third);
            first=second;
            second=third;
        }
        sc.close();
    }    
}