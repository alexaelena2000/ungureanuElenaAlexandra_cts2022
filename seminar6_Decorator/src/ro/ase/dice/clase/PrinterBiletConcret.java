package ro.ase.dice.clase;

public class PrinterBiletConcret implements PrinterBilet{
    private String dateEliberari;
    private int pret;

    public PrinterBiletConcret(String dateEliberari, int pret) {
        this.dateEliberari = dateEliberari;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrinterBiletConcret{");
        sb.append("dateEliberari='").append(dateEliberari).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }
}
