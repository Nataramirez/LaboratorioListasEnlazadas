package LaboratorioListasEnlazadas.Ejercicio_13;

public class MainEjercicio13 {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.agregar(4);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);
        lista.agregar(8);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(4);
        lista.agregar(4);
        System.out.println(buscarValor(lista,4));
    }

    private static int buscarValor(Lista lista, int valor) {
        return recursivo(lista.nodoInicio, valor, -1, 0);
    }

    private static int recursivo(NodoLista<Integer> nodo, int valor, int distancia, int distanciaMayor) {
        if(nodo == null) return distanciaMayor;
        if(nodo.getDato() == valor && distancia != -1) {
            if(distanciaMayor == 0){
                distanciaMayor = distancia;
            } else if (distanciaMayor < distancia) {
                distanciaMayor = distancia;
            }
            distancia = 0;
        }else if(nodo.getDato() == valor) {
            distancia = 0;
        }
        return recursivo(nodo.getSiguiente(), valor, distancia+1, distanciaMayor);
    }
}
