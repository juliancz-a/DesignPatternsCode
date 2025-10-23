public class Archivo {

    private String nombre;
    private String tipo;
    private long peso;

    private Archivo(String nombre, String tipo, long peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    public static Archivo crearArchivo(String nombre, String tipo, long peso) {
        Persistencia.validarEspacioEnDisco();
        System.out.println("Creando archivo " + nombre);
        return new Archivo(nombre, tipo, peso);
    }

    public String getNombre() {
        return nombre;
    }
}
