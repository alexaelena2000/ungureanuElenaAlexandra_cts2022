package ro.ase.dice.clase;

public class Autobuz implements MijlocTransport{
    private String numevatman;

    public Autobuz(String numevatman) {
        this.numevatman = numevatman;
    }

    public void setNumevatman(String numevatman) {
        this.numevatman = numevatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numevatman).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}
