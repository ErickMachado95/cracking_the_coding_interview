import java.util.Arrays;

public class Q12 {


    public static boolean isPermutation(String sA,String sB) {


        if(sA == null || sB == null)
            return false;

        if(sA.length() != sB.length())
            return false;



        char[] charA = sA.toCharArray();
        char[] charB = sB.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);


        for(int i = 0 ; i < charA.length ; i++) {
            if(charA[i] != charB[i])
                return false;
        }


        return true;

    }

}
