package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngreijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IngreijitorZOO ingreijitorZOO = new IngreijitorZOO("Bianca");

        Zebra z1 = new Zebra("Zebra1");
        Zebra z2 = new Zebra("Zebra2");

        Elefant e1 = new Elefant("Elefant1");
        Elefant e2 = new Elefant("Elefant2");

        ZOO zoo1 = new ZOO("ZOO1", ingreijitorZOO);
        zoo1.adaugaAnimal(z1);
        zoo1.adaugaAnimal(z2);
        zoo1.adaugaAnimal(e1);
        zoo1.adaugaAnimal(e1);

        zoo1.hranesteAnimale("banane");
    }
}
