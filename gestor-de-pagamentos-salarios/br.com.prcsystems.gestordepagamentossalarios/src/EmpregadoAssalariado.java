//HERDA de Empregado
public class EmpregadoAssalariado extends Empregado {

    //atributos especificos do empregado assalariado
    private double salarioSemanal;

    //CONTRUTOR para inicializar os atributos do empregado assalariado
    public EmpregadoAssalariado(String nome, String sobrenome, String ssn, double salarioSemanal) {
        
        //chama construtor da classe pai para inicializar os atributos comuns
        super(nome, sobrenome, ssn); 

        //essa e a validação
        if (salarioSemanal < 0)
            throw new IllegalArgumentException("Salário inválido");

        this.salarioSemanal = salarioSemanal;
    }

    //getter
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    //setter com validacao
    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0)
            throw new IllegalArgumentException("Salário inválido");

        this.salarioSemanal = salarioSemanal;
    }

    //esse faz o CALCULO do pagamento para o empregado assalariado
    //como o salário sera fixo, entao o calculo sera simples: retorna o salario semanal
    public double calculaPagamento() {
        return salarioSemanal;
    }

    ////especificos do empregado assalariado toString
    public String toString() {
        return "Empregado Assalariado: " + getNome() + " " + getSobrenome() +
                "\n" + super.toString() +
                "\nSalário Semanal: $" + salarioSemanal;
    }
}