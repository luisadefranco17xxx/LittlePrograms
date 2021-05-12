package at.campus02.zam21.pr1.Getriebe;

public class Getriebe {
    private int gang;
    private int minGang;
    private int maxGang;

    public Getriebe(int minGang, int maxGang) {
        gang=0;
        this.minGang = minGang;
        this.maxGang = maxGang;
    }

    public int getGang() {
        return gang;
    }

    public int getMinGang() {
        return minGang;
    }

    public int getMaxGang() {
        return maxGang;
    }

    public void setGang(int gang) throws GetriebeSchutzException, GangExistiertNichtException {
        if(gang>maxGang || gang<minGang )
          throw new GangExistiertNichtException("Existiert nicht exceptions: Gang grösser als maxGang oder kleiner als minGang");


        if (this.gang>=0 && gang>=0)
        { this.gang = gang;}
        else if (this.gang<=0 && gang<=0)
        {   this.gang = gang;}
        else {
            throw new GetriebeSchutzException("setGang(): von positive Gang darf man nicht nach negative gang und ungekehrt " ); }

    }

    public void gangErhoehen() throws GangExistiertNichtException,GetriebeSchutzException {
        gang++;
        if (gang>maxGang)
                throw new GangExistiertNichtException("Gang größer als maxGang");//GangExistiertNichtException

        setGang(gang);

    }

    public void gangErniedrigen() throws GangExistiertNichtException, GetriebeSchutzException {
        int gangValue=gang-1;
        gang--;
        if (gang<minGang)
          { throw new GangExistiertNichtException("Gang kleiner als minGang");}
        else setGang(gang);
    }

}
