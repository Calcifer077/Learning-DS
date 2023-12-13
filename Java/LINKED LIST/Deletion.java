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

    public static Linkedlist deletebykey(Linkedlist list, int key){//Delete a node that hve a certain key. 
        Node new_node = list.head;//Creating a new node that will point to the liar head. 
        if(list.head.data == key){//If the node to be deleted is head
            list.head = new_node.next;//Move the head pointer to the next node. 
            System.out.println(key + "found and deleted");
        }
        else{
            Node temp = list.head;
            Node prev = list.head;
            while(temp.data != key && temp.next!= null){//Do it until temp's data is equal to given key or we have exhausted the list. 
                prev = temp;//Doing these two steps to make sure that we have the previous node. If we want  to delete a node we have to know about the previous so we can connect that node to next to next node. 
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
