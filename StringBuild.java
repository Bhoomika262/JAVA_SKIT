public class StringBuild
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'Z');
        System.out.println(sb);        
    }
}