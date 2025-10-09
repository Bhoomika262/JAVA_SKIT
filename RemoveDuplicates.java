import java.util.ArrayList;
import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Alice");
        list.add("Charlie");
        list.add("Bob");

        System.out.println("Before removing duplicates: ");
        for (String name : list) {
            System.out.println(name);
        }

        HashSet<String> set = new HashSet<>(list);

        System.out.println("After removing duplicates: ");
        for (String name : set) {
            System.out.println(name);
        }
    }
}
