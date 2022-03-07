package ro.ase.dice.clase;

public class IngreijitorZOO {
    private String nume;

    public IngreijitorZOO(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Animal animal, String mancare){
        animal.manancaAnimal(mancare);
    }
}
