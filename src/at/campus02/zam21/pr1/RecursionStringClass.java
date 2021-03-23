package at.campus02.zam21.pr1;
import java.util.Arrays;

public class RecursionStringClass {
    public static void main(String[] args) {
        String ganzeString="David Hasselhoff";
        String substringToCompare="off";

        System.out.println(subStringMethode(ganzeString, substringToCompare));
        ganzeString="David Hasselhoff";
        substringToCompare="off  ";

        System.out.println(subStringMethode(ganzeString, substringToCompare));

    }
 /*   public static boolean subStringMethode(String myGanzeString, String mySubstringToCompare)
    {
       //manca il caso i cui sono identiche equals
        //leeere zeiche abfilter
        //testo vuoto
        //zweite string längel als die erste
        if (myGanzeString.startsWith(mySubstringToCompare)) return true;
        else {
            if(myGanzeString.length()>1){
                return subStringMethode(myGanzeString.substring(1),mySubstringToCompare);
            }
       }
       return false;
    }*/

    public static boolean subStringMethode(String myGanzeString, String mySubstringToCompare) {
        if (myGanzeString == null|| mySubstringToCompare == null) return false;
        if(mySubstringToCompare.length()>myGanzeString.length()) return false;
        if(myGanzeString.length() == mySubstringToCompare.length())  return myGanzeString.equals(mySubstringToCompare);
        return myGanzeString.startsWith(mySubstringToCompare) || subStringMethode(myGanzeString.substring(1), mySubstringToCompare);
    }
}
