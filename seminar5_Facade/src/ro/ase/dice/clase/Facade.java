package ro.ase.dice.clase;

public class Facade {
    private Autobuz autobuz;

    public Facade() {
        this.autobuz = new Autobuz();
    }
    public void deschideUsi(){
        this.autobuz.deschideUsaFata();
        this.autobuz.deschideUsaMijloc();
        this.autobuz.deschideUsaSpate();
    }
    public void liberUsi(){
        this.autobuz.liberUsaFata();
        this.autobuz.liberUsaMijloc();
        this.autobuz.liberUsaSpate();
    }
}
