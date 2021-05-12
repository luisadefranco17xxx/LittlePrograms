package at.campus02.zam21.pr1.Getriebe;

public class GetriebeApp {
    public static void main(String[] args) {
        Getriebe getriebe=new Getriebe(-5,5);

        try {
            getriebe.gangErniedrigen();
            getriebe.gangErniedrigen();
            getriebe.gangErniedrigen();
            getriebe.gangErniedrigen();
            getriebe.gangErniedrigen();
            getriebe.gangErniedrigen();


            getriebe.gangErhoehen();
        } catch (GangExistiertNichtException | GetriebeSchutzException e) {
            e.printStackTrace();
        }

        try {
            getriebe.gangErhoehen();
            getriebe.gangErhoehen();
            getriebe.gangErhoehen();
            getriebe.gangErhoehen();
            getriebe.gangErhoehen();
            System.out.println(getriebe.getGang());
            getriebe.setGang(66);
            System.out.println(getriebe.getGang());
            getriebe.setGang(-2);
            System.out.println(getriebe.getGang());

        } catch (GetriebeSchutzException e) {
            e.printStackTrace();
        } catch (GangExistiertNichtException e){
            e.printStackTrace();
        }
        try {
            System.out.println("valore gang :"+getriebe.getGang());
            getriebe.setGang(2);
            System.out.println("valore gang dopo aver settato a 2: " +getriebe.getGang());
            getriebe.setGang(-2);
            System.out.println("valore gang dopo aver settato a -2: "+getriebe.getGang());
        } catch (GetriebeSchutzException | GangExistiertNichtException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(getriebe.getGang());
            getriebe.setGang(6);
        } catch (GangExistiertNichtException | GetriebeSchutzException e){
            e.printStackTrace();
        }
        try {
            System.out.println(getriebe.getGang());
            getriebe.gangErhoehen();
        } catch (GangExistiertNichtException | GetriebeSchutzException e){
            e.printStackTrace();
        }
        System.out.println("HALLO");
    }
}
