package ro.ase.dice.main;

import ro.ase.dice.clase.PrinterBilet;
import ro.ase.dice.clase.PrinterBiletConcret;
import ro.ase.dice.clase.decorator.Decorator;
import ro.ase.dice.clase.decorator.PrinterMesajPaste;
import ro.ase.dice.clase.decorator.PrinterMesajSpecial;

public class Main {
    public static void main(String[] args) {
//        PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
//        printerBilet.afiseazaDescriere();
//
//        Decorator decorator = new PrinterMesajSpecial(printerBilet);
//        decorator.afiseazaDescriere();
//        decorator.afiseazaVerso();

        PrinterBilet printerBilet1 = new PrinterBiletConcret("17/04/2022", 5);
        printerBilet1.afiseazaDescriere();

        Decorator decorator1 = new PrinterMesajPaste(printerBilet1);
        decorator1.afiseazaDescriere();
        decorator1.afiseazaVerso();
    }
}
