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
class Fanta extends Bebida{
      
    public Fanta(int serie){
        super(serie);
    }
    public String beber(){
        return "Fantastica la bebida ehhh, entendieron?";
    }
    
}
class Sprite extends Bebida{

    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return "No se me ocurre que agregar aki";
    }



}