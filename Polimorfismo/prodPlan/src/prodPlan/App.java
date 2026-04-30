package prodPlan;

import prodPlan.controller.TesteController;

//esse meu app vai a classe principal
//ele tem o método main() que é o ponto de entrada do programa, ou seja, ele é responsável 
//por iniciar a execução do programa
public class App {

    //aqui meu main
    public static void main(String[] args) {

        //O App apenas dispara a execução
        //chama meu Teste. que dai faz tudo, ou seja, ele é responsável 
        //por chamar o método executar() do TesteController,
        TesteController.executar();
    }
}
