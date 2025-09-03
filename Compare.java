import java.util.Scanner;

class Compare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        if(num1>num2)
        System.out.print(num1+" is greater than "+num2);
        else if(num2>num1)
        System.out.print(num2+" is greater than "+num1);
        else
        System.out.print("Both are equal");
        sc.close();
    }
}