package Week_3.Day_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_greater {

        static int[] next(int[] nums1 , int[] nums2){

        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                map.put(st.pop() , nums2[i]);
            }
            st.push(nums2[i]);
        }

        while(!st.isEmpty()){
            map.put(st.peek() , -1);
            st.pop();
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        //array return krrhe isliye arrays.to string kiya hai
        System.out.println(Arrays.toString(next(nums1,nums2)));
    }
    
    
}
