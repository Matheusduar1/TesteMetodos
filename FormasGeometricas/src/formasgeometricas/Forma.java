package formasgeometricas;

public abstract class Forma {

    
    protected String nome;
    
    public Forma(String nome){
        this.nome = nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void exibirInfo(){
        System.out.println("Forma: " + this.nome);
    }

    public String getNome() {
        return nome;
    }


}
