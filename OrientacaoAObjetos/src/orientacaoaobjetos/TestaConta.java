package orientacaoaobjetos;
//numero saldo e limite
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.numero = 12;
        c1.limite = 1000.00;
        c1.saldo = 500.00;
        
        Conta c2 = new Conta();
        
        c2.numero = 13;
        c2.limite = 1500.00;
        c2.saldo = 10.00;
        
        System.out.println("Contas: ");
        System.out.println("---");
        System.out.println("Número da Conta 01: " + c1.numero);
        System.out.println("Limite da Conta 01: " + c1.limite);
        System.out.println("Saldo da Conta 01: " + c1.saldo);
        System.out.println("---");
        System.out.println("Número da Conta 02: " + c2.numero);
        System.out.println("Limite da Conta 02: " + c2.limite);
        System.out.println("Saldo da Conta 02: " + c2.saldo);
        System.out.println("---");
        c1.deposita(0.99);
        System.out.println("Saldo Atualizado 1: " + c1.saldo);
        c2.saque(0.99);
        System.out.println("Saldo Atualizado 2: " + c2.saldo);
        System.out.println("saldo disponível: " + c1.consultaSaldoDisponivel());
    }
    
}
