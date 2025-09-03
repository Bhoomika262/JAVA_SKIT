import java.util.Scanner;

class VowelConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char lowercasech = Character.toLowerCase(ch);
        
        // A check to ensure the character is a letter before using the switch
        if (lowercasech >= 'a' && lowercasech <= 'z') {
            switch (lowercasech) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This is a vowel.");
                    break;
                default:
                    System.out.println("This is a consonant.");
            }
        } else {
            System.out.println("This is not an alphabet.");
        }
        
        sc.close();
    }
}