package tarea2;
import java.util.ArrayList;

public class Expendedor {
    private DepositoVuelto depVuelto;
    private ArrayList<DepositoBebida> depBebidas;
    private int precio;

    public Expendedor(int cantBebidas, int precioUnico) {
        this.precio = precioUnico;       
        this.depBebidas = new ArrayList<DepositoBebida>(3);

        for (int i = 0; i < cantBebidas; i++) {
            depBebidas.get(0).addBebida(new CocaCola(100 + i));
            depBebidas.get(1).addBebida(new Fanta(200 + i));
            depBebidas.get(2).addBebida(new Sprite(300 + i));
        }
        this.depVuelto = new DepositoVuelto();
    }
    public Bebida comprarBebida(Moneda m, int num) {
        boolean devolverMoneda = false; // Flag para verificar si hay devolucion o no

        // Se ingreso una moneda?
        if (m == null) return null; // Lanzar PagoIncorrectoException (No devolver moneda)

        // Si el valor de la moneda alcanza para comprar bebida
        if (m.getValor() >= precio) {
            Bebida compra;

            // Pad numérico
            switch (num) {
                case 1:     compra = depBebidas.get(0).getBebida(); break;
                case 2:     compra = depBebidas.get(1).getBebida(); break;
                case 3:     compra = depBebidas.get(2).getBebida(); break;

                // No se ingreso eleccion valida
                default:    compra = null;  // Lanzar NoHayBebidaException (devolver moneda)
            }

            // Si no quedan bebidas o hubo eleccion invalida
            if (compra == null) {
                devolverMoneda = true;
                // Lanzar NoHayBebidaException (devolver moneda)

            // En caso de compra exitosa
            } else {
                // Si la moneda tenia una valor mayor entonces se calcula vuelto
                if (m.getValor() > precio) {
                    depVuelto.generarVuelto(m.getValor() - precio);
                }
                return compra; // Devolver bebida comprada
            }

        // En el caso de que no alcance la moneda
        } else {
            devolverMoneda = true;
            // Lanzar PagoInsuficienteException (devolver moneda)
        }

        if (devolverMoneda) depVuelto.guardarDevolucion(m); // Se guarda moneda para ser devuelta

        // En el caso de que no se haya comprado bebida exitosamente
        return null;
    }
    public Moneda getVuelto() {
        return depVuelto.getVuelto();
    }
}