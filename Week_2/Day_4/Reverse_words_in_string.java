package Week_2.Day_4;

public class Reverse_words_in_string {

    static String reverseWords(String s) {
        
        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < words.length; i++) {

            String rev = new StringBuilder(words[i]) .reverse() .toString();
            ans.append(rev);

            if(i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
    
}
