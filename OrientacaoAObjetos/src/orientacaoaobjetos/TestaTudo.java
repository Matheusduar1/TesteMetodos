package orientacaoaobjetos;

public class TestaTudo {

    public static void main(String[] args) {
        //Instância dos objetos
        Agencia         a = new Agencia();
        Cliente         c = new Cliente();
        Conta           co = new Conta();
        CartaoDeCredito cc = new CartaoDeCredito();
        
        //Atribuir dados
        
        //Agência
        a.numero = 4742;
        //Cliente
        c.codigo = 1234;
        c.nome = "Gyundinho Huilindio Zabubense";
        //Conta
        co.numero = 987;
        co.saldo = 6500.00;
        co.limite = 8000.00;
        //Cartão de Crédito
        cc.numero = 654;
        cc.dataDeValidade = "31/12/2030";
        //Mostrar os Resultados
        System.out.println("======================");
        System.out.println("= Agência: " + a.numero);
        System.out.println("---");
        System.out.println("= Dados do Cliente ==");
        System.out.println("== Número: " + c.codigo);
        System.out.println("== Nome: " + c.nome);
        System.out.println("---");
        System.out.println("= Dados da Conta ==");
        System.out.println("== Número: " + co.numero);
        System.out.println("== Saldo: R$" + co.saldo);
        System.out.println("== Limite: R$" + co.limite);
        System.out.println("---");
        System.out.println("= Dados Cartão de Crédito ==");
        System.out.println("== Número: " + cc.numero);
        System.out.println("== Data de Validade: " + cc.dataDeValidade);
        System.out.println("=======================");
    }
    
}
