package orientacaoaobjetos;

public class TestaGerente {

    
    public static void main(String[] args) {
        Gerente g = new Gerente();
        
        g.nome = "Wistinuindo Joiscrândio Nepomuceno";
        g.salario = 45000;
        
        //Aumentar o Salário em 10%
        g.aumentaSalario();
        System.out.println("Salário com 10% de aumento: " + g.salario);
        
        g.aumentaSalario(0.15);
        System.out.println("Novo aumento 15%: " + g.salario);
        
        
        
        
        
        
        
        
        
        
    }
    
}
