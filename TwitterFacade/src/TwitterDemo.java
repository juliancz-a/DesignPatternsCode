/**
 * Clase 1: Usuario (Clase de entidad/datos)
 */
class Usuario {
    private String nombre;
    private String email;
    private boolean autenticado;

    public Usuario(String nombre, String email, boolean autenticado) {
        this.nombre = nombre;
        this.email = email;
        this.autenticado = autenticado;
    }

    // Getters definidos en el diagrama (o implícitos)
    public boolean isAutenticado() {
        return autenticado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

/*
================================================================================
 PARTE 1: LOS SUBSISTEMAS COMPLEJOS
================================================================================
*/

/**
 * Subsistema 1: Autenticador
 * Valida si el usuario tiene permiso.
 */
class Autenticador {
    public boolean validar(Usuario usuario) {
        System.out.println("SUBSISTEMA [Autenticador]: Validando a " + usuario.getNombre() + "...");
        if (usuario.isAutenticado()) {
            System.out.println("SUBSISTEMA [Autenticador]: Usuario VALIDADO.");
            return true;
        } else {
            System.out.println("SUBSISTEMA [Autenticador]: ERROR. Usuario no autenticado.");
            return false;
        }
    }
}

/**
 * Subsistema 2: Persistencia
 * Guarda el mensaje en la base de datos.
 */
class Persistencia {
    public void guardarMensaje(Usuario usuario, String mensaje) {
        // Simula el guardado en la base de datos
        System.out.println("SUBSISTEMA [Persistencia]: Guardando en BBDD para " + usuario.getNombre() + ": '" + mensaje + "'");
    }
}

/**
 * Subsistema 3: Notificador
 * Envía notificaciones a los seguidores.
 */
class Notificador {
    public void notificarSeguidores(Usuario usuario, String mensaje) {
        // Simula el envío de notificaciones
        System.out.println("SUBSISTEMA [Notificador]: Notificando a los seguidores de " + usuario.getNombre() + " sobre el nuevo mensaje.");
    }
}

/*
================================================================================
 PARTE 2: LA CLASE FACADE (FACHADA)
================================================================================
*/

class FacadeTwitter {
    // 1. Atributos: La fachada CONOCE a los subsistemas
    private Autenticador autenticador;
    private Persistencia persistencia;
    private Notificador notificador;

    // 2. Constructor: Inicializa los subsistemas
    public FacadeTwitter() {
        // En una aplicación real, esto podría usar Inyección de Dependencias
        this.autenticador = new Autenticador();
        this.persistencia = new Persistencia();
        this.notificador = new Notificador();
    }

    // 3. Método simple: El punto de entrada para el cliente
    public void publicarMensaje(Usuario usuario, String mensaje) {

        System.out.println("--- FACADE: Iniciando publicacion de mensaje ---");

        // Paso 1: Validar (según la consigna)
        if (autenticador.validar(usuario)) {

            // Paso 2: Persistir (según la consigna)
            persistencia.guardarMensaje(usuario, mensaje);

            // Paso 3: Notificar (según la consigna)
            notificador.notificarSeguidores(usuario, mensaje);

            System.out.println("--- FACADE: Publicacion completada ---");
        } else {
            // Si la validación falla, la fachada detiene el proceso
            System.out.println("--- FACADE: Publicacion FALLIDA (Usuario no valido) ---");
        }
    }
}

/*
================================================================================
 PARTE 3: DEMOSTRACIÓN (El Cliente)
================================================================================
*/

public class TwitterDemo {
    public static void main(String[] args) {

        // El cliente (nuestro main) SÓLO necesita conocer la Facade.
        FacadeTwitter miTwitter = new FacadeTwitter();

        // Creamos dos usuarios para la demo
        Usuario usuarioValido = new Usuario("Tomas Fernandez", "tomas@email.com", true);
        Usuario usuarioNoValido = new Usuario("Invitado", "guest@email.com", false);

        // --- CASO 1: Usuario válido publica un mensaje ---
        System.out.println("=== CASO 1: " + usuarioValido.getNombre() + " publica un mensaje ===");
        String mensaje1 = "¡Hola a todos! Este es mi primer mensaje usando Facade.";

        miTwitter.publicarMensaje(usuarioValido, mensaje1);
        System.out.println("\n");

        // --- CASO 2: Usuario no válido intenta publicar ---
        System.out.println("=== CASO 2: " + usuarioNoValido.getNombre() + " publica un mensaje ===");
        String mensaje2 = "Estoy intentando publicar sin estar logueado.";

        // El cliente hace la MISMA llamada
        miTwitter.publicarMensaje(usuarioNoValido, mensaje2);
    }
}