import java.util.Scanner;

class SumAverage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter number"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum is: "+sum);
        float avg=sum/n;
        System.out.println("Average is "+avg);
    }
}