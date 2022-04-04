package ro.ase.dice.main;

import ro.ase.dice.clase.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a1 = new Autobuz("Andrei");
        Autobuz a2 = (Autobuz) a1.copiaza();
        a2.setNumevatman("Gigel");

        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
