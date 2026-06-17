package Week_3.Day_1;

public class Middle_LL {

        static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int mid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        //jbb fast null hoga toh jaha slow hoga wahi mid hoga
        return slow.data;

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
        head = insertAtend(head, 1);
        head = insertAtend(head, 2);
        head = insertAtend(head, 3);
        head = insertAtend(head, 4);
        head = insertAtend(head, 5);

        printlist(head);
        System.out.println();
        System.out.println(mid(head));
    }
    
}
