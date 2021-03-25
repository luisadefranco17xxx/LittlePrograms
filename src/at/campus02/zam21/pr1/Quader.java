package at.campus02.zam21.pr1;

public class Quader {
    double laenge;
    double breite;
    double hoehe;

    public double grundflaeche(){
        return laenge*breite;
    }
    public void skaliere(double factor){
        laenge=laenge*factor;
        breite=breite*factor;
        hoehe=hoehe*factor;
    }
    public double volume(){
        return laenge*breite*hoehe;
    }
    public double oberflaeche(){
        return laenge*hoehe*2+breite*hoehe*2+laenge*breite*2;
    }

}
