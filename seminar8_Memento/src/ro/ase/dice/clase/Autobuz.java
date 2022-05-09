package ro.ase.dice.clase;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private int anFabricatie;
    private String model;

    public Autobuz(String numeSofer, float consumMediu, int anFabricatie, String model) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", anFAbricatie=" + anFabricatie +
                ", model='" + model + '\'' +
                '}';
    }

    public void setMementoAutobuz(MementoAutobuz mementoAutobuz){
        this.numeSofer=mementoAutobuz.getNumeSofer();
        this.consumMediu=mementoAutobuz.getConsumMediu();
    }

    public MementoAutobuz createMementoAutobuz(){
        MementoAutobuz mementoAutobuz=new MementoAutobuz(this.numeSofer,this.consumMediu);
        return mementoAutobuz;
    }
}