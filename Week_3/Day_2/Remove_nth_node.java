package Week_3.Day_2;

public class Remove_nth_node {

        static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     static Node remove(Node head , int n){

        Node fast = head;

        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }

        //ye unn cases ke liye hai jbb jitni badi LL utni n ki value
        if(fast == null){
            return head.next;
        }

        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;  

     }

     static Node insertAtend(Node head , int data){

        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

     public static void main(String[] args) {
        Node head = null;

        head = insertAtend(head,1);
        head = insertAtend(head,2);
        head = insertAtend(head,3);
        head = insertAtend(head,4);
        head = insertAtend(head,5);
        head = insertAtend(head,6); 
        head = insertAtend(head,7);

        int n = 4;

        printlist(head);

        System.out.println();

        head = remove(head , n);
        printlist(head);

     }
    
}
