package ro.ase.dice.main;

import ro.ase.dice.clase.Calator;
import ro.ase.dice.clase.ICalator;
import ro.ase.dice.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport(137);
        ICalator c1 = new Calator("Andrei");
        ICalator c2 = new Calator("Maria");
        ICalator c3 = new Calator("Virgil");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);

        mijlocTransport.trimiteMesajPlecareCapatLinie();
        System.out.println();
        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesajPlecareCapatLinie();
    }
}
