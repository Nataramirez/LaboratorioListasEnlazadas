package LaboratorioListasEnlazadas.Ejercicio_04;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

import java.util.Iterator;

public class MainEjercicio04 {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();
        lista.agregarAlInicio(3);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(4);
        lista.agregarAlInicio(8);

        ListaEnlazadaSimple<Integer> nuevaLista = valoresImpares(lista);
        nuevaLista.imprimir();
        System.out.println(lista.iterator().hasNext());
        System.out.println(lista.iterator().hasNext());
        System.out.println(lista.iterator().hasNext());
    }

    public static ListaEnlazadaSimple<Integer> valoresImpares(ListaEnlazadaSimple<Integer> lista) {
        ListaEnlazadaSimple<Integer> aux = new ListaEnlazadaSimple<>();
        for(Integer numero: lista){
            if(numero % 2 == 1){
                aux.agregarAlInicio(numero);
            }
        };
        return aux;
    }
}
