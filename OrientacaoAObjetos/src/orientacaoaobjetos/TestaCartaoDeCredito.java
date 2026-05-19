package orientacaoaobjetos;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        cdc1.numero = 123;
        cdc1.dataDeValidade = "03/05/2030";
        
        CartaoDeCredito cdc2 = new CartaoDeCredito();
        
        cdc2.numero = 144;
        cdc2.dataDeValidade = "20/08/2028";
        
        CartaoDeCredito cdc3 = new CartaoDeCredito();
        
        cdc3.numero = 156;
        cdc3.dataDeValidade = "21/06/2031";
        
        System.out.println("Cartões");
        System.out.println("---");
        System.out.println("Número do Cartão 1: " + cdc1.numero);
        System.out.println("Data de Validade 1: " + cdc1.dataDeValidade);
        System.out.println("---");
        System.out.println("Número do Cartão 2: " + cdc2.numero);
        System.out.println("Data de Validade 2: " + cdc2.dataDeValidade);
        System.out.println("---");
        System.out.println("Número do Cartão 3: " + cdc3.numero);
        System.out.println("Data de Validade 3: " + cdc3.dataDeValidade);
        
    }
    
}
