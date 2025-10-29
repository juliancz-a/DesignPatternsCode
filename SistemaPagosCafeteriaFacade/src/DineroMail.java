public class DineroMail {
    public void enviarPago(String email, double monto) {
        // Simula el envío de pago por email
        System.out.println("[DineroMail] Enviando link de pago por $" + monto + " a " + email);
        System.out.println("[DineroMail] PAGO REALIZADO con éxito.");
    }

}
