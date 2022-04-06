package ro.ase.dice.clase.METROU;

public class ValidatorScanare implements ValidatorMetrou{

    @Override
    public void valideazaBiletMetrou() {
        System.out.println("Valideaza bilet metrou");
    }

    @Override
    public void valideazaAbonamentMetrou() {
        System.out.println("Valideaza abonament metrou");
    }

    @Override
    public void valideazaBiletCalatorii() {
        System.out.println("Valideaza bilet cu calatorii metrou");
    }
}
