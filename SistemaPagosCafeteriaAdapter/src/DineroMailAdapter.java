public class DineroMailAdapter implements MedioDePago {
    // El adaptador contiene una instancia del servicio que adapta
    private DineroMail servicioDineroMail = new DineroMail();

    @Override
    public void pagar(Cliente cliente, double monto) {
        System.out.println("--- (Adaptador DineroMail) ---");
        // 1. Obtiene los datos necesarios del cliente (el Email)
        String email = cliente.getEmail();

        // 2. Llama al método específico del servicio adaptado
        servicioDineroMail.enviarPago(email, monto);
        System.out.println("------------------------------------------");
    }
}
