import java.util.ArrayList;
import java.util.List;

public class Persistencia {

    private List<Archivo> archivos;

    public Persistencia() {
        this.archivos = new ArrayList<>();
    }

    public static void validarEspacioEnDisco() {
        System.out.println("Validando el Espacio en Disco");
    }

    public void añadirArchivo(Archivo a) {
        this.archivos.add(a);
        System.out.println("Archivo añadido: " + a.getNombre());
    }

    public Archivo buscarArchivo(String nombre) {
        for (Archivo archivo : archivos) {
            if(archivo.getNombre().equals(nombre)) {
                return archivo;
            }
        }

        return null;
    }


    List<Archivo> getArchivos() {
        return this.archivos;
    }

}
