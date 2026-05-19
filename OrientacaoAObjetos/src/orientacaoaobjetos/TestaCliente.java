
package orientacaoaobjetos;

public class TestaCliente {

    public static void main(String[] args) {
        //Criando objeto c1 do tipo Cliente
        Cliente c1 = new Cliente();
        //Fazendo a atribuição de valores
        c1.codigo = 12;
        c1.nome = "Geraldo Luis";
        //Criando objeto c2 do tipo Cliente
        Cliente c2 = new Cliente();
        //Fazendo a atribuição de valores c2
        c2.codigo = 13;
        c2.nome = "Jabiscreudo Horse";
        
        //Mostrar os dados
        System.out.println("Nome: " + c1.nome);
        System.out.println("Codigo: " + c1.codigo);
        
        //Mostrar os dados
        System.out.println("Nome: " + c2.nome);
        System.out.println("Codigo: " + c2.codigo);
    }
    
}
