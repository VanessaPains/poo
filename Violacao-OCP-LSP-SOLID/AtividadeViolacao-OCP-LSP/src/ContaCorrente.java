//package atividadeviolacao.ocp.lsp;

public class ContaCorrente implements ContaPagadora{

    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    @Override
    public void pagarBoleto(double valor) {
        this.saldo = this.saldo - valor;
        System.out.println("");
        System.out.println("-- PAGAMENTO DE BOLETO --");
        System.out.println("Boleto pago com Conta Corrente. Saldo restante: " + this.saldo);
    }

}
//colocado implements ContaPagadora
//e os @Override