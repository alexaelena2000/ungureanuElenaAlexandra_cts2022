package mijlocTransport;

public class Autobuz extends MijlocTransport{

    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+ " Autobuz");
        return sb.toString();
    }
}
