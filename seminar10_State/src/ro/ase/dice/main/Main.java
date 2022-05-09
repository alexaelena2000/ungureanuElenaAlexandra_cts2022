package ro.ase.dice.main;

import ro.ase.dice.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz a = new Autobuz(13);
        a.pleacaInCursa();
        a.intraInService();
        a.ieseDinService();
        a.ajungeLaCapatDeLinie();
        a.pleacaInCursa();
        a.intraInService();
        a.pleacaInCursa();
    }
}
