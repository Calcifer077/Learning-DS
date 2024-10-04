import java.util.LinkedList;

public class linkedlistusingJCF {
    public static void main(String[] args) {
        // Create -> Only allowed classes datatype like Integer, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        ll.addFirst(0);

        System.out.println(ll);
    }
}