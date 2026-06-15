package formasgeometricas;

public class Main {

    public static void main(String[] args) {
        Forma[] formasGeometricas = new Forma[3];
        formasGeometricas[0] = new Circulo(5.0);
        formasGeometricas[1] = new Retangulo(4.0, 6.0);
        formasGeometricas[2] = new Quadrado(3.0);
        
        for (Forma forma : formasGeometricas){
            forma.exibirInfo();
            
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
        }
        
    }
    
}
