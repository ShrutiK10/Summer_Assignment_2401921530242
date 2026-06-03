package Week_1.Day_1;
import java.util.*;

public class Two_Sum {

    //hamko o/p mein array chahiye isliye int[] likha hai
    static int[] TwoSum(int[] arr , int target){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};

            }

            if(!map.containsKey(complement)){
                map.put(arr[i] , i);
            }
        }


        return new int[]{-1,-1};
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

        System.out.println("enter target");
        int target = sc.nextInt();
        
        //arrays.tostring isliye likha hai kyuki o/p mein array chahiye isko nhi likhte hai toh hashcode mil jayega o/p mein
        //ye array ko readable format mein convert krta hai
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
    
}
