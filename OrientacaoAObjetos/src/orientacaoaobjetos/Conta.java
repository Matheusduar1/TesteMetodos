package orientacaoaobjetos;

public class Conta {
    //Atributos
    int numero;
    double saldo;
    double limite = 100;
    //Métodos
    void deposita(double valor){
        this.saldo += valor;
    }
    
    void saque(double valor){
        this.saldo -= valor;
    }
    
    double consultaSaldoDisponivel(){
        return this.saldo + this.limite;
    }
}