package ro.ase.dice.clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Card STB. Pretul este:" + pret);
    }
}
