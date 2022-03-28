package mijlocTransport;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+ "Troleibuz");
        return sb.toString();
    }
}
