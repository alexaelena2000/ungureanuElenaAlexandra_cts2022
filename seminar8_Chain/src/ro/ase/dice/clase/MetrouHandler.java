package ro.ase.dice.clase;

public class MetrouHandler extends Handler {
    public MetrouHandler(int limitaSuperioara) {
        super(limitaSuperioara);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limitaSuperioara) {
            System.out.println("Poti folosi metroul");
        } else {
            super.handler.afisareMijlocTransport(distanta); //pasare de responsabilitate
        }
        //relativ veriga finala dar pt ca se schimba distantele etc; ne asiguram sa-i dam o distanta ft mare
    }
}