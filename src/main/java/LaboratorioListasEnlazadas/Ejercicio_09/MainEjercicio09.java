package LaboratorioListasEnlazadas.Ejercicio_09;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

public class MainEjercicio09 {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista1 = new ListaEnlazadaSimple<>();
        lista1.agregarAlInicio(3);
        lista1.agregarAlInicio(2);
        lista1.agregarAlInicio(5);
        lista1.agregarAlInicio(4);
        lista1.agregarAlInicio(8);

        ListaEnlazadaSimple<Integer> lista2 = new ListaEnlazadaSimple<>();
        lista2.agregarAlInicio(13);
        lista2.agregarAlInicio(12);
        lista2.agregarAlInicio(15);
        lista2.agregarAlInicio(14);
        lista2.agregarAlInicio(18);

        ListaEnlazadaSimple<Integer> listaContatenada = concatenar(lista1, lista2);
        listaContatenada.imprimir();
    }

    public static ListaEnlazadaSimple<Integer> concatenar(
            ListaEnlazadaSimple<Integer> lista1,
            ListaEnlazadaSimple<Integer> lista2) {
        ListaEnlazadaSimple<Integer> listaAux = new ListaEnlazadaSimple<>();
        for(Integer numero: lista1){
            listaAux.agregarAlInicio(numero);
        }

        for(Integer numero: lista2){
            listaAux.agregarAlInicio(numero);
        };
        return listaAux;
    }
}
