public class Pedido {
    private Cliente cliente;
    private double monto;

    public Pedido(Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    public void pagarCon(MedioDePago medioDePago) {
        System.out.println("Iniciando pago de $" + monto + " para el cliente " + cliente + "...");
        medioDePago.pagar(cliente, monto);
    }
}
