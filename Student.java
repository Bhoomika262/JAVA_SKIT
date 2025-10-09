import java.util.Scanner;

public class Student
{
    String name;

    public Student()
    {
        name = "Not Assigned";
        System.out.println("Default constructor called");
    }

    public Student(String n)
    {
        name = n;
        System.out.println("Parameterized constructor called");
    }

    public Student(Student s)
    {
        name = s.name;
        System.out.println("Copy constructor called");
    }

    public void display()
    {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.display();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        Student s2 = new Student(name);
        s2.display();
        Student s3 = new Student(s2);
        s3.display();
        sc.close();
    }
}
