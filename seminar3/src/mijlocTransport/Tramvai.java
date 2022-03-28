package mijlocTransport;

public class Tramvai extends MijlocTransport{
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+" Tramvai");
        return sb.toString();
    }
}
