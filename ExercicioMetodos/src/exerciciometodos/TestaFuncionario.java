package exerciciometodos;

public class TestaFuncionario {

    public static void main(String[] args) {
        //Criando objeto da classe funcionário
        Funcionario f1 = new Funcionario();
        //Atribuindo Funcionário 1
        f1.nome = "Matheus Duarte";
        f1.salario = 2100.00;
        //Atribuindo Funcionário 1
        Funcionario f2 = new Funcionario();
        f2.nome = "Lucas Narezzi";
        f2.salario = 5000.00;
        //Resultado das atribuições
        System.out.println("-Funcionários-");
        System.out.println("O nome do Funcionário 1 é " + f1.nome);
        System.out.println("O salário do Funcionário 1 é R$" + f1.salario);
        System.out.println("---");
        System.out.println("O nome do Funcionário 2 é " + f2.nome);
        System.out.println("O salário do Funcionário 2 é R$" + f2.salario);
        System.out.println("---");
        double valorAumento = (1000);
        f1.aumento(valorAumento);
        System.out.println("O Funcionário " + f1.nome + " recebeu um aumento de R$" + valorAumento);
        System.out.println("Salário atual do " + f1.nome + " é de R$" + f1.salario);
        System.out.println("---");
        System.out.println("-Dados do Funcionário 1: ");
        f1.consulta();
    }
    
}
