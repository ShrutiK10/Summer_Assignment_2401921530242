package Week_3.Day_3;

import java.util.Stack;

public class Min_stack {


    Stack<Integer> st;
    Stack<Integer> minst;

    //ye constructor banaya hai jbb khud se implement krna ho stack tbb banate hai aur iska name aur class ka
    //  name should be same

    public Min_stack(){
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int val){
        st.push(val);

        if(minst.isEmpty()){
            minst.push(val);
        }
        else{
            minst.push(Math.min(val , minst.peek()));
        }
    }

    public void pop(){
        st.pop();
        minst.pop();

    }

    public int top(){
        return st.peek();
    }

    public int getMin(){
        return minst.peek();
    }

    public static void main(String[] args) {
        
        Min_stack obj = new Min_stack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println(obj.getMin());
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.getMin());
        System.out.println(obj.top());
    }
    
}
