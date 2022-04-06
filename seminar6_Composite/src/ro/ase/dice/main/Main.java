package ro.ase.dice.main;

import jdk.jshell.spi.ExecutionControl;
import ro.ase.dice.clase.Autobuz;
import ro.ase.dice.clase.Grup;
import ro.ase.dice.clase.MijlocTransport;

public class Main {
    public static void main(String[] args){
        MijlocTransport a1 = new Autobuz("STB", "Mercesdes", 10);
        MijlocTransport a2 = new Autobuz("RATB", "Otokar", 8);
        MijlocTransport a3 = new Autobuz("PTB", "Audi", 40);

        MijlocTransport g1 = new Grup("mici");
        MijlocTransport g2 = new Grup("medii");
        MijlocTransport g3 = new Grup("flota");

        try {
        g1.adaugaMijlocTransport(a1);
        g1.adaugaMijlocTransport(a2);

        g2.adaugaMijlocTransport(a3);

        g3.adaugaMijlocTransport(g1);
        g3.adaugaMijlocTransport(g2);
        }catch(ExecutionControl.NotImplementedException e){
            e.printStackTrace();
        }
        g3.afiseazaDescriere();
    }
}
