package prodPlan.view;//pacote que pertence do prodPlan

import prodPlan.model.Item;
import prodPlan.model.Parte;

//essa classe tem métodos para mostrar as informações das partes e dos itens no console, 
//ou seja, ela é responsável por exibir as informações das partes e dos itens no console
public class ConsoleView {

    // esse meu metodo recebe um titulo e um array de partes, e mostra as
    // informações de cada parte no console
    public static void listaPartes(String titulo, Parte[] partes) {
        System.out.println(titulo);// vai mostrar o titulo no console

        //meu for percorre o array de partes e mostra as informações de cada parte no
        //console, ou seja, ele vai acessar cada elemento do array de partes pelo indice e chamar 
        //o método toString() de cada parte para mostrar as informações dessa parte no console
        for (int i = 0; i < partes.length; i++) {//ele começa em 0, vai até o tamanho do vetor
            System.out.println(partes[i].toString()); //esse acessa cada elemento pelo indice
        }
    }

    //esse meu metodo recebe um titulo e um array de itens, e mostra as
    //informações de cada item no console, juntamente com o valor total dos itens
    //ou seja, ele é responsável por exibir as informações de cada item no console, juntamente 
    //com o valor total dos itens
    public static void listaItens(String titulo, Item[] itens) {
        System.out.println(titulo);//vai mostrar o titulo no console

        //essa variavel foi feita para acumular o valor total dos itens, ou seja, 
        //ela vai somar o valor de cada item para mostrar o valor total dos itens no console
        //por isso ela começa com o valor 0, e a cada item ela vai somar o valor desse item para o total
        float total = 0;

        //meu for percorre o array de itens e mostra as informações de cada item no console, 
        //juntamente com o valor total dos itens, ou seja, ele vai acessar cada elemento do array 
        //de itens pelo indice e chamar
        for (int i = 0; i < itens.length; i++) {//percorre o vetor de itens
            System.out.println(itens[i].toString()); //e vai imprime cada item
            total += itens[i].calculaValor(); //esse vai acumula o valor total
        }
        System.out.println("Valor total:" + total);//depois do for ele vai mostrar o valor total dos itens no console

    }
}
