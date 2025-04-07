package LaboratorioListasEnlazadas.Servicios;

public class ListaCircularSimple<T> {

    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int tamanio;


    public ListaCircularSimple() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        } else {
            nodo.setNodoSiguiente(nodoPrimero);
            nodoPrimero = nodo;
            nodoUltimo.setNodoSiguiente(nodoPrimero);
        }

        tamanio++;
    }

    public void insertar(T valor, int indice) {

        Nodo<T> nodoActual = nodoPrimero;
        Nodo<T> nodoAnterior = null;

        if (indiceValido(indice)) {
            for (int i = 0; i < indice; i++) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getNodoSiguiente();
            }

            Nodo<T> nuevoNodo = new Nodo<>(valor);
            nuevoNodo.setNodoSiguiente(nodoActual);

            if (nodoAnterior != null){
                nodoAnterior.setNodoSiguiente(nuevoNodo);
            }

            tamanio++;
        }

    }

    public T buscar(int indice) {

        indiceValido(indice);
        Nodo<T> nodo = nodoPrimero;

        for (int i = 0; i < indice; i++) {
            nodo = nodo.getNodoSiguiente();
        }

        return nodo.getValor();
    }

    public void agregarAlFinal(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        } else {
            nodoUltimo.setNodoSiguiente(nodo);
            nodo.setNodoSiguiente(nodoPrimero);
            nodoUltimo = nodo;
        }

        tamanio++;
    }

    private boolean indiceValido(int indice) {

        if (indice >= 0 && indice < tamanio) {
            return true;
        }

        throw new RuntimeException("Índice no válido");
    }

    public boolean estaVacia() {
        return nodoPrimero == null && nodoUltimo == null;
    }


}
