import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//objeto para ler a entrada do usuario
        GeradorExtratos gerador = new GeradorExtratos();//objeto para gerar os extratos das contas

        //aqui eu uso um loop para exibir o menu principal
        //ele exibe as opcoes para o usuario escolher entre conta corrente, conta poupanca ou sair do programa
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            Conta conta = null;

            if (opcao == 1) {//conta corrente
                conta = new ContaCorrente();
            } else if (opcao == 2) {//conta poupanca
                conta = new ContaPoupanca();
            }

            if (conta != null) {
                int op;

                do {//menu da conta, onde o usuario pode escolher entre depositar, sacar, ver o saldo ou voltar para o menu principal
                    System.out.println("\n--- MENU CONTA ---");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Ver saldo");
                    System.out.println("0 - Voltar");

                    op = sc.nextInt();

                    switch (op) {
                        case 1://depositar
                            System.out.print("Valor: ");
                            double dep = sc.nextDouble();
                            conta.depositar(dep);
                            break;

                        case 2://sacar
                            System.out.print("Valor: ");
                            double saque = sc.nextDouble();
                            conta.sacar(saque);
                            break;

                        case 3://ver saldo
                            System.out.println(gerador.exibeExtrato(conta));
                            break;
                    }

                } while (op != 0);
            }

        } while (opcao != 0);

        sc.close();
    }
}