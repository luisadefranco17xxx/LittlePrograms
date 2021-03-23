package Uebung9;

public class MetropolisApp {
    public static void main(String[] args) {

        System.out.println("isMetropolis(true, 100001,89999) = " + isMetropolis(true, 100001,89999));
        System.out.println("isMetropolis(true, 99999,89999) = " + isMetropolis(true, 99999,89999));
        System.out.println("isMetropolis(false, 100001,89999) = " + isMetropolis(false, 200001,200));
        System.out.println("isMetropolis(false, 200001,720000001) = " + isMetropolis(false, 200001,12777));

    }
    public static boolean isMetropolis (boolean isCapital,int inhabitants, double taxPerPersonAndMonth) {
        if (inhabitants>100000 && isCapital) {
               return true;
        }
        if (inhabitants>200000  && taxPerPersonAndMonth*12*inhabitants > 720000000.0) {
                return true;
        }
        return false;
    }
}
