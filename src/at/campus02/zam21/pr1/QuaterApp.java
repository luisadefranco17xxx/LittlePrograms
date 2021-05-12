package at.campus02.zam21.pr1;

public class QuaterApp {
    public static void main(String[] args) {
        Quader myQuater=new Quader();
        myQuater.breite=2;
        myQuater.hoehe=2;
        myQuater.laenge=2;

        System.out.println("myQuater.grundflaeche() = " + myQuater.grundflaeche());
        System.out.println("myQuater.oberflaeche() = " + myQuater.oberflaeche());
        myQuater.skaliere(0.9);
        System.out.println("myQuater.skaliere(0.9); and grundfläche wieder rechnen = " + myQuater.grundflaeche());
    }
}
