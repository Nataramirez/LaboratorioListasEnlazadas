package LaboratorioListasEnlazadas.Servicios;

public class Nodo<T> {
    private T valor;
    private Nodo nodoSiguiente;


    public Nodo(T valor) {
        this.valor = valor;
        nodoSiguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
