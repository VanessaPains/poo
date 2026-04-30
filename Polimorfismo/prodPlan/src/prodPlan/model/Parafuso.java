package prodPlan.model;//pacote que pertence do prodPlan

//essa me diz que Parafuso herda de Parte
public class Parafuso extends Parte {
    float comprimento;//esse são os atribitos do parafuso
    float diametro;//esse são os atribitos do parafuso

    //esse e o meu construtor. ele chama o da superclasse e adiciona atributos solicitados, especificos
    //cod, nome, descricao e valor são os atributos herdados
    public Parafuso(int cod, String nome, String descricao, float valor,
            float comprimento, float diametro) {
        
        //super quer dizer que ele vai chamar o construtor da superclasse, ou seja, da classe Parte
        super(cod, nome, descricao, valor);

        //aqui ele vai inicializa os atributos especificos do Parafuso
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

    //override quer dizer que esse método é uma implementação específica para a classe Parafuso, 
    //ou seja, ele sobrescreve o metodo abstrato da classe Parte
    @Override
    //aqui ele vai calcular o valor do parafuso, que no caso e o valor definido diretamente,
    //ou seja, o valor do parafuso e o valor definido no construtor, sem nenhum calculo adicional
    public float calculaValor() {
        return valor;//aqui o valor eu ja defini diretamente
    }

    //override quer dizer que esse método é uma implementação específica para a classe Parafuso, 
    //ou seja, ele sobrescreve o metodo abstrato da classe Parte
    @Override
    //aqui ele vai definir como o parafuso será impresso em texto, ou seja, ele vai mostrar os atributos do parafuso
    public String toString() {
        //esses atributos do parafuso são os atributos herdados da classe Parte, ou seja, cod, nome, descricao e valor
        //e o que vai ser mostrado do parafuso são os atributos do parafuso, ou seja, comprimento e diametro
        //juntamente com os atributos herdados, ou seja, cod, nome, descricao e valor
        return  "codigo:" + cod + 
                " nome:" + nome + 
                " descricao:" + descricao +
                " valor:" + valor + 
                " comprimento:" + comprimento +
                " diametro:" + diametro;
    }
}
