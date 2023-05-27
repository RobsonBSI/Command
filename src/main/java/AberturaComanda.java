public class AberturaComanda  implements Pedido{

    private Comanda comanda;

    public AberturaComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void execultar() {
        this.comanda.abrirComanda();
    }

    @Override
    public void cancelar() {
        this.comanda.fecharComanda();
    }


}
