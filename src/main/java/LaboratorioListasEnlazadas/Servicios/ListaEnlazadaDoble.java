package LaboratorioListasEnlazadas.Servicios;

public class ListaEnlazadaDoble<T> {

    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;
    private int tamanio;

    public ListaEnlazadaDoble() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public void agregarAlInicio(T valor) {

        NodoDoble<T> nodo = new NodoDoble<>(valor);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        } else {
            nodoPrimero.setAnteriorNodo(nodo);
            nodo.setSiguienteNodo(nodoPrimero);
            nodoPrimero = nodo;
        }

        tamanio++;
    }

    public void agregarAlFinal(T valor) {
        NodoDoble<T> nodo = new NodoDoble<>(valor);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        } else {
            nodo.setAnteriorNodo(nodoUltimo);
            nodoUltimo.setSiguienteNodo(nodo);
            nodoUltimo = nodo;
        }

        tamanio++;
    }

    public boolean estaVacia() {
        return nodoPrimero == null && nodoUltimo == null;
    }

    public void borrarLista() {
        nodoPrimero = nodoUltimo = null;
        tamanio = 0;
    }

    public void imprimirHaciaAtras() {
        NodoDoble<T> nodo = nodoUltimo;
        while (nodo != null) {
            System.out.println(nodo.getValorNodo());
            nodo = nodo.getAnteriorNodo();
        }
    }
}
