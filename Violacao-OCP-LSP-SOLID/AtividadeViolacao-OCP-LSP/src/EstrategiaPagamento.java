//package atividadeviolacao.ocp.lsp;

public interface EstrategiaPagamento {

    void executar(ContaPagadora conta, double valor);
}