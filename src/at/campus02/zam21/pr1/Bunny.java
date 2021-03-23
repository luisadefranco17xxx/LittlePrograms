package at.campus02.zam21.pr1;

public class Bunny {
    String name;
    int age;
    double height;
    double weight;
    String color;
    static String latinNAme = "reditorus";   // uesto esiste solo una volta nella classe Bunny


    public static void main(String[] args) {
        System.out.println("hhh");
        Bunny bugs = new Bunny();
        Bunny roger = new Bunny();

     //   bugs.jumbG();     // class method     se ho oistanza bugs allora possso chamare metodo
        jump(88);         //static method
    //    Bunny.jump(df);
        System.out.println(Bunny.latinNAme);   //siccome e´statica
    }

    public static void jump(double height) {          // eccezione per fare prima senza dovere provare
    //    System.out.println(name + "jump ");            // e´usat se oggetto non ha bisogna di istanze
    }

    public void jumbG(double heigh)    {       //questo lo posso chiamare solo se ho istanziato oggetto
    }
}
