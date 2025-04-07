package LaboratorioListasEnlazadas.Ejercicio_03;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

import java.util.Iterator;

public class MainEjercicio3 {
    public static void main(String[] args) {

        ListaEnlazadaSimple<Integer> listaNumeros = new ListaEnlazadaSimple<>();

        listaNumeros.agregarAlInicio(2);
        listaNumeros.agregarAlInicio(3);
        listaNumeros.agregarAlInicio(8);
        listaNumeros.agregarAlInicio(15);
        listaNumeros.agregarAlInicio(23);
        listaNumeros.agregarAlInicio(26);

        listaNumeros.imprimir();

        System.out.println("................");

        eliminarParesLista(listaNumeros);

        listaNumeros.imprimir();

    }

    public static void eliminarParesLista(ListaEnlazadaSimple<Integer> listaEnlazadaSimple) {

        for (Integer valor : listaEnlazadaSimple){

        }

        Iterator<Integer> iterator = listaEnlazadaSimple.iterator();

        while (iterator.hasNext()) {

            int valor = iterator.next();
            if (valor % 2 == 0) {
                listaEnlazadaSimple.eliminarNodo(valor);
            }
        }
    }
}
