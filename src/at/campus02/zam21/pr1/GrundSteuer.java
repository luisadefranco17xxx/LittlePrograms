package at.campus02.zam21.pr1;

import java.sql.Array;

public class GrundSteuer {
    public static void main(String[] args) {

        double[][]   grundStuckList = {{1,20,20},{2,100,100},{3,10,10},{1,20,20},{2,200,200},{3,10,10}};
        double[]  steuerTyp={3.2,2.0,0.9};
        int[] client={0,1,4,2,2,2};

        grundSteuerBerechnen(grundStuckList, steuerTyp);
        for (int i = 0; i < 25; i++) {
            double[] my= grundsteuerZuordnen(grundStuckList,client);
            System.out.println("grundsteuer der client : "+i+" are " + my[i]);
        }
    }

    public static double  grundSteuerBerechnen(double[][] myList, double[] steuerTyp){
        double steuer=0.0;
        for (int i = 0; i < myList.length; i++) {
            steuer=  steuer + steuerTyp[(int)myList[i][0]-1]*myList[i][1]*myList[i][2];
        }
        System.out.println("steuer = " + steuer);
        return steuer;
    }

    public static  double[] grundsteuerZuordnen(double[][] grundList, int[] KundList){
        double[]  steuerTyp={3.2,2.0,0.9};
        double[] kunde_steuertSortiert =new double[25];
        for (int i = 0; i < kunde_steuertSortiert.length; i++) {     //for jeder kunde i
            for (int j = 0; j <KundList.length ; j++) {
                 if(i==KundList[j]){     //kund gefunden
                     double value=steuerTyp[(int)grundList[j][0]-1]*grundList[j][1]*grundList[j][2];
                     kunde_steuertSortiert[i]=kunde_steuertSortiert[i]+value;
                 }
            }
        }
        return kunde_steuertSortiert;
    }
}
