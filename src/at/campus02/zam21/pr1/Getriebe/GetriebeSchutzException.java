package at.campus02.zam21.pr1.Getriebe;

public class GetriebeSchutzException extends Exception {
    public GetriebeSchutzException() {
    }

    public GetriebeSchutzException(String message) {
        super(message);
        System.out.println("GetriebeSchutzException = " );

    }
}
