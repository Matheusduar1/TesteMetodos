package orientacaoaobjetos;

public class TestaAgencia {

    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        a1.numero = 1234;
        
        Agencia a2 = new Agencia();
        a2.numero = 1245;
        
        System.out.println("Agências...");
        System.out.println("---");
        System.out.println("Agência a1: " + a1.numero);
        System.out.println("---");
        System.out.println("Agência a2: " + a2.numero);
    }
    
}
