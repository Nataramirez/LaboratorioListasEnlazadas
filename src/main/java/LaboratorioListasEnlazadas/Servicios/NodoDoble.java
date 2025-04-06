package LaboratorioListasEnlazadas.Servicios;

public class NodoDoble<T> {

    private NodoDoble<T> siguienteNodo;
    private NodoDoble<T> anteriorNodo;
    private T valorNodo;

    public NodoDoble(T valor) {
        this.siguienteNodo = null;
        this.anteriorNodo = null;
        this.valorNodo = valor;
    }

    public NodoDoble<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoDoble<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public NodoDoble<T> getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(NodoDoble<T> anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }

    public T getValorNodo() {
        return valorNodo;
    }

    public void setValorNodo(T valorNodo) {
        this.valorNodo = valorNodo;
    }
}
