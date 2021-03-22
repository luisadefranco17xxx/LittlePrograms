package at.campus02.zam21.pr1;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] Number1={3,4,5};
        int[] Number2={7,8,9};

        int sum1=0, prod=1;

        for (int i = 0; i < Number1.length; i++) {
            sum1=sum1+Number1[i];
        }
        for (int i = 0; i < Number2.length; i++) {
            prod=prod+Number2[i];
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + prod);
    }
}
