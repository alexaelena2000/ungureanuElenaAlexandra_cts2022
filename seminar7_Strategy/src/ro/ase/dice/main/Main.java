package ro.ase.dice.main;

import ro.ase.dice.clase.CardBancar;
import ro.ase.dice.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(10);
        validator.valideazaCalatorie();

        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie();

    }
}
