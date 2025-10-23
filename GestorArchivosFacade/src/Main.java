//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestorDeArchivos gestor = GestorDeArchivos.getInstancia();

        gestor.crearArchivo("video_001", "video", 10500053);
        gestor.eliminarArchivo("video_001");

    }
}