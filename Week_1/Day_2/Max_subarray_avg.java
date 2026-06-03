package Week_1.Day_2;
import java.util.*;

public class Max_subarray_avg {

    static double avg(int[] nums , int k){

        long sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        long maxSum = sum;

        for(int i = k; i < nums.length; i++){

            sum = sum - nums[i-k] + nums[i];

            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum / k;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");

        int n = sc.nextInt();
        int[] arr = new int[n];

        int k = 4;

        System.out.println("enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(avg(arr , k));
    }
    
}
