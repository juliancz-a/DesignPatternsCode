//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Creamos los clientes
        Cliente cliente1 = new Cliente("Ana", "Lopez", "ana.lopez@email.com", "0011223344556677889900");
        Cliente cliente2 = new Cliente("Carlos", "Garcia", "carlos.g@email.com", "9988776655443322110099");

        // 2. Creamos las ÚNICAS instancias de nuestros adaptadores.
        // La clase Pedido SÓLO interactuará con estas variables de tipo MedioDePago.
        MedioDePago pagoConDebito = new DebitoAutomaticoAdapter();
        MedioDePago pagoConDineroMail = new DineroMailAdapter();


        // --- SIMULACIÓN DE PEDIDOS ---

        System.out.println("=== CASO 1: Pedido de café, paga con Débito ===");
        Pedido pedidoCafe = new Pedido(cliente1, 2500.00);
        pedidoCafe.pagarCon(pagoConDebito); // El pedido usa el adaptador de débito

        System.out.println("\n=== CASO 2: Pedido de torta, paga con DineroMail ===");
        Pedido pedidoTorta = new Pedido(cliente2, 8500.00);
        pedidoTorta.pagarCon(pagoConDineroMail); // El pedido usa el adaptador de DineroMail

        System.out.println("\n=== CASO 3: Pedido grande, débito rechazado ===");
        Pedido pedidoGrande = new Pedido(cliente1, 70000.00);
        pedidoCafe.pagarCon(pagoConDebito); // El pedido usa débito y será rechazado

    }

}