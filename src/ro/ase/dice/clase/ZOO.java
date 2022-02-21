package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal){
        this.animale.add(animal);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }

    public void hranesteAnimale(String mancare){
        for(Animal animal:this.animale){
        this.ingrijitorZOO.hranesteAnimal(animal, mancare);
        }
    }
}
