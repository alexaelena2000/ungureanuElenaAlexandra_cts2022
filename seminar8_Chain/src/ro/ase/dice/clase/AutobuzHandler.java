package ro.ase.dice.clase;

public class AutobuzHandler extends Handler {

    public AutobuzHandler(int limitaSuperioara) {
        super(limitaSuperioara);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limitaSuperioara) {
            System.out.println("Poti folosi autobuzul");
        } else {
            super.handler.afisareMijlocTransport(distanta); //pasare de responsabilitate
        }
    }
}