import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    Atendente atendente;
    Comanda comanda;
    @BeforeEach
    void setUp() {
        comanda = new Comanda("x frango",13.0F);
        atendente = new Atendente();
    }

    @Test
    void devePreparComanda() {
        Pedido aberturaPedido = new AberturaComanda(comanda);
        atendente.executarPedido(aberturaPedido);

        assertEquals("Comanda Aberta", comanda.getStatus());
    }
    @Test
    void deveFecharComanda() {
        Pedido fecharcomanda = new FechamentoComanda(comanda);
        atendente.executarPedido(fecharcomanda);

        assertEquals("Comanda Fechada", comanda.getStatus());
    }
}