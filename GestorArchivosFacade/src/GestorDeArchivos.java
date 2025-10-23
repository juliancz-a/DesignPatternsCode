public class GestorDeArchivos {

    private static GestorDeArchivos instancia;
    private static HistorialEliminados historial;
    private static Persistencia persistencia;

    public static GestorDeArchivos getInstancia(){
        if(instancia == null){
            instancia = new GestorDeArchivos();
            historial = new HistorialEliminados();
            persistencia = new Persistencia();
        }
        return instancia;
    }

    public Archivo crearArchivo(String nombre, String tipo, long peso) {
        Archivo archivo =  Archivo.crearArchivo(nombre, tipo, peso);
        this.persistencia.añadirArchivo(archivo);

        return archivo;
    }

    public void eliminarArchivo(String nombre) {
        Archivo archivo = persistencia.buscarArchivo(nombre);
        historial.actualizarEliminados(archivo, "agregar");
    }

    public void recuperarArchivo(String nombre) {
        Archivo archivo = persistencia.buscarArchivo(nombre);
        historial.actualizarEliminados(archivo, "recuperar");
        this.persistencia.añadirArchivo(archivo);
    }
}
