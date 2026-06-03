package Week_1.Day_1;
import java.util.*;

public class Remove_Duplicates {

       static int dup(int[] arr){

        int i = 0;
        for(int j = 1; j < arr.length; j++){

            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }

        }

        return i+1;

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

        System.out.println(dup(arr));

    }
    
}
