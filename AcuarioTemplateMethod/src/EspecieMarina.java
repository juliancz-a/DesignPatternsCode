public abstract class EspecieMarina {
    private String nombre;
    private String tanque;
    private TipoAgua tipoAgua;

    public EspecieMarina(String nombre, String tanque, TipoAgua tipoAgua) {
        this.nombre = nombre;
        this.tanque = tanque;
        this.tipoAgua = tipoAgua;
    }

    // TEMPLATE METHOD
    public void registrarEspecie() {
        if (!this.validarDatosBasicos()){
            System.out.println("Error al registrar especie: Datos invalidos");
            return;
        }

        this.registrarCaracteristicas();

        if (this.requiereCuidadoEspecial()){
            System.out.println("ATENCIÓN: Esta Especie requiere cuidado especial");
        }

        this.mostrarResumen();
    }

    // HOOK METHOD
    public boolean requiereCuidadoEspecial() {
        return EspecieMarina.class.isInstance(Pez.class);
    }


    // Metodos Compartidos y comunes
    public boolean validarDatosBasicos() {
        return (nombre != null && tanque != null && tipoAgua != null);
    }

    public void mostrarResumen() {
        System.out.println("EspecieMarina: " + nombre + " " + tanque + " " + tipoAgua.toString());
        System.out.println("===================================================");
    }

    // Metodos a implementar por clases hijas
    protected abstract void registrarCaracteristicas();


}


