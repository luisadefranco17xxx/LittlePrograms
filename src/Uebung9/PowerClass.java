package Uebung9;

public class PowerClass {
    public static void main(String[] args) {
        System.out.println("powerSimple(3,3) = " + powerSimple(3,3));
        System.out.println("powerSimpleRec(3,3) = " + powerSimpleRec(3,3));


        System.out.println("powerSimple(2,3) = " + powerSimple(2,3));
        System.out.println("powerSimpleRec(2,3) = " + powerSimpleRec(2,3));
    }


    public static int powerSimple(int x, int n){

        int value=1;
        for (int i = 0; i < n; i++) {
            value=value*x;
        }
        return value;
    }

    public static int powerSimpleRec(int x, int n){
        if (n==0)  return 1;
        if (n==1)  return x;
        if (n%2==0)  return powerSimpleRec(x,n/2)*powerSimpleRec(x, n/2);
        if (n%2!=0)  return x* powerSimpleRec(x,n/2)*powerSimpleRec(x, n/2);
        return 1;
    }
}
