//essa e a minha INTERFACE da Conta.
//ela tem os metodos DEPSITRAR, SACAR e GETSALDO, que serao implementados pelas classes de ContaCorrente e ContaPoupanca.
//elas são abstratas, ou seja, elas nao tem uma implementacao concreta em nada, so estao largadas aqui para serem implementadas depois.
public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}