package tarea2;

public abstract class Moneda {
    // No tienen propiedades (como chucha sabemos el valor ?_?)

    public Moneda() {

    }
    public Moneda getSerie() {
        return null;
    }
    public abstract int getValor();
}

class Moneda100 extends Moneda {

    public Moneda100() {

    }
    @Override
    public int getValor() {
        return 0;
    }
}