package Week_1.Day_4;

public class Matrix_Diagonal_sum {

    static int mat(int[][] nums){

        int n = nums.length;

        int sum = 0;

        for(int i = 0; i < n; i++){

            // Primary diagonal
            sum += nums[i][i];

            // Secondary diagonal
            sum += nums[i][n - 1 - i];
        }

        if(n % 2 == 1){

            sum -= nums[n/2][n/2];
        }

        return sum;
    }

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int ans = mat(arr);

        System.out.print(ans);
        
    }
    
}
