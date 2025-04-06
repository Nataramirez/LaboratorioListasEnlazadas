package LaboratorioListasEnlazadas.ejercicio_12;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainEjercicio12 {
    public static void main(String[] args) throws IOException {
        ListaEnlazadaSimple<Double> listaNumeros = extraerNumerosArchivo("src/main/java/LaboratorioListasEnlazadas/archivoNumeros.txt");

        System.out.println(".............................");
        listaNumeros.imprimir();
        System.out.println(".............................");
        System.out.println("Media: " + calcularMedia(listaNumeros));
        System.out.println("Desviacion: " + calcularDesviacion(listaNumeros));
        System.out.println(".............................");

    }

    public static ListaEnlazadaSimple<Double> extraerNumerosArchivo(String ruta) throws IOException {
        File archivo = new File(ruta);
        FileReader lector = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(lector);

        String numeroString;
        ListaEnlazadaSimple<Double> listaNumeros = new ListaEnlazadaSimple<>();


        while ((numeroString = bufferedReader.readLine()) != null) {
            try {
                listaNumeros.agregarAlInicio(Double.parseDouble(numeroString));
            } catch (Exception e) {
                System.out.println("El formato de la linea del archivo no es númerico");
            }
        }
        return listaNumeros;
    }

    public static Double calcularMedia(ListaEnlazadaSimple<Double> listaNumeros) {

        Double suma = 0.0;

        for (Double numero : listaNumeros) {
            suma += numero;
        }

        return suma / listaNumeros.getTamanio();
    }

    public static Double calcularDesviacion(ListaEnlazadaSimple<Double> listaNumeros) {

        Double suma = 0.0;
        Double media = calcularMedia(listaNumeros);

        for (Double numero : listaNumeros) {
            suma += (numero - media) * (numero - media);
        }

        return Math.sqrt(suma / (listaNumeros.getTamanio() - 1));
    }
}
