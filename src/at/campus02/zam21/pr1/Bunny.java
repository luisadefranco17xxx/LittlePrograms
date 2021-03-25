package at.campus02.zam21.pr1;

public class Bunny {
    String name;
    int age;
    double height;
    double weight;
    String color;
    static String latinNAme = "reditorus";   // uesto esiste solo una volta nella classe Bunny



    public static void jump(double height) {          // eccezione per fare prima senza dovere provare
    //    System.out.println(name + "jump ");            // e´usat se oggetto non ha bisogna di istanze
    }

    public void jumbG(double heigh)    {       //questo lo posso chiamare solo se ho istanziato oggetto
    }
    public void doubleJump(double height) {
        jump(height);
        jump(height);

    }
}
