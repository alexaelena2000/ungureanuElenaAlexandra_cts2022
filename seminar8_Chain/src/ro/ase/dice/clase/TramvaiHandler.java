package ro.ase.dice.clase;

public class TramvaiHandler extends Handler{
    public TramvaiHandler(int limitaSuperioara) {
        super(limitaSuperioara);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limitaSuperioara) {
            System.out.println("Poti folosi tramvaiul");
        } else {
            super.handler.afisareMijlocTransport(distanta); //pasare de responsabilitate
        }
    }
}