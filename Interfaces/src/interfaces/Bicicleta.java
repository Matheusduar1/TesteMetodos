package interfaces;

public class Bicicleta implements Veiculo{
    private String marca;
    private String tipo;
    private double velocidade;
    
    public Bicicleta(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = 0;
    }
    
    @Override
    public void acelerar() {
        this.velocidade += 5; 
        System.out.println("Bicicleta acelerou.");
    }
    
    @Override
    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 5; 
            System.out.println("Bicicleta freou.");
        } else {
            System.out.println("A bicicleta já está parada.");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Bicicleta " + this.marca + " do Tipo " + this.tipo);
        System.out.println("Velocidade Atual: " + this.velocidade + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
}
