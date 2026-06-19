package Week_3.Day_5;

import java.util.*;

public class Sliding_window_max {

    static int[] maxSlidingWindow(int[] nums, int k){


        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        int idx = 0;

        for(int i = 0; i < n; i++) {

            while(!dq.isEmpty() &&
                  dq.peekFirst() <= i - k) {

                dq.pollFirst();
            }

            while(!dq.isEmpty() &&
                  nums[dq.peekLast()] < nums[i]) {

                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k - 1) {

                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        
        int[] nums = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
    
}
