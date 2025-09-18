public class StringDelete{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Javac");
        System.out.println("Original string: " + sb);
        char deletedChar = sb.charAt(4);
        sb.deleteCharAt(4);
        System.out.println("Deleted character: " + deletedChar);
        System.out.println("Modified string: " + sb);
    }
}
