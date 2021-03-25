package at.campus02.zam21.pr1;

// Blackjack game - so the goal is to have the highest number
// but not higher than 21
// So write a method blackjackWinner who gets a 2 dim array as a parameter
// every row stands for one game: [17, 21, 23, 14]
// you should calculate for every game who is the winner
// return value: an array which counts how often every player has won:
// in the first game player 2 would have won -> this means the counter of the
// returning array should be like that [0, 1, 0, 0]
// assume: every row has the same length and we do not know how many rows
// if it is a draw -> nobody gets a poin for winning

public class BlackJackGameClass {
    public static void main(String[] args) {
        int[][] games = {{5,2,3,4}, {6,5,21,21},{6,5,21,23},{6,5,4,23}};

        int[] resut=new int[games[0].length];
        resut=blackjackWinner(games);
        printblackjackWinner(resut);
    }

    public static int[] blackjackWinner(int[][] myGames){
        int[] gewinner= new int[myGames[0].length];
        int spieler=0;
        int alteSpieler=0;
        boolean draw=false;
        for (int i = 0; i < myGames.length; i++) {
            int alteValue=myGames[i][0];
            for (int j = 0; j < myGames[i].length; j++) {
                if (myGames[i][j]>=alteValue && myGames[i][j]<=21)
                {
                    alteValue=myGames[i][j];         // the biggest of the column
                    spieler=j;                       // gewinner at the moment
                        if (myGames[i][spieler] == myGames[i][alteSpieler] && j!=0) {
                            draw=true; 
                        }
                    alteSpieler=spieler;
                }
            }
            if(draw!=true)    gewinner[spieler]= gewinner[spieler]+1;      //no draw!: I can save the winner

            draw=false;
        }
        return gewinner;
    }

    public static void printblackjackWinner(int[] my){
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
    }

}
