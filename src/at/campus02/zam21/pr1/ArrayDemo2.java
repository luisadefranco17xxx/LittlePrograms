package at.campus02.zam21.pr1;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[]  monatsString=new String[12];
        monatsString[0]="Jänner";
        monatsString[1]="Februar";
        monatsString[2]="März";
        monatsString[3]="April";
        monatsString[4]="Mai";
        monatsString[5]="Juni";
        monatsString[6]="Juli";
        monatsString[7]="August";
        monatsString[8]="September";
        monatsString[9]="Oktober";
        monatsString[10]="November";
        monatsString[11]="Dezember";

        for (int i = 0; i < monatsString.length; i++) {
            System.out.println("Monat "+i+" ist : "+monatsString[i]);
        }
    }
}
