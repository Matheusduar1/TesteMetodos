package orientacaoaobjetos;

public class TesteHeranca {

    public static void main(String[] args) {
        Servicos s = new Servicos("Seguro");
        System.out.println(s.getNomeServico());
        
        Servicos s1 = new Servicos();
        System.out.println(s1.getNomeServico());
        /*
        SeguroDeVeiculo sdv = new SeguroDeVeiculo();
        sdv.setCodigoServico(1);
        sdv.setNomeServico("Seguro de Veículo - Monza Club - 1994");
        sdv.setDataDeContratacao("18/05/2026");
        sdv.setFranquia(985.99);
        sdv.setValorSeguroDeVeiculo(2500.99);
        
        Emprestimo e = new Emprestimo();
        e.setCodigoServico(2);
        e.setNomeServico("Empréstimo - Marcos Costa");
        e.setDataDeContratacao("19/05/2026");
        e.setValor(25000);
        e.setTaxa(0.1);
        
        System.out.println(sdv.getCodigoServico());
        System.out.println(sdv.getNomeServico());
        System.out.println(sdv.getDataDeContratacao());
        System.out.println(sdv.getFranquia());
        System.out.println(sdv.getValorSeguroDeVeiculo());
        System.out.println(sdv.calculaTaxa());
        System.out.println("---");
        System.out.println(e.getCodigoServico());
        System.out.println(e.getDataDeContratacao());
        System.out.println(e.getNomeServico());
        System.out.println(e.getTaxa());
        System.out.println(e.getValor());
        System.out.println(e.calculaTaxa());
        
    */    
    }
    
}
