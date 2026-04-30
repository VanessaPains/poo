//essa e a minha classe de ContaCorrente
//ela implementa a INTERFACE Conta, entao ela precisa implementar os metodos DEPSITRAR, SACAR e GETSALDO
public class ContaCorrente implements Conta {
    private double saldo;//variavel para armazenar o saldo da conta corrente
    private double taxa = 2.5; //essa sera taxa ficticia fixa por saque

    //metodos implementados da interface Conta
    @Override
    //esse eo metodo para depositar o dinheiro na conta corrente.
    //ele recebe um valor e adiciona ao saldo atual da conta corrente.
    public void depositar(double valor) {
        saldo += valor;//recebe o valor do deposito e adiciona ao saldo atual da conta corrente
    }

    @Override
    //esse eo metodo para sacar o dinheiro da conta corrente.
    //ele recebe um valor e verifica se o valor mais a taxa e menor ou igual ao saldo atual da conta corrente.
    //se for, ele subtrai o valor mais a taxa do saldo. Se nao for,
    public void sacar(double valor) {
        //essa variavel total recebe o valor do saque mais a taxa,
        //para verificar se o cliente tem saldo suficiente para realizar o saque
        double total = valor + taxa;

        if (total <= saldo) {//se o valor do saque mais a taxa for menor ou igual ao saldo, entao ele pode sacar o dinheiro
            saldo -= total;
        } else {//caso contrario, ele exibe uma mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    //esee eo metodo para obter o saldo atual da conta corrente.
    //ele retorna o valor do saldo.
    public double getSaldo() {
        return saldo;
    }
}