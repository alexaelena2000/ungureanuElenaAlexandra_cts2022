package ro.ase.dice.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuz: "+this.nrInmatriculare);
    }
}
