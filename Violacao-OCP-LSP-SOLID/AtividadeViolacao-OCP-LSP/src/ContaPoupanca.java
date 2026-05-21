
//package atividadeviolacao.ocp.lsp;

public class ContaPoupanca implements Conta {
    protected double saldo;

    // public ContaPoupanca(double saldo) {
    //     super(saldo);
    // }

    // @Override
    // public void pagarBoleto(double valor) {
    //     throw new UnsupportedOperationException("Conta poupança não pode pagar boletos diretamente!");
    // }

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}

// LSP
// violacao: linha 11
// throw new UnsupportedOperationException("Conta poupança não pode pagar
// boletos diretamente!");

// classe filha deve poder sustituir a classe pai sem quebrar o sistema.
// o problema e que a ContaPoupanca extends ContaCorrente onde a ContaCorrente
// consegue pagar boleto e a ContaPoupanca NÃO consegue
// Entao a filha nao consegue substituir corretamente a classe pai.

