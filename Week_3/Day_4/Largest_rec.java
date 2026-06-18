package Week_3.Day_4;

import java.util.Stack;

public class Largest_rec {

        private int[] prevsmaller(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    private int[] nextsmaller(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int histogram(int[] arr){

        int[] prev = prevsmaller(arr);
        int[] next = nextsmaller(arr);
        int n = arr.length;
        int maxarea = 0;

        for(int i = 0; i < n; i++){

            int width = next[i] - prev[i] - 1;
            int Area = width * arr[i];

            maxarea = Math.max(maxarea , Area);

        }
        return maxarea;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,1,5,6,2,3};

        Largest_rec obj = new Largest_rec();
        System.out.println(obj.histogram(arr));

    }
   
}
    
