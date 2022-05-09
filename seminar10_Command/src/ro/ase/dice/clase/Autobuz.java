package ro.ase.dice.clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int nrLinie){
        System.out.println("Autobuzul " + model + "a plecat de la linia " + nrLinie);
    }
}
