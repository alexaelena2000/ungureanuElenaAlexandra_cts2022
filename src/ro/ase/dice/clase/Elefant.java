package ro.ase.dice.clase;

public class Elefant extends Animal{
    public Elefant(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("Elefanul " + this.getNume()+ " mananca " + mancare);
    }
}
