package LaboratorioListasEnlazadas.Ejercicio_11;

import LaboratorioListasEnlazadas.Servicios.ListaEnlazadaSimple;
import LaboratorioListasEnlazadas.Utils.Polinomio;


public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Polinomio> polinomio = new ListaEnlazadaSimple<>();

        polinomio.agregarAlInicio(new Polinomio(3, 4));
        polinomio.agregarAlFinal(new Polinomio(-4, 2));
        polinomio.agregarAlFinal(new Polinomio(11, 0));

        System.out.println("x\tP(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double y = evaluarPolinomio(polinomio, x);
            System.out.printf("%.1f\t%.4f%n", x, y);
        }
    }

    public static double evaluarPolinomio(ListaEnlazadaSimple<Polinomio> polinomio, double x) {
        double y = 0.0;
        for (Polinomio t : polinomio) {
            y += t.getCoeficiente() * Math.pow(x, t.getExponente());
        }
        return y;
    }
}
