package ro.ase.dice.clase;

public class Elefant extends Animal{
    public Elefant(String nume) {
        super(nume);
    }

    @Override
    public void manancaAnimal(String mancare) {
        System.out.println("Elefantul" + this.getNume() + "mananca" + mancare);

    }
}
