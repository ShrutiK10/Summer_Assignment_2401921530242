package Week_2.Day_2;

public class Permutation_in_string {

    static boolean permu(String s1 , String s2){

                if(s1.length() > s2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < s1.length(); i++){

            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if(java.util.Arrays.equals(freq1, freq2)){
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++){

            freq2[s2.charAt(i) - 'a']++;

            freq2[s2.charAt(i - s1.length()) - 'a']--;

            if(java.util.Arrays.equals(freq1, freq2)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(permu(s1,s2));
    }
    
}
