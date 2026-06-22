package formasgeometricas;

public class Main {

    public static void main(String[] args) {
        Forma[] formasGeometricas = new Forma[3];
        formasGeometricas[0] = new Circulo(12.0);
        formasGeometricas[1] = new Retangulo(8.0, 5.0);
        formasGeometricas[2] = new Quadrado(4.0);
        
        for (Forma forma : formasGeometricas){
            forma.exibirInfo();
            
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("");
        }
        
    }
    
}
