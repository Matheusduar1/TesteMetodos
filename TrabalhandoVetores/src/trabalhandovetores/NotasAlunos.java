package trabalhandovetores;
import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[3][4];
        
        for (int i = 0; i < notas.length;i++){
            System.out.println("Aluno " + (i+1));
            
            for (int j = 0; j < notas[i].length;j++){
                System.out.print("Nota " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 0; i < notas.length; i++){
            int soma = 0;
            for (int j = 0; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            double media = (double)soma/notas[i].length;
            System.out.println("Média do aluno " + (i+1) + ": " + media);
        }
    }
    
}
