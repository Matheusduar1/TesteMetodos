package heranca2;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public double calculaBonificacao(){
        return this.salario * 0.1;
    }
    
    public void mostraDados() {
        System.out.println("Nome do(a) " + this.getCargo() + " " + this.getNome());
        System.out.println("Salário do(a) " + this.getCargo()+ " " + this.getSalario());
        System.out.println("Bonificação: " + calculaBonificacao());
    }
    
}
