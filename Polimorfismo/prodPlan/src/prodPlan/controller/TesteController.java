package prodPlan.controller;//pacote que pertence do prodPlan.controller

import prodPlan.model.Item;
import prodPlan.model.Motor;
import prodPlan.model.Parafuso;
import prodPlan.model.Parte;
import prodPlan.view.ConsoleView;

//o meu TESTE fiz como se fosse o meu controller
//ele tem um método executar() que é o metodo principal do controller,
//ou seja, ele vai ser o responsável por criar as partes e os itens, e
//chamar os meu metodos da view para mostrar as informações das partes e dos itens no console
public class TesteController {

    //esse meu metodo recebe um array de partes, e cria um array de itens utilizando essas partes,
    //ou seja, ele é responsável por criar os itens utilizando as partes criadas, e retornar esse array de itens
    //ela são instancias que eu crio utilizando as partes criadas, e a quantidade solicitada de cada parte para cada item
    static Item[] criaItens(Parte[] partes) {

        //essas são instancias do itens
        //com seus atribulos e os valores definidos diretamente na memoria
        //ou seja, cada item tem uma parte (que pode ser um Motor ou um Parafuso) e a
        //quantidade solicitada dessa parte
        Item[] itens = {
                new Item(partes[0], 10),
                new Item(partes[5], 50),
                new Item(partes[7], 30),
                new Item(partes[2], 5)
        };
        //ela vai retornar os itens criados utilizando as partes criadas,
        //e a quantidade solicitada de cada parte para cada item
        return itens;
    }

    //aqui ele vai criar um array de partes, ou seja, ele é responsável por criar as partes utilizadas na produção,
    //ou seja, ele é responsável por criar as partes que serão utilizadas para criar os itens
    //ele é responsável por criar as partes que serão utilizadas para criar os itens, e retornar esse array de partes
    static Parte[] criaPartes() {
        //essas são instancias do partes
        //com seus atribulos e os valores definidos diretamente na memoria
        //ou seja, cada parte tem seus atributos definidos diretamente na memoria,
        //como cod, nome e descricao, valor, e os atributos específicos de cada parte,
        //como potencia, corrente e rpm para os motores, e comprimento e diametro para os parafusos
        Parte[] partes = {
                new Motor(112, "motor m112", "motor de avanco do cabecote", 100.0f, 1.2f, 1.1f, 1250),
                new Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250),
                new Motor(111, "motor m111", "motor de ventilador", 70.0f, 1.0f, 1.0f, 3000),
                new Motor(110, "motor m110", "motor principal", 120.0f, 1.8f, 1.5f, 1250),
                new Parafuso(231, "parafuso p1", "parafuso de fixacao do cabecote", 2.5f, 100.0f, 8.0f),
                new Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.0f, 6.0f),
                new Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2.0f, 60.0f, 6.0f),
                new Parafuso(234, "parafuso p4", "parafuso de uso geral", 3.0f, 120.0f, 12.0f)
        };
        //aqu vai retornar as partes criadas, ou seja, ele é responsável por criar as partes
        //que serão utilizadas para criar os itens, e retornar esse array de partes
        return partes;
    }

    //aqui eu criei o método executar(), que é o método principal do controller,
    //ou seja, ele é responsável por criar as partes e os itens, e chamar os meu metodos da view
    //para mostrar as informações das partes e dos itens no console
    public static void executar() {
        //aqui ele vai criar as partes e os itens, ou seja, ele é responsável por criar as partes e os itens,
        //e chamar os meu metodos da view para mostrar as informações das partes e dos itens
        Parte[] partes = criaPartes();

        //aqui ele vai criar os itens utilizando as partes criadas, ou seja, ele é responsável por
        //criar os itens utilizando as partes criadas, e a quantidade solicitada de cada parte para cada item, 
        //e retornar esse array de itens
        Item[] itens = criaItens(partes);

        //esswe aqui ele vai chamar os meus metodos da view para mostrar as informações das
        //partes e dos itens no console, ou seja, ele é responsável por chamar os meus metodos
        //da view para mostrar as informações das partes e dos itens no console, juntamente com o valor total dos itens
        System.out.println();
        ConsoleView.listaPartes("*** Partes utilizadas na producao ***", partes);
        System.out.println();
        ConsoleView.listaItens("*** Itens solicitados ***", itens);
    }

}
