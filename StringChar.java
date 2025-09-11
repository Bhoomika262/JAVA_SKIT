import java.util.Scanner;

class StringChar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Characters in the string:");
        for (int i = 0; i < str.length(); i++) 
        {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}