//package atividadeviolacao.ocp.lsp;

public class Saque implements EstrategiaPagamento {

    @Override
    public void executar(ContaPagadora conta, double valor) {

        conta.sacar(valor);
    }
}