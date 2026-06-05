package Week_1.Day_5;

import java.util.Scanner;

public class Reverse_String {

    static void reverse(char[] s){

        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
    }

}

public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        String name = sc.nextLine();
    
        //using this because we are modifying our string
        char[] arr = name.toCharArray();

        //yaha dono alag alag isliye hai kyuki ham kuch return nhi krrhe hai 

        reverse(arr);

        System.out.print(arr);
}
    
}
