package ro.ase.dice.clase.STB;

import ro.ase.dice.clase.METROU.ValidatorMetrou;

public class ValidatorAdapter implements ValidatorStb{
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareBiltStb() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonamentStb() {
        validatorMetrou.valideazaAbonamentMetrou();
    }
}
