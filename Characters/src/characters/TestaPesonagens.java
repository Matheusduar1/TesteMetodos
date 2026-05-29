package characters;

public class TestaPesonagens {

    public static void main(String[] args) {
        Personagens p1 = new Personagens();
        Personagens p2 = new Personagens();
        Personagens p3 = new Personagens();
        
        p1.setNome("Cleiton, O Guerreiro");
        p1.setClasse("Guerreiro");
        p1.setAtaque("Corte");
        p1.setPoder("Corte X");
        p1.setTipo("Dano Físico");
        p1.setDano(50);
        p1.setMagia(10);
        p1.setVida(120);
        
        p2.setNome("Clint, O Arqueiro");
        p2.setClasse("Arqueiro");
        p2.setAtaque("Flechada");
        p2.setPoder("Flecha de fogo");
        p2.setTipo("Dano Físico e Mágico");
        p2.setDano(30);
        p2.setMagia(30);
        p2.setVida(70);
        
        p3.setNome("Storm, O Mago");
        p3.setClasse("Mago");
        p3.setAtaque("Esfera de poder");
        p3.setPoder("MEGAAAA BLAST!");
        p3.setTipo("Dano Mágico");
        p3.setDano(10);
        p3.setMagia(80);
        p3.setVida(100);
        
        System.out.println("Teste de dados: ");
        System.out.println("====================");
        p1.dadosPersonagem();
        System.out.println("====================");
        p2.statusPersonagem();
        System.out.println("====================");
        p3.statusGeral();
    }
    
}
