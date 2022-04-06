package ro.ase.dice.main;

import ro.ase.dice.clase.METROU.ValidatorScanare;
import ro.ase.dice.clase.STB.ValidatorAdapter;

public class Main {
    public static void main(String[] args) {
        ValidatorScanare validatorScanare = new ValidatorScanare();
        ValidatorAdapter validatorAdapter = new ValidatorAdapter(validatorScanare);
        validatorAdapter.validareBiltStb();
        validatorAdapter.validareAbonamentStb();
    }
}
