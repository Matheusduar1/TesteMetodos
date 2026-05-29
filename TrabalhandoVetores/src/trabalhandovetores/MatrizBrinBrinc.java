package trabalhandovetores;

import java.util.Scanner;

public class MatrizBrinBrinc {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[3][4];
        
        for (int i = 0; i < notas.length;i++){
            System.out.println("Aluno " + (i+1));
            int soma = 0;
            for (int j = 0; j < notas[i].length;j++){
                System.out.print("Nota " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
                

                while(notas[i][j] < 0 || notas[i][j] > 10){
                System.out.println("\nTente novamente!");
                System.out.println("Nota " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
                }
                
                soma += notas[i][j];
            }
            double media = (double)soma/notas[i].length;
            System.out.println("Média do aluno " + (i+1) + ": " + media);
            if(media >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Rodou");
            }
        }
    }
    
}
