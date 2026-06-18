package Week_3.Day_4;

import java.util.Stack;

public class reverse_polish_notation {

    static int rpn(String[] tokens){

        Stack<Integer> st = new Stack<>();

        for(String token : tokens) {

            if(token.equals("+")) {

                int b = st.pop();
                int a = st.pop();

                st.push(a + b);
            }

            else if(token.equals("-")) {

                int b = st.pop();
                int a = st.pop();

                st.push(a - b);
            }

            else if(token.equals("*")) {

                int b = st.pop();
                int a = st.pop();

                st.push(a * b);
            }

            else if(token.equals("/")) {

                int b = st.pop();
                int a = st.pop();

                st.push(a / b);
            }

            else {

                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        
        String[] tokens = {"2","1","+","3","*"};

        System.out.println(rpn(tokens));
    }
    }
    
