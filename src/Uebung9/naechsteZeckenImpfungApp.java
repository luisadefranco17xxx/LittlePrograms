package Uebung9;

public class naechsteZeckenImpfungApp {
    public static void main(String[] args) {

        System.out.println("  " + naechsteZeckenImpfung(1,2021,false));
        System.out.println("  " + naechsteZeckenImpfung(1,2021,true));
        System.out.println("  " + naechsteZeckenImpfung(61,2020,false));
        System.out.println("  " + naechsteZeckenImpfung(11,2018,true));
    }

    public static int naechsteZeckenImpfung (int alter, int lastJahr, boolean auffrisch ){
         int year=0;
        // if (lastJahr==0) {lastJahr=2021;}

         if (auffrisch || alter>=60)   {
             year=lastJahr+3;
         } else {
             year=lastJahr+5;
         }
         return year;
    }
}
