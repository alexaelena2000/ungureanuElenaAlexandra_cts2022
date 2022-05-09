package ro.ase.dice.main;


import ro.ase.dice.clase.Autobaza;
import ro.ase.dice.clase.Autobuz;
import ro.ase.dice.clase.MementoAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel",6,8,"Otokar");
        Autobaza managerAutobuze = new Autobaza();

        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setNumeSofer("Florin");
        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setConsumMediu(8);
        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        System.out.println(autobuz);

        autobuz.setMementoAutobuz(managerAutobuze.getMementoAutobuz(0));
        System.out.println(autobuz);

    }
}

