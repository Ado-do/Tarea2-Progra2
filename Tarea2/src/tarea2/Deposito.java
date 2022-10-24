package tarea2;
import java.util.ArrayList;

public class Deposito { // Propuesta de deposito
    ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    ArrayList<Moneda> monedero = new ArrayList<Moneda>();
    public Deposito(){
    }
    void addBebida(Bebida lata){        // Como en la vida real, cada expendedor tiene su deposito
        bebidas.add(lata);            // Que ya tiene cierta cantidad de bebidas y dinero dentro para devolver como vuelto
                                        // Podriamos por ejemplo poner 10.000 lks para devolver, pero si hay 
    }                                   // que devolver 1000 x ejemplo, ponemos un limite para retirar.
    void addVuelto(Moneda mony){
        monedero.add(mony);
    }
    
}

