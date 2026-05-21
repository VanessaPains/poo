//package atividadeviolacao.ocp.lsp;

public class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void executar(ContaPagadora conta, double valor) {

        conta.pagarBoleto(valor);
    }
}