package Week_2.Day_1;
import java.util.*;

public class Valid_Anagram {

    static Boolean anagram(String s , String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch ,0)+ 1);

        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }

           else if(map.get(ch) == 1){
                map.remove(ch);
            }

            else{
                map.put(ch, map.get(ch) - 1);
            }

        }

        return map.isEmpty();


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st string");
        String s = sc.nextLine();

        System.out.println("enter 2nd string");
        String t = sc.nextLine();

        System.out.println(anagram(s,t));



    }
    
}
