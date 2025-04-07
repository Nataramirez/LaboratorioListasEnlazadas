package LaboratorioListasEnlazadas.Ejercicio_09;

import LaboratorioListasEnlazadas.Servicios.ListaCircularSimple;

public class MainEjercicio9 {
    public static void main(String[] args) {
        ListaCircularSimple<String> listaNombres =  new ListaCircularSimple<>();

        listaNombres.agregarAlInicio("Nata");
        listaNombres.agregarAlInicio("Sara");
        listaNombres.agregarAlInicio("Valen");
        listaNombres.agregarAlFinal("Juan");
        listaNombres.insertar("Andrea", 3);

        System.out.println(listaNombres.buscar(4));

    }
}