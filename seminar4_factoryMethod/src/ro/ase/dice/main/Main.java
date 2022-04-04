package ro.ase.dice.main;
import ro.ase.dice.clase.*;

public class Main {
    public static void afisareMijlocTransport(Factory factory, String nrInmatriculare){
        MijlocTransport mijlocTransport = factory.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }
    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B-12-BBB");
        MijlocTransport troilebuz = new TroleibuzFactory().getMijlocTransport("B 123456");
        troilebuz.afiseazaDescriere();

        new TramvaiFactory().getMijlocTransport("B 567894").afiseazaDescriere();

    }
}
