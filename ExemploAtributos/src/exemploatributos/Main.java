package exemploatributos;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        System.out.println(p1.especie);
        System.out.println(p2.especie);
        
        p1.especie = "Mutante";
        System.out.println(p2.especie);
        
        
    }
    
}
