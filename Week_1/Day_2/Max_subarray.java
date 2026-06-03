package Week_1.Day_2;
import java.util.*;

public class Max_subarray {

        static int sub(int[] nums , int k){

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);

        int currsum = 0;
        int totalcount = 0;
        int res = 0;

        for(int i = 0; i < nums.length; i++){
            currsum = currsum + nums[i];

            if(map.containsKey(currsum - k)){
                res = res + map.get(currsum - k);

            }
            //Agar currsum key already map me hai → uski value return karo
            //Agar nahi hai → default 0 return karo 
            map.put(currsum , map.getOrDefault(currsum , 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");

        int n = sc.nextInt();
        int[] arr = new int[n];

        int k = 5;

        System.out.println("enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sub(arr , k));
    }
    
}
