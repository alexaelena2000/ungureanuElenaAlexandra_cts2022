package ro.ase.dice.clase;

public class TroleibuzHandler extends Handler{
    public TroleibuzHandler(int limitaSuperioara) {
        super(limitaSuperioara);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limitaSuperioara) {
            System.out.println("Poti folosi troleibuz");
        } else {
            super.handler.afisareMijlocTransport(distanta); //pasare de responsabilitate
        }
    }
}