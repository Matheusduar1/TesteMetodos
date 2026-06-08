package arraylist;
import java.util.ArrayList;
public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        
        System.out.println("A fruteira tem: " + frutas);
        System.out.println("Segunda fruta é: " + frutas.get(1));
        
        System.out.println("Lista de frutas:");
        for(String fruta : frutas){
            System.out.println("A fruta da vez é " + fruta);
        }
        System.out.println("Posição da Banana " + frutas.indexOf("Banana"));
        
        frutas.remove("Banana");
        System.out.println("Após remoção o ArrayList será " + frutas);
        
        frutas.add(1,"Manga");
        System.out.println("ArrayList atualizado " + frutas);
        System.out.println("Tamanho da lista " + frutas.size());
        System.out.println("Contém tomate? " + frutas.contains("Tomate"));
        frutas.set(3, "Tomate");
        System.out.println("ArrayList atualizado: " + frutas);
        
    }
    
}
