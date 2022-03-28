package mijlocTransport;

public abstract class MijlocTransport {
    private String numarInmatriculare;

    public MijlocTransport(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "numarInmatriculare='" + numarInmatriculare + '\'' +
                '}';
    }
}
