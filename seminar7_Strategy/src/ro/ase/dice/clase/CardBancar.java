package ro.ase.dice.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Card bancar. Pretul este: " + pret);
    }
}
