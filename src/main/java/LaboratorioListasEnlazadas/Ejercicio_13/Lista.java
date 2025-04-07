package LaboratorioListasEnlazadas.Ejercicio_13;

public class Lista<T> {
    NodoLista<T> nodoInicio;

    public Lista() {
        nodoInicio = null;
    }

    public void agregar(T valor) {
        NodoLista nuevoNodo = new NodoLista<>(valor, null);
        if (nodoInicio == null) {
            nodoInicio = nuevoNodo;
        }else {
            nuevoNodo.setSiguiente(nodoInicio);
            nodoInicio = nuevoNodo;
        }
    }
}
