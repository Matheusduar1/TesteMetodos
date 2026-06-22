package formasgeometricas;

public class Retangulo extends Forma{
    private double altura;
    private double largura;
    
    public Retangulo(double largura, double altura){
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }
    
}
