package Week_1.Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class Common_prefix {

    static String prefix(String[] s){

        StringBuilder sb = new StringBuilder();

        Arrays.sort(s);

        char[] first = s[0].toCharArray();
        char[] last = s[s.length - 1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }

            sb.append(first[i]);
        }


    return sb.toString();

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int x = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[x];
        System.out.println("enter string");

        for(int i = 0; i < x; i++){
            arr[i] = sc.nextLine();
        }

        String result = prefix(arr);

        System.out.println(result);

    }
   
}
