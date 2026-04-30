//HERDA de Comissionado
public class EmpregadoMisto extends EmpregadoComissionado {

    //atributos especificos do empregado misto
    private double salarioBase;

    //CONTRUTOR para inicializar os atributos do empregado misto
    public EmpregadoMisto(String nome, String sobrenome, String ssn,
            double vendas, double taxa, double salarioBase) {

        super(nome, sobrenome, ssn, vendas, taxa);

        if (salarioBase < 0)
            throw new IllegalArgumentException("Salário inválido");

        this.salarioBase = salarioBase;
    }

    //get e set do salario base
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0)
            throw new IllegalArgumentException("Salário inválido");

        this.salarioBase = salarioBase;
    }

    //esse faz o CALCULO do pagamento,
    //que e a soma do salario base com a comissão
    public double calculaPagamento() {
        return salarioBase + super.calculaPagamento();
    }

    //especificos do empregado misto
    public String toString() {
        return "Empregado Misto: " + getNome() + " " + getSobrenome() +
                "\n" + super.toString() +
                "; Salário Base: $" + salarioBase;
    }
}