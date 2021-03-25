package at.campus02.zam21.pr1;

public class RechteckApp {
    public static void main(String[] args) {
        Recheck myreck = new Recheck();
        myreck.breite=10.0;
        myreck.laenge=10.0;

        double myFlaeche;

        myFlaeche=myreck.flaeche();
        System.out.println("myFlaeche = " + myFlaeche);

        myreck.skaliere(0.9);
        System.out.println("myreck  breite= " + myreck.breite);
        System.out.println("myreck = " + myreck.laenge);
    }
}
