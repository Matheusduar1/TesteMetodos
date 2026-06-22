package interfaces;

public class Moto implements Veiculo{
    private String marca;
    private int cilindrada;
    private double velocidade;
    

    public Moto(String marca, int cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.velocidade = 0;
    }
    
    @Override
    public void acelerar() {
        this.velocidade += 15; 
        System.out.println("Moto acelerou.");
    }
    
    @Override
    public void frear() {

        if (this.velocidade > 0) {
            this.velocidade -= 15; 
            System.out.println("Moto freou.");
        } else {
            System.out.println("A moto já está parada.");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto " + this.marca + " Cilindrada: " + this.cilindrada + "cc");
        System.out.println("Velocidade Atual: " + this.velocidade + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
}
