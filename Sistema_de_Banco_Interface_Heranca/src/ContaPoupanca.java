//essa e a minha classe de ContaPoupanca
//ela implementa a INTERFACE Conta, entao ela precisa implementar os metodos DEPSITRAR, SACAR e GETSALDO
public class ContaPoupanca implements Conta {
    private double saldo;//variavel para armazenar o saldo da conta poupanca

    //metodos implementados da interface Conta
    @Override
    //esse eo metodo para depositar o dinheiro na conta poupanca.
    //ele recebe um valor e adiciona ao saldo atual da conta poupanca.
    public void depositar(double valor) {
        saldo += valor;//recebe o valor do deposito e adiciona ao saldo atual da conta poupanca
    }

    @Override
    //esse eo metodo para sacar o dinheiro da conta poupanca.
    //ele recebe um valor e verifica se o valor e menor ou igual ao saldo atual da conta poupanca.
    //se for, ele subtrai o valor do saldo. Se nao for,
    public void sacar(double valor) {
        if (valor <= saldo) {//se o valor do saque for menou ou igual ao saldo, entao ele pode sacar o dinheiro
            saldo -= valor;
        } else {//caso contrario, ele exibe uma mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    //esse eo metodo para obter o saldo atual da conta poupanca.
    //ele retorna o valor do saldo.
    public double getSaldo() {
        return saldo;
    }
}