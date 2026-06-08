package arraylist;
import java.util.ArrayList;
public class AtividadeArrayList {

    public static void main(String[] args) {
        ArrayList<String> listaDeCompras = new ArrayList<>();
        
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Batata");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add("Camarão");
        listaDeCompras.add("Caramujo");
        
        System.out.println("Sua lista atual tem: " + listaDeCompras);
        listaDeCompras.addFirst("Caramelo");
        System.out.println("\nAdição do primeiro item(Caramelo): " + listaDeCompras);
        System.out.println("\no primeiro item para comprar é " + listaDeCompras.get(0));
        listaDeCompras.addLast("Sal");
        System.out.println("\nAdição de último item(Sal): " + listaDeCompras);
        System.out.println("\no último item para comprar é " + listaDeCompras.get(7));
        listaDeCompras.remove("Batata");
        System.out.println("\nRemoção de item(Batata) da lista: " + listaDeCompras);
        
        
        System.out.println("\nLista de Compras:");
        int i = 1;
        for(String item : listaDeCompras){
            System.out.println("Item " + (i++) + " " + item);
        }

        System.out.println("\nContém Batata? " + listaDeCompras.contains("Batata"));
        listaDeCompras.set(4, "Tomate");
        System.out.println("\nArrayList atualizado: " + listaDeCompras);
        System.out.println("\nTamanho da lista " + listaDeCompras.size());
        
    }
    
}
