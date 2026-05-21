//package atividadeviolacao.ocp.lsp;

public class AtividadeViolacaoOCPLSP {

    // public static void main(String[] args) {
    //     ProcessadorPagamento pg = new ProcessadorPagamento();

    //     ContaCorrente cc = new ContaCorrente(1000);
    //     pg.processar(cc, 100, "BOLETO");
    //     pg.processar(cc, 100, "SAQUE");

    //     System.out.println("Saldo da conta corrente após o saque: " + cc.saldo);

    //     try {
    //         ContaPoupanca cp = new ContaPoupanca(1000);
    //         pg.processar(cp, 100, "BOLETO");
    //         pg.processar(cp, 100, "SAQUE");
    //         System.out.println("\nSaldo da conta poupanca após o saque: " + cp.saldo);
    //     } catch (UnsupportedOperationException e) {
    //         System.out.println("\n" + e.getMessage());
    //     }

    // }

    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento();

        ContaCorrente cc = new ContaCorrente(1000);

        EstrategiaPagamento boleto = new PagamentoBoleto();

        EstrategiaPagamento saque = new Saque();

        processador.processar(boleto, cc, 100);

        processador.processar(saque, cc, 50);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(1000);

        cp.sacar(100);

        System.out.println("Saldo Conta Poupança: " + cp.getSaldo()
        );
    }
}


