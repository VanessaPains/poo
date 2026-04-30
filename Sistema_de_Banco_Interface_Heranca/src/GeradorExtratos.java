//essa classe e responsável por gerar os extratos das contas.
//ela tem um metodo que recebe uma conta e retorna uma string com o saldo atual da conta.
public class GeradorExtratos {

    //esse meu metodo para exibir o extrato. Ele recebe uma conta e retorna uma string com o saldo atual.
    public String exibeExtrato(Conta conta) {
        //aqui eu estou usando o metodo getSaldo da interface Conta para obter o saldo atual da conta e formatar a string de extrato.
        //ele retorna uma string com o saldo atual da conta, formatada com o valor do saldo.
        return "Saldo atual: R$ " + conta.getSaldo();
    }
}