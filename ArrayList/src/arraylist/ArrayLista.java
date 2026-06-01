package arraylist;
import java.util.ArrayList;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Goiabinha");
        frutas.add("Morango");
        
        System.out.println("ArrayList -> " + frutas);
        System.out.println("Posição -> " + frutas.get(1));
    }
    
}
