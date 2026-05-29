package trabalhandovetores;

import java.util.Arrays;

public class TesteVetores {

    public static void main(String[] args) {

        int[] numeros = {10,20,30,40,50,60,70,80,90,100};
        
        System.out.println("1. Vetor com 10 números inteiros: " + Arrays.toString(numeros));
        System.out.println("");
        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int num : numeros){
            soma += num;
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
            
        }
        double media = (double) soma / numeros.length;
        System.out.println("2. Teste de Soma, Média, Menor e Maior");
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("");
        
        int[]novoVetor = new int[numeros.length + 2];
        for (int i = 0, j = 0; i < novoVetor.length; i++){
            if (i == 3){
                novoVetor[i] = 17;
            }else if (i == 4){
                novoVetor[i] = 36;
            }else{
                novoVetor[i] = numeros[j];
                j++;
            }
            
        }
        System.out.println("3. Após inserção: " + Arrays.toString(novoVetor));
        System.out.println("");
        
        int[]vetorRemovido = new int[novoVetor.length - 1];
        for (int i = 0, j = 0; i < novoVetor.length; i++){
            if (i != 11){
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }
        System.out.println("4. Após remoção: " + Arrays.toString(vetorRemovido));
        
        
    }
    
}
