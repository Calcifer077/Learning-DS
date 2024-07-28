public class Linkedlist{
        Node head;
        static class Node{//Basic structure of a node
            int data;
            Node next;

            Node(int val){//Constructor of class node
                data = val;
                next = null;
            }
        }
        public static Linkedlist insert(Linkedlist list, int data){
            Node new_Node = new Node(data);//creating a new node with the given value

            if(list.head == null){//If there are no elements in the linked list. 
                list.head = new_Node;
            }
            else{
                Node temp = list.head;//Creating a temporary variable that is used to iterate in the linked list. 
                while(temp.next != null){//Iterating until it reaches the last node
                    temp = temp.next;//Iteration 
                }
                temp.next = new_Node;//Inserting the new node at the last or can say in the next of temp. 
            }
            return list;//Returning the final linked list
        }

        public static void printlist(Linkedlist list){//Displaying the end result
            Node temp = list.head;//Using a temporary variable for iteration
         
            System.out.println("Linkedlist");

            while(temp != null){//Do it until temp is at null
                System.out.print(temp.data + "->");
                temp = temp.next;//Iteration
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
