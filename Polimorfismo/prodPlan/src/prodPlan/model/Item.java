package prodPlan.model;//pacote que pertence do prodPlan

//essa classe representa um ITEM solicitado, ou seja, uma parte e a quantidade solicitada dessa parte
//ela tem uma referencia a uma PARTE, que pode ser um MOTOR ou um PARAFUSO, e a quantidade solicitada dessa parte
public class Item {
    //referência a uma Parte (Motor ou Parafuso)
    //ou seja, um Item tem uma Parte, que pode ser um Motor ou um Parafuso, e a quantidade solicitada dessa Parte
    Parte parte;
    int quantidade; //essa e a quantidade solicitada dessa Parte

    //esse e o meu construtor do ITEM, que recebe uma PARTE e a quantidade solicitada dessa Parte
    public Item(Parte parte, int quantidade) {
        this.parte = parte;//aqui ele vai inicializa a parte do item, ou seja, a parte que pode ser um Motor ou um Parafuso
        this.quantidade = quantidade;//aqui ele vai inicializa a quantidade do item, ou seja, a quantidade solicitada dessa parte
    }

    //aqui ele vai calcular o valor do item, que é o valor da parte multiplicado pela quantidade solicitada dessa parte
    //ou seja, o valor do item é o valor da parte (que pode ser um Motor ou um Parafuso) multiplicado pela quantidade solicitada dessa parte
    public float calculaValor() {
        //aqui ele vai calcular o valor do item, que é o valor da parte multiplicado pela quantidade solicitada dessa parte
        return parte.calculaValor() * quantidade;
    }

    //override quer dizer que esse método é uma implementação específica para a classe Item, 
    //ou seja, ele sobrescreve o metodo toString() da classe Object, que
    //é a classe pai de todas as classes em Java, ou seja, todas as classes em Java
    //herdam da classe Object, e a classe Object tem um método toString() que é sobrescrito aqui para 
    //mostrar as informações do Item
    @Override
    public String toString() {
        //aqui ele vai definir como o item será impresso em texto, ou seja, ele vai mostrar os atributos do item
        //esses atributos do item são os atributos da parte (que pode ser um Motor ou um Parafuso), ou seja, 
        //cod, nome, descricao e valor
        //juntamente com a quantidade solicitada dessa parte, ou seja, a quantidade do item
        return  "cod:" + parte.cod + 
                " nome:" + parte.nome +
                " quantidade:" + quantidade +
                " valor unitario:" + parte.valor +
                " valor:" + calculaValor();
    }
}
