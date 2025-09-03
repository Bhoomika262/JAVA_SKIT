import java.util.Scanner;

class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int r=sc.nextInt();
        int arr[]=new int[r];
        System.out.print("Enter "+r+" numbers for array: ");
        for(int i=0;i<r;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("This is your array ");
        for(int i=0;i<r;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}