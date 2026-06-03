package Week_1.Day_1;

import java.util.*;

public class Stock {

        static int Stocksell(int[] nums){

        int maxprofit = 0;
        //initially iski value +infinity hai uske baad isse kam values chahiye
        int buyprice = Integer.MAX_VALUE; //ispe ham min value rkhte hai

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > buyprice){
              int profit = nums[i] - buyprice;
              maxprofit = Math.max(maxprofit , profit);  
            }
            else{
             
                buyprice = nums[i];

            }
        }


        return maxprofit;
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

        System.out.println(Stocksell(arr));
    }
    
}
