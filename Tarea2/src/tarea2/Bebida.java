package tarea2;

public abstract class Bebida {
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }
    @Override
    public String beber() {
        return "Que rica cola!, p*ta que rico, eh!";
    }
}
