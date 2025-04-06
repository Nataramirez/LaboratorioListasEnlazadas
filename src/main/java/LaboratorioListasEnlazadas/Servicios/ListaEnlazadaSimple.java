package LaboratorioListasEnlazadas.Servicios;

import java.util.Iterator;

public class ListaEnlazadaSimple<T> implements Iterable<T> {
    private int tamanio;
    private Nodo<T> nodoInicio;
    private Nodo<T> nodoFinal;

    public ListaEnlazadaSimple() {
        this.tamanio = 0;
        this.nodoInicio = null;
        this.nodoFinal = null;
    }

    private void agregarPrimerNodo(Nodo<T> nodo) {
        nodoInicio = nodo;
        nodoFinal = nodo;
        this.tamanio++;
    }

    public void borrarLista() {
        nodoInicio = null;
        nodoFinal = null;
        tamanio = 0;
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);
        if (tamanio == 0) {
            agregarPrimerNodo(nodo);
        } else {
            nodo.setNodoSiguiente(nodoInicio);
            nodoInicio = nodo;
            tamanio++;
        }
    }

    public void agregarAlFinal(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);
        if (tamanio == 0) {
            agregarPrimerNodo(nodo);
        } else {
            nodoFinal.setNodoSiguiente(nodo);
            nodoFinal = nodo;
            tamanio++;
        }
    }

    public void borrarValorInicial() {
        if (tamanio == 0) throw new RuntimeException("La lista esta vacia");
        if (tamanio == 1) borrarLista();
        if (tamanio > 1) {
            Nodo<T> nodoAux = nodoInicio;
            nodoInicio = nodoAux.getNodoSiguiente();
            tamanio--;
        }
    }

    public void borrarValorFinal() {
        if (tamanio == 0) throw new RuntimeException("La lista esta vacia");
        if (tamanio == 1) borrarLista();
        if (tamanio > 1) {
            Nodo nodoAux = nodoFinal;
            while (nodoAux.getNodoSiguiente() != null) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(null);
            nodoFinal = nodoAux;
            tamanio--;
        }
    }


    public void imprimir() {
        Nodo<T> temp = nodoInicio;
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getNodoSiguiente();
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaSimple(nodoInicio);
    }

    protected class IteradorListaSimple implements Iterator<T> {

        private Nodo<T> nodo;
        private int posicion;
        
        public IteradorListaSimple(Nodo<T> nodo) {
            this.nodo = nodo;
            this.posicion = 0;

        }

        @Override
        public boolean hasNext() {
            return nodo != null;
        }

        @Override
        public T next() {
            T valor = nodo.getValor();
            nodo = nodo.getNodoSiguiente();
            posicion++;
            return valor;
        }

        public int getPosicion() {
            return posicion;
        }
    }
}
