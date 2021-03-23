package at.campus02.zam21.pr1;
import java.util.Arrays;

public class RecursionStringClass {
    public static void main(String[] args) {
        String ganzeString="David Hasselhoff";
        String substringToCompare="off";

        System.out.println(subStringMethode(ganzeString, substringToCompare));

    }
    public static boolean subStringMethode(String myGanzeString, String mySubstringToCompare)
    {

        if (myGanzeString.startsWith(mySubstringToCompare)) return true;
        else {
            if(myGanzeString.length()>1){
                return subStringMethode(myGanzeString.substring(1),mySubstringToCompare);
            }
       }
       return false;
    }

}
