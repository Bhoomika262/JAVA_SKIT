import java.util.Scanner;

class A
{
    String name;
    void showA()
    {
        System.out.println(name + " is in class A");
    }
}

class B extends A
{
    void showB()
    {
        System.out.println(name + " is in class B");
    }
}

class C extends B
{
    void showC()
    {
        System.out.println(name + " is in class C");
    }
}

interface D
{
    void showD();
}

class E extends A implements D
{
    public void showD()
    {
        System.out.println(name + " is in class E using interface D");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();

        B obj1 = new B();   
        obj1.name = n;
        obj1.showA();
        obj1.showB();

        C obj2 = new C();
        obj2.name = n;
        obj2.showA();
        obj2.showB();
        obj2.showC();

        E obj3 = new E();  
        obj3.name = n;
        obj3.showA();
        obj3.showD();

        sc.close();
    }
}
