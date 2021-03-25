package at.campus02.zam21.pr1;

public class Recheck {
    double laenge;
    double breite;

    public double flaeche(){
        return laenge*breite;
    }

    public void skaliere(double par){
        laenge=laenge*par;
        breite=breite*par;
    }
}
