package LaboratorioListasEnlazadas.Utils;

public class Persona {

    private String nombre;
    private String id;

    public Persona(String name, String id) {
        this.nombre = name;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre + " - " + id;
    }

}
