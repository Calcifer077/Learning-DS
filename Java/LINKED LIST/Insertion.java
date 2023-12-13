public class Linkedlist{
        Node head;
        static class Node{
            int data;
            Node next;

            Node(int val){
                data = val;
                next = null;
            }
        }
        public static Linkedlist insert(Linkedlist list, int data){
            Node new_Node = new Node(data);//creating a new node with the given value

            if(list.head == null){
                list.head = new_Node;
            }
            else{
                Node temp = list.head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_Node;
            }
            return list;
        }

        public static void printlist(Linkedlist list){
            Node temp = list.head;
            System.out.println("Linkedlist");

            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 5);
        printlist(list);
    }
}
