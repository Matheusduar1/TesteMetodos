package interfaces;

public class Carro implements Veiculo{
    private String marca;
    private String modelo;
    private double velocidade;
    
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0; 
    }
    
    @Override
    public void acelerar() {
        this.velocidade += 10; 
        System.out.println("Carro acelerou.");
    }
    
    @Override
    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 10; 
            System.out.println("Carro freou.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro: " + this.marca + " " + this.modelo);
        System.out.println("Velocidade Atual: " + this.velocidade +" km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
}
