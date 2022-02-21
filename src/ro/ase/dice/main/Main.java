package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {
    public static void main(String[] args) {
        IngrijitorZOO ingrijitorZOO = new IngrijitorZOO("Alexandra");

        Zebra z1 = new Zebra("Bianca");
        Zebra z2 = new Zebra("Claudia");

        Elefant e1 = new Elefant("Alin");
        Elefant e2 = new Elefant("George");

        ZOO zoo = new ZOO("Zoo Bucuresti", ingrijitorZOO);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);

        zoo.hranesteAnimale("banane");
    }
}
