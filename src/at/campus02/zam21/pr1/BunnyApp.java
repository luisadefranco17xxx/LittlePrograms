package at.campus02.zam21.pr1;

public class BunnyApp {
    public static void main(String[] args) {
        System.out.println("hhh");
        Bunny bugs = new Bunny();
        Bunny roger = new Bunny();

        //   bugs.jumbG();     // class method     se ho oistanza bugs allora possso chamare metodo
        bugs.jump(88);         //static method
        bugs.jumbG(6);    // non statico
        //    Bunny.jump(df);
        System.out.println(Bunny.latinNAme);   //siccome e´statica
        Bunny.jump(5);    //qusto é statico,,, qui lo posso chiamare se faccio riferimento alóggetto
    }

}
