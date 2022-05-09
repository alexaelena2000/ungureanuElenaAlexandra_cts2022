package ro.ase.dice.clase;

public class Tramvai extends MijlocTransportPeSine {
    @Override
    protected void oprireStatia1() {
        System.out.println("Tramvaiul a ajuns in statia 1!");
    }

    @Override
    protected void oprireStatia2() {
        System.out.println("Tramvaiul a ajuns in statia 2!");
    }

    @Override
    protected void oprireStatia3() {
        System.out.println("Tramvaiul a ajuns in statia 3!");
    }
}
