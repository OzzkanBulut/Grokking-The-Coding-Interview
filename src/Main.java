import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println(noRepeating("abbbb"));

    }

    public static int noRepeating(String s){

        int windowStart = 0,maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char rightChar = s.charAt(windowEnd);
            if(!charSet.contains(rightChar)){
                charSet.add(rightChar);
            }else{ // aaaba
                while(charSet.contains(rightChar)){
                    char leftChar = s.charAt(windowStart);
                    charSet.remove(leftChar);
                    windowStart++;
                    maxLength = Integer.max(maxLength,windowEnd-windowStart+1);
                }
                charSet.add(rightChar);


            }


        }
        return maxLength;


    }
}