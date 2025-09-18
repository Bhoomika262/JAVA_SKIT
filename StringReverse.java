public class StringReverse{
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse(); 
        System.out.println("Reversed string: " + sb);
    }
}
