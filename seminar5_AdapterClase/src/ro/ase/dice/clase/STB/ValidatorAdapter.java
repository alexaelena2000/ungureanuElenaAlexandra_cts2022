package ro.ase.dice.clase.STB;

import ro.ase.dice.clase.METROU.ValidatorMetrou;
import ro.ase.dice.clase.METROU.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorStb {

    @Override
    public void validareBiltStb() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonamentStb() {
        super.valideazaAbonamentMetrou();
    }
}
