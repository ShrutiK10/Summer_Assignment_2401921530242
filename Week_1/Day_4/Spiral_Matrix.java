package Week_1.Day_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_Matrix {

     static ArrayList<Integer> spiral(int[][] nums){

        int left = 0;
        int right = nums[0].length - 1;
        int top = 0;
        int bottom = nums.length - 1;

        ArrayList<Integer> order = new ArrayList<>();

        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                order.add(nums[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                order.add(nums[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    order.add(nums[bottom][i]);
                }
                bottom--;

            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    order.add(nums[i][left]);
                }

                left++;
            }

        }
      
        return order;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("enter elements");

        for(int i = 0; i < arr.length; i++){
             for(int j = 0; j < arr.length; j++){
            arr[i][j] = sc.nextInt();

             }
        }

        ArrayList<Integer> result = spiral(arr);
        System.out.print(result);
    }
    
}
