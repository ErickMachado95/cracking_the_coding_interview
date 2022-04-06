import java.util.*;  



public class Q11 { 


    public static boolean isUnique(String s) {


        if(s == null)
                return false;

        HashSet<Character> hset = new HashSet<>();

        for(int i = 0 ; i < s.length(); i++) {

            char c = s.charAt(i);
            if(hset.contains(c))
                return false;
            hset.add(c);
        }

        return true;
    }


    public static boolean isUnique2(String s){
       if(s == null)
           return false;

       char[] carr = s.toCharArray();

       Arrays.sort(carr);

       for(int i = 0 ; i < carr.length-1 ; i++) {
           if (carr[i] == carr[i + 1])
               return false;
       }

       return true;
    }

}
