package ro.ase.dice.clase;

public abstract class MijlocTransportPeSine {
    protected abstract void oprireStatia1();
    protected abstract void oprireStatia2();
    protected abstract void oprireStatia3();

    public final void parcurgereTraseu(){
        oprireStatia1();
        oprireStatia2();
        oprireStatia3();
    }

    public final void parcurgereTraseuInvers(){
        oprireStatia3();
        oprireStatia2();
        oprireStatia1();
    }

}
