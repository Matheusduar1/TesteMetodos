package arraylist;

import java.util.LinkedList;

public class LinkedLista {

    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>();
        frutas.add("Goiabinha");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.addFirst("Morango");
        frutas.addLast("Maçã");
        frutas.add(2,"Caju");
        System.out.println("Frutas -> " + frutas);
        System.out.println("Posição 2º -> " + frutas.get(1));
        
    }
}
