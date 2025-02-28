import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Prato> listaDePratos;
    private double total;

    // Construtor da classe Pedido
    public Pedido(int numeroPedido, String cliente) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser vazio.");
        }
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0;
    }

    // Método para adicionar um prato ao pedido
    public void adicionarPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Prato não pode ser nulo.");
        }
        listaDePratos.add(prato);
        total += prato.getPreco();  // Atualiza o total do pedido
    }

    // Método para remover um prato do pedido
    public void removerPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Prato não pode ser nulo.");
        }
        if (listaDePratos.remove(prato)) {
            total -= prato.getPreco();  // Atualiza o total do pedido
        }
    }

    // Método para calcular o total do pedido
    public double calcularTotal() {
        return total;
    }

    // Método para visualizar os detalhes do pedido
    public void visualizarPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Pratos do Pedido:");
        for (Prato prato : listaDePratos) {
            System.out.println(prato);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
