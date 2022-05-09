package ro.ase.dice.clase;

public class Autobuz {
    private IStare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.stare = new StareLaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }
//sa nu putem sa ii schimbam starea din main am pus protected
    protected void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        StareInCursa stareInCursa = new StareInCursa();
        stareInCursa.doAction(this);
    }
    public void intraInService(){
        StareInService stareInService = new StareInService();
        stareInService.doAction(this);
    }
    public void ieseDinService(){
        StareLaCapatDeLinie stareLaCapatDeLinie = new StareLaCapatDeLinie();
        stareLaCapatDeLinie.doAction(this);
    }
    public void ajungeLaCapatDeLinie(){
        StareLaCapatDeLinie stareLaCapatDeLinie = new StareLaCapatDeLinie();
        stareLaCapatDeLinie.doAction(this);
    }
}
