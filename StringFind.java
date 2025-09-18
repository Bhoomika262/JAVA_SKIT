import java.util.Scanner;

class StringFind
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence="This is a Java lab";
        String name=sentence.substring(10,sentence.length());
        System.out.print(name);
    }
}