package formasgeometricas;

public class Circulo extends Forma {

    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }

    private double raio;
    private double pi = 3.14159;

    
    @Override
    public double calcularArea(){
        double area = pi *raio * raio;
        return area;
    }
            ;
    @Override
    public double calcularPerimetro(){
        return 2 * pi* raio;
    }
}
