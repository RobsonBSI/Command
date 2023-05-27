import java.util.ArrayList;
import java.util.List;

public class Atendente {

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public void executarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.execultar();
    }

    public void cancelarUltimoPedido() {
        if (pedidos.size() != 0) {
            Pedido comanda = this.pedidos.get(this.pedidos.size() - 1);
            comanda.cancelar();
            this.pedidos.remove(this.pedidos.size() - 1);
        }
    }

}
