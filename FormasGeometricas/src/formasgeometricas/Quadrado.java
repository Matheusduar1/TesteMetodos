
package formasgeometricas;

public class Quadrado extends Forma {
    private double lado;
    
    public Quadrado(double lado){
        super("Quadrado");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}
