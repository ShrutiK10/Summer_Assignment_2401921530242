package Week_3.Day_1;

public class LL_cycle {

        static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Boolean loop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }

            if(slow == fast){
                return true;
            }
        }

        return false;

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
        head = insertAtend(head,3);
        head = insertAtend(head,2);
        head = insertAtend(head,0);
        head = insertAtend(head,-4); 

        int pos = 1;

        //ye krrhe hai loop create krne ke liye
        //yaha normal printlist call nhi krenge wrna infinite loop chalta rhega
        Node temp = head;
        Node joinNode = head.next;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = joinNode;


        System.out.print(loop(head));
    }
    
}
