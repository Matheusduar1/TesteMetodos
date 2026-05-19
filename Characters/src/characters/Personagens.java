package characters;

public class Personagens extends Classes{
    private String nome;
    private int vida;
    private int dano;
    private int magia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void dadosPersonagem(){
        System.out.println("Dados do Personagem:");
        System.out.println("Nome: " + this.nome);
        System.out.println("");
        System.out.println("Classe: " + super.getClasse());
        System.out.println("Ataque: " + super.getAtaque());
        System.out.println("Poder: " + super.getPoder());
        System.out.println("Tipo: " + super.getTipo());
        System.out.println("---");
        
    }
    public void statusPersonagem(){
        System.out.println("Status do Personagem: " + this.nome);
        System.out.println("");
        System.out.println("Dano: " + this.dano);
        System.out.println("Magia: " + this.magia);
        System.out.println("Vida: " + this.vida);
        System.out.println("---");
    }
    public void statusGeral(){
        System.out.println("Dados Gerais do Personagem: " + this.nome);
        System.out.println("");
        this.dadosPersonagem();
        System.out.println("");
        this.statusPersonagem();
    }
    
}
