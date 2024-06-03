import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSub("abcabcbb"));
    }

    public static int longestSub(String s){


        if(s==null || s.length()==0){
            return 0;
        }
        int windowStart = 0;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();

       for(int windowEnd=0;windowEnd<s.length();windowEnd++){
           char rightChar = s.charAt(windowEnd);
           if(!charSet.contains(rightChar)){
               charSet.add(rightChar);
               maxLength = Integer.max(maxLength,windowEnd-windowStart+1);
           }else{// abcabcbb
               while(charSet.contains(rightChar)){
                   char leftChar = s.charAt(windowStart);
                   charSet.remove(leftChar);
                   windowStart++;
               }
               charSet.add(rightChar);

           }

       }



        return  maxLength;
    }
}