package trabalhandovetores;

import java.util.Arrays;

public class VetorAdd {

    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};
        System.out.println("Antes de tudo: " + Arrays.toString(numeros));
        //
        int[] novoVetor = new int [numeros.length + 1];
        for(int i = 0, j = 0; i < novoVetor.length; i++){
            if (i == 2){
                novoVetor[i] = 25;
            }else{
                novoVetor[i] = numeros[j];
            }
        }
        System.out.println("Depois da Alteração: " + Arrays.toString(numeros));
        
        //
        int[] vetorRemovido = new int [novoVetor.length -1];
        for (int i = 0, j = 0;i< novoVetor.length; i++){
                if(i != 3){
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }

    }
    
}
