import java.util.Scanner;

class Adult
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18)
        System.out.print("Yor are an adult");
        else
        System.out.print("You are not an adult");
        sc.close();
    }
}