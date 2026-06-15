package formasgeometricas;

abstract class Forma {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    protected String nome;
    
    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirInfo(){
        System.out.println("Forma: " + this.nome);
    }

    public String getNome() {
        return nome;
    }


}
