public class Molusco extends  EspecieMarina {
    private boolean esVenenoso;

    public Molusco(String nombre, String tanque, TipoAgua tipoAgua,boolean esVenenoso) {
        super(nombre, tanque, tipoAgua);
        this.esVenenoso = esVenenoso;
    }

    @Override
    protected void registrarCaracteristicas() {
        System.out.println("Registrando caracteristicas de Molusco");
    }

    public boolean requiereCuidadoEspecial() {
        System.out.println("===== REVISANDO CUIDADO ESPECIAL DE MOLUSCO =======");
        return esVenenoso;
    }
}
