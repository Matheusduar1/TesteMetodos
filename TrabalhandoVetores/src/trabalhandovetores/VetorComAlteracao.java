package trabalhandovetores;

public class VetorComAlteracao {
    
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};
        
        System.out.println("Vetor Original");
        for (int num: numeros){
            System.out.println("Elementos: " + num);
        }
        
        numeros[1] = 25;
        System.out.println("Vetor Alterado");
        for(int num: numeros){
            System.out.println("Elementos: " + num);
        }
    }
    
}
