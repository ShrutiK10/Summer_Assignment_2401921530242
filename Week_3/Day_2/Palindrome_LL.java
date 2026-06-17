package Week_3.Day_2;

public class Palindrome_LL {

        static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Boolean palindrome(Node head){

        if(head == null || head.next == null){
            return false;
        }

        //pehle mid nikaloo
        Node slow = head;
        Node fast = head;

        //Ye loop slow ko first half ke last node pe rokne ke liye use hota hai
        //taaki list easily 2 parts mein toot jaye
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;    

        }

        //mid ke baad wali list ko reverse kro
        Node mid = slow;
        Node head2 = mid.next;
        mid.next = null;
        Node curr = head2;
        Node prev = null;
       
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //compare kro dono list koo
        while(head != null && prev != null){
            if(head.data != prev.data){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;

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
        head = insertAtend(head,2);
        head = insertAtend(head,1);

        printlist(head);

        System.out.println();

        System.out.println(palindrome(head));
    }
    
}
