package Week_2.Day_5;

public class String_compression {

    public static int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while(read < chars.length) {

            char current = chars[read];

            int count = 0;

            while(read < chars.length &&
                  chars[read] == current) {

                count++;
                read++;
            }

            chars[write++] = current;

            if(count > 1) {

                String freq = String.valueOf(count);

                for(char ch : freq.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
        
    }

    public static void main(String[] args) {
        
        char[] chars = {'a','a','b','b','c','c','c'};

        int length = compress(chars);

        System.out.println("Compressed Length = " + length);

        
    }
    
}
