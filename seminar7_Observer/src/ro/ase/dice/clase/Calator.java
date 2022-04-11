package ro.ase.dice.clase;

public class Calator implements ICalator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit mesajul: "+ mesaj);
    }
}
