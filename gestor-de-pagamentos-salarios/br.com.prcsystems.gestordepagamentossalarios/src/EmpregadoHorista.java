//HERDA de Empregado
public class EmpregadoHorista extends Empregado {

    //atributos especificos do empregado horista
    private double salarioHora;
    private double horasTrabalhadas;

    //CONTRUTOR para inicializar os atributos do empregado horista
    public EmpregadoHorista(String nome, String sobrenome, String ssn,
            double salarioHora, double horasTrabalhadas) {

        //chama construtor da classe pai para inicializar os atributos comuns
        super(nome, sobrenome, ssn);

        //essa e a validacao
        if (salarioHora < 0 || horasTrabalhadas < 0)
            throw new IllegalArgumentException("Valores inválidos");

        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //esse faz o CALCULO do pagamento para o empregado horista
    //o calculo leva em conta as horas extras
    //se o empregado trabalhou mais de 40 horas,
    //ele recebe 1.5 vezes o valor da hora para as horas extras
    public double calculaPagamento() {

        //se nao teve hora extra
        if (horasTrabalhadas <= 40)
            return salarioHora * horasTrabalhadas;
        //se teve hora extra
        else
            return 40 * salarioHora + (horasTrabalhadas - 40) * salarioHora * 1.5;
    }

    //especificos do empregado horista toString
    public String toString() {
        return "Empregado Horista: " + getNome() + " " + getSobrenome() +
                "\n" + super.toString() +
                "\nValor por Hora: $" + salarioHora +
                "; Horas Trabalhadas: " + horasTrabalhadas;
    }
}