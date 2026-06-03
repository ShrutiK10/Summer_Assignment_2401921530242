package Week_1.Day_3;
import java.util.*;

public class Move_zero {

    static void zeroes(int[] nums){

        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
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

        zeroes(arr);
    }
    
}
