package Week_3.Day_1;

public class Reverse_LL {

        static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head){

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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

        printlist(head);
        System.out.println();

        //ye isliye kiya kyuki hamara head change hua after reverse
        head = reverse(head);
        printlist(head);
        

        
    }
    
}
