package Week_1.Day_2;
import java.util.*;

public class Contains_duplicate {

    static boolean dup(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(dup(arr));
    }
    
}
