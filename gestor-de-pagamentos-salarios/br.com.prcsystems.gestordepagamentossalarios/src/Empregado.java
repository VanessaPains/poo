//essa e nossa CLASSE ABSTRATA (e a base)
//CLASSE PAI das outras classes
public abstract class Empregado implements Pagavel {

    //sao os ATRIBUTOS comuns a todos os tipos de empregados
    //els são privados e final (não mudam depois de criados)
    private final String nome;
    private final String sobrenome;
    private final String numeroSeguroSocial;

    //esse e nosso CONSTRUTOR para inicializar os atributos comuns a todos os tipos de empregados
    public Empregado(String nome, String sobrenome, String numeroSeguroSocial) {
        this.nome = nome;//recebe nome
        this.sobrenome = sobrenome;//recebe sobrenome
        this.numeroSeguroSocial = numeroSeguroSocial;//recebe CPF
    }

    //soa os get e set para acessar os atributos privados
    //getter nome
    public String getNome() {
        return nome;
    }

    //getter do sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    //getter do número
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    //essa é nossa implementação do método toString
    //para exibir as informações do empregado de forma legível
    public String toString() {
        return "Número do Seguro Social: " + numeroSeguroSocial;
    }
}