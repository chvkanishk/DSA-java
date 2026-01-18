import java.util.*;

 class anagram{
    public boolean isAnagram(String s,String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character , Integer> count = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);

        }
        for(int i =0; i<t.length(); i++){
            char c =t.charAt(i);
            if (!count.containsKey(c) || count.get(c)==0){
                return false;
            }
            count.put(c, count.get(c) - 1);
        }
        return true;
    }
}
        

public class ValidAnagram {
    public static void main(String[] args) {
        anagram a = new anagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = a.isAnagram(s, t);
        System.out.println(result);
    }
    
}
