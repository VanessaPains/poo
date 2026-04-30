public class Teste {

    public static void main(String[] args) {

        //aqui estou CRIANDO objetos
        EmpregadoAssalariado emp1 = new EmpregadoAssalariado("John", "Smith", "111-11-111", 800);
        EmpregadoHorista emp2 = new EmpregadoHorista("Karen", "Price", "222-22-222", 16.75, 40);
        EmpregadoComissionado emp3 = new EmpregadoComissionado("Sue", "Jones", "333-33-333", 10000, 0.06);
        EmpregadoMisto emp4 = new EmpregadoMisto("Bob", "Lewis", "444-44-444", 10000, 0.06, 300);

        //SEM POLIMORFISMO
        System.out.println("");
        System.out.println("=== SEM POLIMORFISMO ===");
        System.out.println(emp1);
        System.out.println("Total: " + emp1.calculaPagamento());
        System.out.println("");
        
        System.out.println(emp2);
        System.out.println("Total: " + emp2.calculaPagamento());
        System.out.println("");

        System.out.println(emp3);
        System.out.println("Total: " + emp3.calculaPagamento());
        System.out.println("");

        System.out.println(emp4);
        System.out.println("Total: " + emp4.calculaPagamento());
        System.out.println("");

        //COM POLIMORFISMO
        System.out.println("");
        System.out.println("\n=== COM POLIMORFISMO ===");

        //aqui estou criando um array de empregados, que pode conter qualquer tipo de empregado, graças ao polimorfismo
        Empregado[] empregados = { emp1, emp2, emp3, emp4 };

        //aqui estou usando o POLIMORFISMO para tratar todos os empregados de forma uniforme
        for (Empregado emp : empregados) {

            System.out.println(emp);

            //aqui vou verifica se sao EmpregadoMisto
            if (emp instanceof EmpregadoMisto) {

                EmpregadoMisto e = (EmpregadoMisto) emp;

                //aqui vou aumentar o salario base do empregado misto em 10%
                double novoSalario = e.getSalarioBase() * 1.10;
                e.setSalarioBase(novoSalario);

                //aqui vou mostrar o novo salario base do empregado misto
                System.out.println("Novo salário com 10%: " + novoSalario);
            }

            System.out.println("Total: " + emp.calculaPagamento());
            System.out.println("");
        }
    }
}