package LaboratorioListasEnlazadas.Ejercicio_06;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaDoble;

public class MainEjercicio6 {
    public static void main(String[] args) {

        ListaEnlazadaDoble<String> listaNombres =  new ListaEnlazadaDoble<>();

        listaNombres.agregarAlFinal("Nata");
        listaNombres.agregarAlFinal("Sara");
        listaNombres.agregarAlFinal("Valen");
        listaNombres.agregarAlInicio("Robinson");

        listaNombres.imprimirHaciaAtras();
    }
}
