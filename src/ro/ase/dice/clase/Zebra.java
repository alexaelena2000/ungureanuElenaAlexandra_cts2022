package ro.ase.dice.clase;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void manancaAnimal(String mancare) {
        System.out.println("Zebra" + this.getNume() + "mananca" + mancare);
    }
}
