package Week_1.Day_3;
import java.util.*;

public class Sq_sorted {

    static int[] squares(int[] nums){

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[head] < nums[tail]){
                res[j] = nums[tail];
                tail--;
            }
            else{
                res[j] = nums[head];
                head++;
            }
        }

        return res;

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
