public class FechamentoComanda implements Pedido{
    private Comanda comanda;

    public FechamentoComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void execultar() {
        this.comanda.fecharComanda();
    }

    @Override
    public void cancelar() {
        this.comanda.abrirComanda();
    }



}
