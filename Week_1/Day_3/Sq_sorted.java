package Week_1.Day_3;
import java.util.*;

public class Sq_sorted {

    static int[] squares(int[] nums){

        int n = nums.length;

        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        int idx = n - 1;

        while(left <= right){

            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){

                ans[idx] = leftSq;
                left++;
            }

            else{

                ans[idx] = rightSq;
                right--;
            }

            idx--;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements");

        for(int j = 0; j < arr.length; j++){
            arr[j] = sc.nextInt();
        }

        System.out.println(Arrays.toString(squares(arr)));
    }
    
}
