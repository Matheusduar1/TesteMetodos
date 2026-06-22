package interfaces;

public class TesteVeiculo {
    
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("Chevrolet", "Zafira");
        veiculos[1] = new Moto("Kawazaki Ninja", 998);
        veiculos[2] = new Bicicleta("Cometa", "BMX");
        

        for (Veiculo v : veiculos) {
            System.out.println("-------------------------");
            v.exibirInfo();
            System.out.println("");
            v.acelerar();
            System.out.println("");
            v.exibirInfo();
            System.out.println("");
            v.frear();
            System.out.println("");
            v.exibirInfo();
            System.out.println("");
            v.frear();
            }
    }
    
}
