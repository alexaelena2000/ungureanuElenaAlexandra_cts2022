package ro.ase.dice.clase.STB;

public class ValidatorNFC implements ValidatorStb{
    @Override
    public void validareBiltStb() {
        System.out.println("Valideaza bilet stb");
    }

    @Override
    public void validareAbonamentStb() {
        System.out.println("Valideaza abonament stb");
    }
}
