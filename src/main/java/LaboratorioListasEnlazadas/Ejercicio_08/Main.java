package LaboratorioListasEnlazadas.Ejercicio_08;

import LaboratorioListasEnlazadas.Utils.Persona;
import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaDoble;
import LaboratorioListasEnlazadas.Servicios.NodoDoble;

public class Main {

    public static void main(String[] args) {

        ListaEnlazadaDoble<Persona> personas = new ListaEnlazadaDoble<>();
        personas.agregarAlFinal(new Persona("Nata", "123456"));
        personas.agregarAlFinal(new Persona("Valen", "12345678"));
        personas.agregarAlFinal(new Persona("Maria", "7654321"));
        personas.agregarAlFinal(new Persona("Jose", "9876543"));
        personas.agregarAlFinal(new Persona("Andres", "1010101"));
        personas.agregarAlFinal(new Persona("Sara", "1234"));

        ListaEnlazadaDoble<Persona> cedulasPares = obtenerCedulaPar(personas);

        System.out.println("Personas con cédula de longitud par:");
        NodoDoble<Persona> nodo = cedulasPares.getNodoPrimero();
        while (nodo != null) {
            System.out.println(nodo.getValorNodo());
            nodo = nodo.getSiguienteNodo();
        }


    }

    public static ListaEnlazadaDoble<Persona> obtenerCedulaPar(ListaEnlazadaDoble<Persona> lista) {

        ListaEnlazadaDoble<Persona> aux = new ListaEnlazadaDoble<>();

        NodoDoble<Persona> nodo = lista.getNodoPrimero();

        while (nodo != null) {
            Persona persona = nodo.getValorNodo();
            if (persona.getId().length() % 2 == 0) {
                aux.agregarAlFinal(persona);
            }
            nodo = nodo.getSiguienteNodo();
        }

        return aux;
    }


}
