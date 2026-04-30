//HERDA de Empregado
public class EmpregadoComissionado extends Empregado {

    //ATRIBUTOS especificos do empregado horista
    private double vendasBrutasSemanais;
    private double taxaComissao;

    //CONTRUTOR para inicializar os atributos do empregado horista
    public EmpregadoComissionado(String nome, String sobrenome, String ssn,
            double vendas, double taxa) {

        //chama construtor da classe pai para inicializar os atributos comuns
        super(nome, sobrenome, ssn);

        //essa e a validacao
        if (vendas < 0 || taxa < 0 || taxa > 1)
            throw new IllegalArgumentException("Valores inválidos");

        this.vendasBrutasSemanais = vendas;
        this.taxaComissao = taxa;
    }

    //esse faz o CALCULO do pagamento para o empregado comissionado
    //o calculo sera simples: vendas brutas multiplicadas pela taxa de comissao
    public double calculaPagamento() {
        return vendasBrutasSemanais * taxaComissao;
    }

    //especificos do empregado comissionado toString
    public String toString() {
        return "Empregado Comissionado: " + getNome() + " " + getSobrenome() +
                "\n" + super.toString() +
                "\nVendas: $" + vendasBrutasSemanais +
                "; Taxa: " + taxaComissao;
    }
}