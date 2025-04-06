package LaboratorioListasEnlazadas.Servicios;

public class ListaEnlazadaSimple<T> {
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

    public void borrarLista(){
        nodoInicio = null;
        nodoFinal = null;
        tamanio = 0;
    }

    public void agregarNodoAlInicio(Nodo<T> nodo) {
        if(tamanio == 0) {
            agregarPrimerNodo(nodo);
        }else {
            Nodo<T> nodoAux = nodoInicio;
            nodoInicio = nodo;
            nodoInicio.setNodoSiguiente(nodoAux);
            tamanio++;
        }
    }

    public void agregarNodoAlFinal(Nodo<T> nodo) {
        if(tamanio == 0) {
            agregarPrimerNodo(nodo);
        }else {
            Nodo nodoAux = nodoFinal;
            nodoFinal = nodo;
            nodoAux.setNodoSiguiente(nodo);
            tamanio++;
        }
    }

    public void borrarNodoInicial() {
        if(tamanio == 0) throw new RuntimeException("La lista esta vacia");
        if(tamanio == 1) borrarLista();
        if(tamanio > 1) {
            Nodo<T> nodoAux = nodoInicio;
            nodoInicio = nodoAux.getNodoSiguiente();
            tamanio--;
        }
    }

    public void deleteEndNode() {
        if(tamanio == 0) throw new RuntimeException("La lista esta vacia");
        if(tamanio == 1) borrarLista();
        if(tamanio > 1) {
            Nodo nodoAux = nodoFinal;
            while(nodoAux.getNodoSiguiente() != null) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(null);
            nodoFinal = nodoAux;
            tamanio--;
        }
    }
}
