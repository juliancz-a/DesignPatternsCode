public class DebitoAutomatico {
    public boolean autorizar(String cbu, double monto) {
        // Simula la lógica de autorización con el banco
        System.out.println("[Débito] Autorizando $" + monto + " en CBU " + cbu);
        if (monto > 50000) {
            System.out.println("[Débito] RECHAZADO. Monto supera el límite diario.");
            return false;
        }
        System.out.println("[Débito] AUTORIZADO.");
        return true;
    }

    public void realizarPago() {
        // Simula el débito final del dinero
        System.out.println("[Débito] PAGO REALIZADO con éxito.");
    }
}
