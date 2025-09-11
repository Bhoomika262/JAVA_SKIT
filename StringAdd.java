import java.util.Scanner;

class StringAdd
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1=sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2=sc.nextLine();
        System.out.println(str1+" "+str2);
        sc.close();
    }
}