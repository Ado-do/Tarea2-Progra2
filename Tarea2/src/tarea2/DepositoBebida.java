package tarea2;
import java.util.ArrayList;

class DepositoBebida {
    private ArrayList<Bebida> list;

    public DepositoBebida() {
        this.list = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b) {
        this.list.add(b);
    }
    public Bebida getBebida() {
        if (!list.isEmpty()) {
            return this.list.remove(0);
        } else {
            return null;
        }
    }
}