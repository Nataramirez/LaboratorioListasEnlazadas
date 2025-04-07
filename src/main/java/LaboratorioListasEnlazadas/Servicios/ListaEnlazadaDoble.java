package LaboratorioListasEnlazadas.Servicios;

import java.util.Iterator;

public class ListaEnlazadaDoble<T> implements Iterable<T> {

    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;
    private int tamanio;

    public ListaEnlazadaDoble() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public NodoDoble<T> getNodoPrimero() {
        return nodoPrimero;
    }

    public NodoDoble<T> getNodoUltimo() {
        return nodoUltimo;
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

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDoble<>(nodoPrimero);

    }

    public Iterator<T> iteratorInverso() {
        return new IteradorListaDoble(nodoUltimo, true);
    }


    public class IteradorListaDoble<T> implements Iterator<T> {
        private NodoDoble<T> nodoActual;
        private boolean iterarHaciaAtras;

        // Constructor para iterar hacia adelante
        public IteradorListaDoble(NodoDoble<T> nodo) {
            this(nodo, false);
        }

        // Constructor para iterar hacia atrás (si se pasa 'true')
        public IteradorListaDoble(NodoDoble<T> nodo, boolean iterarHaciaAtras) {
            this.nodoActual = nodo;
            this.iterarHaciaAtras = iterarHaciaAtras;
        }

        @Override
        public boolean hasNext() {
            if (iterarHaciaAtras) {
                return nodoActual != null && nodoActual.getAnteriorNodo() != null;
            }
            return nodoActual != null && nodoActual.getSiguienteNodo() != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new RuntimeException("No hay nodo para continuar");
            }

            T valor = nodoActual.getValorNodo();

            if (iterarHaciaAtras) {
                nodoActual = nodoActual.getAnteriorNodo();
            } else {
                nodoActual = nodoActual.getSiguienteNodo();
            }

            return valor;
        }
    }
}
