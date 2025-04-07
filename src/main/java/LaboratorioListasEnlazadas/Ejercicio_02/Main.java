package LaboratorioListasEnlazadas.Ejercicio_02;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;
import LaboratorioListasEnlazadas.Utils.Persona;

public class Main {

    public static void main(String[] args) {

        ListaEnlazadaSimple<Persona> personas = new ListaEnlazadaSimple<>();
        Persona persona1 = new Persona("Nata", "123456");
        Persona persona2 = new Persona("Valen", "12345678");
        Persona persona3 = new Persona("Maria", "7654321");
        Persona persona4 = new Persona("Jose", "9876543");
        Persona persona5 = new Persona("Andres", "1010101");
        Persona persona6 = new Persona("Sara", "1234");
        personas.agregarAlFinal(persona1);
        personas.agregarAlFinal(persona2);
        personas.agregarAlFinal(persona3);
        personas.agregarAlFinal(persona4);
        personas.agregarAlFinal(persona5);
        personas.agregarAlFinal(persona6);

        ListaEnlazadaSimple<Persona> personasConCedulaPar = cedulasPares(personas);
        System.out.println("Personas con cédula de longitud par:");
        personasConCedulaPar.imprimir();

    }

    public static ListaEnlazadaSimple<Persona> cedulasPares(ListaEnlazadaSimple<Persona> personas) {

        ListaEnlazadaSimple<Persona> resultado = new ListaEnlazadaSimple<>();

        for (Persona persona : personas) {
            String cedula = persona.getId();
            if (cedula.length() % 2 == 0) {
                resultado.agregarAlFinal(persona);
            }
        }

        return resultado;
    }

}
