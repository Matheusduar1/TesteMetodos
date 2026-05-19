package encapsulamento;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Marcos Costa");
        f.setSalario(2000);
        
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário: " + f.getSalario());
    }
    
}
