public class Pez extends EspecieMarina{
    private int numeroAletas;
    private boolean esVenenoso;


    public Pez(String nombre, String tanque, TipoAgua tipoAgua, int numeroAletas, boolean esVenenoso) {
        super(nombre, tanque, tipoAgua);
        this.numeroAletas = numeroAletas;
        this.esVenenoso = esVenenoso;
    }

    @Override
    protected void registrarCaracteristicas() {
        System.out.println("Registrando caracteristicas de PEZ");
    }

    public boolean requiereCuidadoEspecial() {
        System.out.println("===== REVISANDO CUIDADO ESPECIAL DE PEZ=======");
        return esVenenoso;
    }
}
