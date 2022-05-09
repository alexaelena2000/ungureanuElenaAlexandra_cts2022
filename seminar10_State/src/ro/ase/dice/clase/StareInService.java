package ro.ase.dice.clase;

public class StareInService implements IStare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " intra in service.");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate sa intre in service.");
        }
    }
}
