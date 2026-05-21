//package atividadeviolacao.ocp.lsp;

//class ProcessadorPagamento {
//public void processar(ContaCorrente conta, double valor, String tipo) {

    // if (tipo.equals("BOLETO")) {
    //     conta.pagarBoleto(valor);
    // } else if (tipo.equals("SAQUE")) {
    //     conta.sacar(valor);
    // }

    //}
//}
public class ProcessadorPagamento {

    public void processar(EstrategiaPagamento estrategia, ContaPagadora conta, double valor) {

        estrategia.executar(conta, valor);

    }

}
// OCP
// erro: linhas 6 a 10
// if (tipo.equals("BOLETO")) {
// conta.pagarBoleto(valor);
// } else if (tipo.equals("SAQUE")) {
// conta.sacar(valor);
// }
// Sempre que for aparcer um novo modalidade de pagamento tera de ser modificada
// a classe ProcessadorPagamento.
