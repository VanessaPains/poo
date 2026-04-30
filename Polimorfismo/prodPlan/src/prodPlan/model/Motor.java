package prodPlan.model;//pacote que pertence do prodPlan

//esse me diz que Mortor herda de Parte
public class Motor extends Parte {
    float potencia;//esse são os atribitos
    float corrente;//esse são os atribitos
    int rpm;//esse são os atribitos

    //esse e o meu construtor. ele chama o da superclasse e adiciona atributos solicitados, especificos
    //cod, nome, descricao e valor são os atributos herdados
    public Motor(int cod, String nome, String descricao, float valor,
            float potencia, float corrente, int rpm) {
        
        //super quer dizer que ele vai chamar o construtor da superclasse, ou seja, da classe Parte
        super(cod, nome, descricao, valor);//ou seja, aqui ele vai inicializa atributos da Parte

        //aqui ele vai inicializa os atributos especificos do Motor
        this.potencia = potencia;
        this.corrente = corrente;
        this.rpm = rpm;
    }

    //override quer dizer que esse método é uma implementação específica para a classe Motor, 
    //ou seja, ele sobrescreve o metodo abstrato da classe Parte
    @Override
    //aqui ele vai calcular o valor do motor, que no caso e o valor definido diretamente,
    //ou seja, o valor do motor e o valor definido no construtor, sem nenhum calculo adicional
    public float calculaValor() {
        return valor; //aqui o valor eu ja defini diretamente
    }

    @Override
    //aqui ele vai definir como o motor será impresso em texto, ou seja, ele vai mostrar os atributos do motor
    public String toString() {
        //esses atributos do motor são os atributos herdados da classe Parte, ou seja, cod, nome, descricao e valor
        //e o que vai ser mostrado do motor são os atributos do motor, ou seja, potencia, corrente e rpm
        //juntamente com os atributos herdados, ou seja, cod, nome, descricao e valor
        return  "codigo:" + cod + 
                " nome:" + nome + 
                " descricao:" + descricao +
                " valor:" + valor + 
                " potencia:" + potencia +
                " corrente:" + corrente + 
                " rpm:" + rpm;
    }
}
