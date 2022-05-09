package ro.ase.dice.clase;


public abstract class Handler {
    protected Handler handler;
    protected int limitaSuperioara;

    public Handler( int limitaSuperioara) {
        this.handler = null;
        this.limitaSuperioara = limitaSuperioara;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void setLimitaSuperioara(int limitaSuperioara) {
        this.limitaSuperioara = limitaSuperioara;
    }

    public abstract void afisareMijlocTransport(int distanta);
}