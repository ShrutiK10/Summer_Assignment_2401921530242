package Week_1.Day_4;

public class Reshape_matrix {

    static int[][] mat(int[][] nums , int r , int c){

        int m = nums.length;
        int n = nums[0].length;

        if(m * n != r * c){
            return nums;
        }

        int[][] ans = new int[r][c];

        for(int i = 0; i < m * n; i++){

            ans[i / c][i % c]
            =
            nums[i / n][i % n];
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[][] arr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;

        int[][] ans = mat(arr,r,c);

            for(int i = 0; i < ans.length; i++){

            for(int j = 0; j < ans[0].length; j++){

                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }
    }

    }


    

