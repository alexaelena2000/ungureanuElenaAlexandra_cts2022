package ro.ase.dice.clase;

public class MementoAutobuz {
    private String numeSofer;
    private float consumMediu;

    public MementoAutobuz(String numeSofer, float consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }
}