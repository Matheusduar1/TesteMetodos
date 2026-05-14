package exerciciometodos;

public class Funcionario {
    //Atribuições
    String nome;
    double salario;
    //Métodos
    void aumento (double valor){
        this.salario += valor;
    }
    void consulta (){
        System.out.println("Nome: " + this.nome + " " + "Salário: " + " " + this.salario);
    }
}

