import java.util.Scanner;

class MinMax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n,min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " integers:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Your maximum is "+max);
        System.out.println("Your minimum is "+min);
        sc.close();        
    }
}