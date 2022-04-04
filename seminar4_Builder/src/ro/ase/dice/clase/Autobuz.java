package ro.ase.dice.clase;

//daca facem setterii privati, trebuie sa punem clasa Builder sa fie inner class
//am pus default la setteri si la constructor pentru a nu mai putea fi apelati din main, dar sa pot fi apelati din Builder
public class Autobuz {
    private String numeSofer;
    private String numarInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textDerulat;
    private int nrLocuri;

    Autobuz() {
        this.numeSofer = "Doru";
        this.numarInmatriculare = "B12345";
        this.numarLinie = "54";
        this.openDoors = Boolean.TRUE;
        this.oprireCapatLinie = Boolean.TRUE;
        this.textDerulat = "textul Derulat";
        this.nrLocuri = 20;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

     void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

     void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

     void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", openDoors=" + openDoors +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", textDerulat='" + textDerulat + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
