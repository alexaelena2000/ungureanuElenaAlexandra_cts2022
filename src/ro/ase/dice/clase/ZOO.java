package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngreijitorZOO ingreijitorZOO;
    private List<Animal> animale;

    public ZOO(String nume, IngreijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingreijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<Animal>();
    }

    public String getNume() { return nume; }

    public void setNume(String nume) { this.nume = nume; }

    public IngreijitorZOO getIngreijitorZOO() { return ingreijitorZOO; }

    public void setIngreijitorZOO(IngreijitorZOO ingreijitorZOO) { this.ingreijitorZOO = ingreijitorZOO; }

    public List<Animal> getAnimale() { return animale; }

    public void setAnimale(List<Animal> animale) { this.animale = animale; }

    public void adaugaAnimal(Animal animalNou){
        animale.add(animalNou);
    }

    public void hranesteAnimale(String mancare){
        for(Animal animal : this.animale){
            this.ingreijitorZOO.hranesteAnimal(animal, mancare);
        }
    }
}
