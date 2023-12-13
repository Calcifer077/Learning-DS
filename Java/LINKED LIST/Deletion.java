
public class Linkedlist {
    Node head;

    static class Node{
        Node next;
        int data;
    
        Node(int val){
            data = val;
            next = null;
        }
    }
    
    public static Linkedlist insert(Linkedlist list, int value){
        Node new_node = new Node(value);

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    public static void printlist(Linkedlist list){
        Node temp = list.head;
        
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static Linkedlist deletebykey(Linkedlist list, int key){
        Node new_node = list.head;
        if(list.head.data == key){
            list.head = new_node.next;
            System.out.println(key + "found and deleted");
        }
        else{
            Node temp = list.head;
            Node prev = list.head;
            while(temp.data != key && temp.next!= null){
                prev = temp;
                temp = temp.next;
            }
            if(temp != null){
                prev.next = temp.next;
                System.out.println(key + " found and deleted");
            }
            if(temp == null){
                System.out.println(key + " not found");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        printlist(list);
        deletebykey(list, 5);
        printlist(list);
    }
}
