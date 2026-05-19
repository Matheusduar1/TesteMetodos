package heranca2;


public class TestaFuncionario {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        //get Funcionario
        g.setNome("Oliundinho Pimpolho");
        g.setSalario(35600);
        //Gerente
        g.setUsuario("Oliundinho Pimpolho");
        g.setSenha("Senac123");
        g.setCargo("Gerente");
        //---
        Telefonista t = new Telefonista();
        //Funcionario
        t.setNome("Siscrênia Kiulonda");
        t.setSalario(8000);
        //Telefonista
        t.setEstacaoDeTrabalho(12);
        t.setCargo("Telefonista");
        Secretaria s = new Secretaria();
        //Funcionario
        s.setNome("Aristênia Limonada");
        s.setSalario(6500);
        //Secretaria
        s.setRamal(6687);
        s.setCargo("Secretária");
        /*
        System.out.println("Nome do gerente: " + g.getNome());
        System.out.println("Salário do gerente: " + g.getSalario());
        System.out.println("Usuário do gerente: " + g.getUsuario());
        System.out.println("Senha do gerente: " + g.getSenha());
        System.out.println("Bonificação: " + g.calculaBonificacao());
        System.out.println("");
        System.out.println("Nome da telefonista: " + t.getNome());
        System.out.println("Salário da Telefonista: " + t.getSalario());
        System.out.println("Estação de trabalho da telefonista: " + t.getEstacaoDeTrabalho());
        System.out.println("Bonificação: " + t.calculaBonificacao());
        System.out.println("");
        System.out.println("Nome da secretária: " + s.getNome());
        System.out.println("Salário da secretáia: " + s.getSalario());
        System.out.println("Ramal da secretária: " + s.getRamal());
        System.out.println("Bonificação: " + s.calculaBonificacao());
        */
        
        g.mostraDados();
        System.out.println("");
        t.mostraDados();
        System.out.println("");
        s.mostraDados();
    
    }
    
}
