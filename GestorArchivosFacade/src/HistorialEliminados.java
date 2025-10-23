import java.util.ArrayList;
import java.util.List;

public class HistorialEliminados {

    private List<Archivo> archivos;

    public HistorialEliminados() {
        this.archivos = new ArrayList<>();
    }

    public void actualizarEliminados(Archivo archivo, String accion) {
        System.out.println("Actualizando eliminados");

        switch (accion) {
            case "agregar":
                this.archivos.add(archivo);
                System.out.println("Agregando eliminado... " +  archivo.getNombre());
                break;
            case "recuperar":
                this.archivos.remove(archivo);
                break;
        }

    }

}
