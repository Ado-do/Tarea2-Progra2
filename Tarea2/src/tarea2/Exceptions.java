package tarea2;

class NoHayBebidaException extends Exception {

    public NoHayBebidaException(String errorMessage) {
        super(errorMessage);
    }
}
class PagoIncorrectoException extends Exception {

    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}