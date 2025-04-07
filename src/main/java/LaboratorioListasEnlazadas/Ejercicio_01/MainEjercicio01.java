package LaboratorioListasEnlazadas.Ejercicio_01;
import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

public class MainEjercicio01 {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();
        lista.agregarAlInicio(3);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(4);
        lista.agregarAlInicio(8);

        ListaEnlazadaSimple<Integer> nuevaLista = numerosPosicionesImpares(lista);
        nuevaLista.imprimir();
    }

    public static ListaEnlazadaSimple<Integer> numerosPosicionesImpares(ListaEnlazadaSimple<Integer> lista) {
        ListaEnlazadaSimple<Integer> aux = new ListaEnlazadaSimple<>();
        int index = 0;
        for(Integer numero: lista){
            if(index % 2 == 1){
                aux.agregarAlInicio(numero);
            }
            index++;
        };
        return aux;
    }
}
