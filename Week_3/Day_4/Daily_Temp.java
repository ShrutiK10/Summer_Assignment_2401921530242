package Week_3.Day_4;
import java.util.*;

import java.util.Stack;

public class Daily_Temp {

    static int[] temp(int[] temperatures){

        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() &&
                  temperatures[i] > temperatures[st.peek()]) {

                int idx = st.pop();

                ans[idx] = i - idx;
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[] temperatures = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(temp(temperatures)));
    }
    
}
