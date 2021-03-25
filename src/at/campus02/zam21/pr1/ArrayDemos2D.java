package at.campus02.zam21.pr1;

public class ArrayDemos2D {
    public static void main(String[] args) {

        String[] favoriteFood={"chocolade","Carrots","Gras"};
        String[] allergicFood= new String[5];

        allergicFood[0]="a";
        allergicFood[1]="b";
        for (int f = 0; f < favoriteFood.length; f++) {
            System.out.println("favoriteFood = " + favoriteFood[f]);
        }
        //String food[][] = .....           alternative
       // String [][]food={{"chocolade","Carrots","Gras","Strawberis"},{"Banane","Strawsberry","Cranbarries"}};
        String [][]food={{"chocolade","Carrots","Gras","fgd"},{"Banane","Strawsberry","Cranbarries"}};
        food[0][2]="Pineapple";
        for (int row = 0; row < food.length ; row++) {
            for (int col = 0; col < food[row].length; col++) {
                System.out.println(food[row][col]);
            }
            System.out.println("---");
        }

    }
}
