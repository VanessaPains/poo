package prodPlan.model;//pacote que pertence do prodPlan

//classe abstrata que define os atributos comuns, que NÂO pode ser iniciadas
public abstract class Parte {
    int cod;          //coigo da parte
    String nome;      //nome da parte
    String descricao; //descrição da parte
    float valor;      //valor da parte

    //esse são meu construtores. não esqueve vanessa 
    //estou semmpre me confundindo
    //construtor: inicializa os atributos
    public Parte(int cod, String nome, String descricao, float valor) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    //esse sao os metodo abstrato: cada subclasse implementa sua forma de calcular valor
    public abstract float calculaValor();

    //esse sao o metodo abstrato: cada subclasse define como será impressa em texto
    public abstract String toString();
}
