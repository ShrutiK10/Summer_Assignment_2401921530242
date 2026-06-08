package Week_2.Day_1;

public class Ransome_note {

    static boolean construct(String ransomNote , String magazine){

        int[] freq = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            freq[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++){

            char ch = ransomNote.charAt(i);

            if(freq[ch - 'a'] == 0){
                return false;
            }

            freq[ch - 'a']--;
        }

        return true;

    }

    public static void main(String[] args) {
        
        String ransomNote = "a";
        String magazine = "b";

        System.out.println(construct(ransomNote , magazine));
    }
    
}
