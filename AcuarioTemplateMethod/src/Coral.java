public class Coral extends EspecieMarina{

    private String nivelLuzRequerida;

    public Coral(String nombre, String tanque, TipoAgua tipoAgua, String nivelLuzRequerida) {
        super(nombre, tanque, tipoAgua);
        this.nivelLuzRequerida = nivelLuzRequerida;
    }

    @Override
    protected void registrarCaracteristicas() {
        System.out.println("Registrando caracteristicas de CORAL");
    }

}
