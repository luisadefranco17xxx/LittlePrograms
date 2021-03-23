package Uebung9;

public class drawDiamondsClass {
    public static void main(String[] args) {
        drawDiamonds(11);   //nur ungerade Zahlen
    }
    public static void drawDiamonds(int par){
    int dim=par*2-1;
    int halb=dim/2;
        for (int i = 0; i < dim/2; i++) {   //zeile
            for (int j = 0; j < dim; j++) {    //Spalte
                   if(j>=halb-i&&j<=halb+i){   //was in eine spalte passert

                    System.out.print("*");
                   } else {
                     System.out.print(" ");
                   }
            }
            System.out.println();
        }
        for (int i = dim/2; i >= 0; i--) {   //zeile
            for (int j = 0; j <dim; j++) {    //Spalte
                if(j>=halb-i&&j<=halb+i){   //was in eine spalte passert

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
