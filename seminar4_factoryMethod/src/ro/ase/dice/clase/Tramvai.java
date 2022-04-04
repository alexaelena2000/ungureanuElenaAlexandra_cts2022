package ro.ase.dice.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai: "+ this.nrInmatriculare);
    }
}
