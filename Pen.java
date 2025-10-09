import java.util.Scanner;

public class Pen
{
    String name;
    String type;

    public void write()
    {
        System.out.println("It is used to write");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        System.out.print("Enter pen name: ");
        p1.name = sc.nextLine();
        System.out.print("Enter pen type: ");
        p1.type = sc.nextLine();
        p1.write();
        sc.close();
    }
}
