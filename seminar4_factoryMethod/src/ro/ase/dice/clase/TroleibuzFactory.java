package ro.ase.dice.clase;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
