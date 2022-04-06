

/* Really short test to get the jist of things */
public class Chapter1{


    public static void main(String[] args){

        printPassedOrFailed("1.1",Q11Test());
        printPassedOrFailed("1.2",Q12Test());

    }


    public static void printPassedOrFailed(String question,boolean didPass){

        System.out.println("Question " + question + " " +
                (didPass ? "passed" : "failed"));
    }


    public static boolean Q11Test() {

        String notUnique = "I have repeated letters so I am not unique";
        String unique = "I#am?uniqe!";


        boolean didPass = !Q11.isUnique(notUnique);
        didPass &= !Q11.isUnique2(notUnique);

        didPass &= Q11.isUnique(unique);
        didPass &= Q11.isUnique2(unique);


        return didPass;

    }


    public static boolean Q12Test() {

        String base = "permutation";
        String permutation = "pmretonitau";
        String notPermutation = "pmmtonnntia";

        boolean didPass = !Q12.isPermutation(base,notPermutation);
        didPass &= Q12.isPermutation(base,permutation);

        return didPass;
    }

}