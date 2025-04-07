package LaboratorioListasEnlazadas.Utils;

public class Polinomio {

    private double coeficiente;
    private int exponente;

    public Polinomio(double coeficiente, int exponente){

        this.coeficiente = coeficiente;
        this.exponente = exponente;

    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
}
