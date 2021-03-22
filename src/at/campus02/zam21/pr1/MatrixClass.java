package at.campus02.zam21.pr1;

public class MatrixClass {
    public static void main(String[] args) {
        printMatrix(generateIdentityMatrix2(5));
        System.out.println();
        printMatrix(generateIdentityMatrix(10));
        System.out.println();
        printMatrix2(generateIdentityMatrix3(10,3));
    }


    public static double[][]	generateIdentityMatrix(int	size){
    double[][] myMatrik = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j){
                    myMatrik[i][j]=1;
                } else {
                    myMatrik[i][j]=0;
                }
            }

        }
    return myMatrik;
    }

    public static double[][]	generateIdentityMatrix2(int	size){
        double[][] myMatrik = new double[size][size];
        for (int i = 0; i < size; i++) {
                    myMatrik[i][i]=1;
            }

        return myMatrik;
    }
    public static double[][]	generateIdentityMatrix3(int	sizeZeile,int sizeSpalte){
        double[][] myMatrik = new double[sizeZeile][sizeSpalte];
        for (int i = 0; i < sizeZeile; i++) {
            for (int j = 0; j < sizeSpalte; j++) {
                if (i==j){
                    myMatrik[i][j]=1;
                } else {
                    myMatrik[i][j]=0;
                }
            }

        }
        return myMatrik;
    }

    public static void	printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print( matrix[i][j] +"   ");
            }
            System.out.println();
        }
    }

    public static void	printMatrix2(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print( matrix[i][j] +"   ");
            }
            System.out.println();
        }
    }
}
