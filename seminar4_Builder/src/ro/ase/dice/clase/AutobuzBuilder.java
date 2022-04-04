package ro.ase.dice.clase;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz();
    }
    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNumarInmatriculare(String numarInmatriculare) {
        this.autobuz.setNumarInmatriculare(numarInmatriculare);
        return this;
    }

    public AutobuzBuilder setNumarLinie(String numarLinie) {
        this.autobuz.setNumarLinie(numarLinie);
        return this;
    }

    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        this.autobuz.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.autobuz.setOprireCapatLinie(oprireCapatLinie);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.autobuz.setTextDerulat(textDerulat);
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        this.autobuz.setNrLocuri(nrLocuri);
        return this;
    }

    @Override
    public Autobuz build() {
        return this.autobuz;
    }
}
