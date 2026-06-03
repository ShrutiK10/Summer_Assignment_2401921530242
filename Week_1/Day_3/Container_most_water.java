package Week_1.Day_3;

import java.util.Scanner;

public class Container_most_water {

    static int water(int[] nums){
    
    //creating leftmax array     
        int leftmax[] = new int[nums.length];
    //first element will be as it is
        leftmax[0] = nums[0];
    //0th index ka element already le chuke hai isliye 1 se abb loop lenge    
        for(int i = 1; i < nums.length; i++){
    //max value lenge jo value aa rhi h usse aur uski ek pehle ki value se        
            leftmax[i] = Math.max(nums[i] , leftmax[i-1]);
        }    


    //creating rightmax array
        int rightmax[] = new int[nums.length];
        rightmax[nums.length - 1] = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            rightmax[i] = Math.max(nums[i] , rightmax[i+1]);

        }

        int trappedwater = 0;

        for(int i = 0; i < nums.length; i++){

            int waterlevel = Math.min(leftmax[i] , rightmax[i]);


    //calcuting trapped water
        trappedwater += waterlevel - nums[i];

        }

        return trappedwater;
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

        System.out.println(water(arr));
    }
    
}
