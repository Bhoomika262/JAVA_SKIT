import java.util.Scanner;

class StringLength
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        int length=str.length();
        System.out.print("The length of the string that you have entered is: "+length);
        sc.close();
    }
}