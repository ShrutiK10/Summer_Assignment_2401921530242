package Week_2.Day_3;

public class Repeated_substring {

    static boolean substring(String s){

        int n = s.length();

        for(int len = 1; len <= n/2; len++) {

            if(n % len == 0) {

                String part = s.substring(0, len);

                StringBuilder sb = new StringBuilder();

                int times = n / len;

                for(int i = 0; i < times; i++) {
                    sb.append(part);
                }

                if(sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        String s = "abab";

        System.out.println(substring(s));
    }
    
}
