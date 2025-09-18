import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        {
            System.out.println(str + " is a palindrome.");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome.");
        }
        sc.close();
    }
}
