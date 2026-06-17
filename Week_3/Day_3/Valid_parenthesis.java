package Week_3.Day_3;

import java.util.Stack;

public class Valid_parenthesis {

        static Boolean paren(String s){

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                char top = st.peek();
                if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "([])";
        String s2 = "([)]";
        String s3 = "{{[]}}";

        System.out.println(paren(s1)); 
        System.out.println(paren(s2)); 
        System.out.println(paren(s3)); 

     
        
    }
    
}
