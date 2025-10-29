public class DebitoAutomaticoAdapter implements MedioDePago{

    // El adaptador contiene una instancia del servicio que adapta
    private DebitoAutomatico servicioDebito = new DebitoAutomatico();

    @Override
    public void pagar(Cliente cliente, double monto) {
        System.out.println("--- (Adaptador Débito) ---");
        // 1. Obtiene los datos necesarios del cliente (el CBU)
        String cbu = cliente.getCBU();

        // 2. Llama a los métodos específicos del servicio adaptado en el orden correcto
        if (servicioDebito.autorizar(cbu, monto)) {
            servicioDebito.realizarPago();
        }
        System.out.println("----------------------------------------");
    }
}
