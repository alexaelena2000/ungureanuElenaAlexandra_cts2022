package ro.ase.dice.clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("SMS. Pretul este:" + pret);
    }
}
