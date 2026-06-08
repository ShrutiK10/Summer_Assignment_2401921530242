package Week_2.Day_1;

public class first_unique_char {

    static int unique(String s){

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){

            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        String s = "leetcode";

        System.out.println(unique(s));
    }
    
}
