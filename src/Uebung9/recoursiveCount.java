package Uebung9;

public class recoursiveCount {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        System.out.println(countOne(arr, 0,arr.length-1));
    }
    public static int countOne(int[] array, int left, int right) {
       // if (right==0&&right==1){ }
        if (left==right) {
            if  (array[left]==1) return 1;
            else return 0;
        }
        if (array[left]==1) return 1+countOne( array, left+1, right);
        else return countOne( array, left+1, right);

    }
}
