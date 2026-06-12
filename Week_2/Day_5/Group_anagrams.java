package Week_2.Day_5;
import java.util.*;

public class Group_anagrams {

    static List<List<String>> anagrams(String[] strs){

        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String , List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];

            //calling frequency string
            String frequency = frequencystring(s);

            if(map.containsKey(frequency)){
                map.get(frequency).add(s);
            }

            else{

                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(frequency , list);
            }


        }

    //hashmap ki sari values arraylist mein convert krrhe
        return new ArrayList<>(map.values());

    }

    static String frequencystring(String s){

            //creating frequency string
        int[] freq = new int[26];
    
        //har letter ki frequency milegi (a2,b1)
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        //a2,b1 ko ye combine krega
      StringBuilder sb = new StringBuilder();  
        for(int i = 0; i < 26; i++){
            sb.append("#");
            sb.append(freq[i]);

        }

        return sb.toString();
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of string");
        int x = sc.nextInt();

        String[] st = new String[x];

        System.out.println("enter strings");
        for(int i = 0; i < st.length; i++){
            st[i] = sc.next();
        }

        List<List<String>> result = anagrams(st);
        System.out.println(result);

    }
    
}
