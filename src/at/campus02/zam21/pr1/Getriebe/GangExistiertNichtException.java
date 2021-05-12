package at.campus02.zam21.pr1.Getriebe;

public class GangExistiertNichtException  extends Exception{
    public GangExistiertNichtException(){}
    public GangExistiertNichtException(String message){
        super(message);
        System.out.println("GangExistiertNichtException = ");
}
}
