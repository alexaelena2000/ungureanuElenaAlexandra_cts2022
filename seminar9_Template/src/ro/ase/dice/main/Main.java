package ro.ase.dice.main;


import ro.ase.dice.clase.MijlocTransportPeSine;
import ro.ase.dice.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuInvers();

    }
}
