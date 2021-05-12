package at.campus02.zam21.pr1.Poker;

public class PokerApp {
    public static void main(String[] args) {
        PokerCardValue v1,v2;//          with =null defaul;

        v1 = PokerCardValue.EIGHT;    //no ho bisogno di inizializarli perche son final static
        v2 = PokerCardValue.AGE;

        if(v1==PokerCardValue.FIVE){

        }
        switch(v1){
            case ONE:
                System.out.println("one");
                break;
            case TWO:
                break;
        }
        PokerCard card=new PokerCard(PokerCardValue.AGE,PokerCardColour.DIAMOND);

        for (PokerCardColour c: PokerCardColour.values()    //iterate over java enum
             ) {
            System.out.println(c);
        }
    }
}
