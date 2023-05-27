public class Comanda {
    private String pedido;
    private float valor;
    private String status;

    public Comanda(String pedido, float valor) {
        this.pedido = pedido;
        this.valor = valor;
    }
    public String getStatus() {
        return status;
    }

    public void abrirComanda() {
        this.status = "Comanda Aberta";
    }

    public void fecharComanda() {
        this.status = "Comanda Fechada";
    }


}