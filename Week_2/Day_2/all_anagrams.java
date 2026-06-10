package Week_2.Day_2;
import java.util.*;

public class all_anagrams {

    static List<Integer> ana(String s , String p){


        List<Integer> ans = new ArrayList<>();

        if(p.length() > s.length()){
            return ans;
        }

        int[] freqP = new int[26];
        int[] window = new int[26];

        for(int i = 0; i < p.length(); i++){

            freqP[p.charAt(i) - 'a']++;

            window[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freqP, window)){
            ans.add(0);
        }

        for(int i = p.length(); i < s.length(); i++){

            // add new char
            window[s.charAt(i) - 'a']++;

            // remove old char
            window[s.charAt(i - p.length()) - 'a']--;

            if(Arrays.equals(freqP, window)){
                ans.add(i - p.length() + 1);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(ana(s,p));
    }
    
}
