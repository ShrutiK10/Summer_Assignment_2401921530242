package Week_3.Day_5;

import java.util.Stack;

public class Implement_queue_using_stack {

    Stack<Integer> input;
    Stack<Integer> output;

        public Implement_queue_using_stack() {

        input = new Stack<>();
        output = new Stack<>();
        
    }
    
    public void push(int x) {

        input.push(x);
        
    }
    
    public int pop() {

        peek();

        return output.pop();
        
    }
    
    public int peek() {

        if(output.isEmpty()) {

            while(!input.isEmpty()) {

                output.push(input.pop());
            }
        }

        return output.peek();
        
    }
    
    public boolean empty() {

        return input.isEmpty() && output.isEmpty();
        
    }

    public static void main(String[] args) {
        
          Implement_queue_using_stack q = new Implement_queue_using_stack();

    q.push(10);
    q.push(20);
    q.push(30);

    System.out.println("Front element: " + q.peek());

    System.out.println("Removed: " + q.pop());

    System.out.println("Front element: " + q.peek());

    System.out.println("Is Queue Empty? " + q.empty());
    }
    
}
