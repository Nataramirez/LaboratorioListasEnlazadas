package LaboratorioListasEnlazadas.Ejercicio_13;

public class NodoLista<T> {
    private T dato;
    private NodoLista siguiente;

    public NodoLista(T valor, NodoLista nodoSiguiente) {
        dato = valor;
        siguiente = nodoSiguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
