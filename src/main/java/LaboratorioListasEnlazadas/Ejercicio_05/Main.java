package LaboratorioListasEnlazadas.Ejercicio_05;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

public class Main {

    public static void main(String[] args) {

        ListaEnlazadaSimple<String> frutas = new ListaEnlazadaSimple<>();

        frutas.agregarAlFinal("Manzana");
        frutas.agregarAlInicio("Fresa");
        frutas.agregarAlFinal("Banano");
        frutas.agregarAlFinal("Fresa");
        frutas.agregarAlInicio("Fresa");

        contarRepetidos(frutas);

    }

    public static <T> void contarRepetidos(ListaEnlazadaSimple<T> lista){

        if (lista.getTamanio() == 0) {
            System.out.println("La lista está vacía.");
            return;
        }

        int max = 0;
        T valorMasRepetido = null;
        for (T valor : lista){
            int contador = 0;
            for (T comparar : lista) {
                if (valor.equals(comparar)){
                    contador++;
                }
            }
            if (contador > max) {
                max = contador;
                valorMasRepetido = valor;
            }
        }

        System.out.println("La fruta más repetida es: " + valorMasRepetido + ", se repite " + max + " veces.");

    }

}
