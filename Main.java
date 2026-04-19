import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PedidoVenda pedido = new PedidoVenda();

        ItemPedido item1 = new ItemPedido();
        item1.descricao = "Teclado";
        item1.quantidade = 2;
        item1.precoUnitario = 100;

        ItemPedido item2 = new ItemPedido();
        item2.descricao = "Mouse";
        item2.quantidade = 1;
        item2.precoUnitario = 50;

        pedido.itens.add(item1);
        pedido.itens.add(item2);

        double total = pedido.calcularTotal();

        System.out.println("Total: " + total);
    }
}

class ItemPedido {
    String descricao;
    int quantidade;
    double precoUnitario;

    double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}

class PedidoVenda {
    ArrayList<ItemPedido> itens = new ArrayList<>();

    double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }
}