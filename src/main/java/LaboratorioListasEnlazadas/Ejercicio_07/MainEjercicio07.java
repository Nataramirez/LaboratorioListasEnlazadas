package LaboratorioListasEnlazadas.Ejercicio_07;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaDoble;

import java.util.Iterator;

public class MainEjercicio07 {
    public static void main(String[] args) {
        ListaEnlazadaDoble<Integer> lista = new ListaEnlazadaDoble<>();
        lista.agregarAlInicio(3);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(4);
        lista.agregarAlInicio(8);

        System.out.println("Iterando hacia adelante:");
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("Iterando hacia adelante:");
        Iterator<Integer> iterador2 = lista.iteratorInverso();
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }



    }
}
