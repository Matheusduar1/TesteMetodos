package armazem;
import java.util.Scanner;

public class Armazem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] estoque = new int[3][4];

        int maior = -1;
        int menor = 9999999;
        int secaoMaior = 0;
        int pratMaior = 0;
        int secaoMenor = 0;
        int pratMenor = 0;
        
        for (int i = 0; i < estoque.length; i++){
            System.out.println("\nSeção " + (i+1));
            for (int j = 0; j < estoque[i].length; j++){
                System.out.print("Prateleira " + (j+1) + ": ");
                estoque[i][j] = sc.nextInt();
                

                if (estoque[i][j] > maior) {
                maior = estoque[i][j];
                secaoMaior = i;
                pratMaior = j;
                }
                if (estoque[i][j] < menor) {
                    menor = estoque[i][j];

                }
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        
        int estoqueGeral = 0; 
        
        for (int i = 0; i < estoque.length; i++){
            int soma = 0;
            for (int j = 0; j < estoque[i].length; j++){
                soma += estoque[i][j];
            }
            int total = soma;
            System.out.println("Estoque da Seção " + (i+1) + ": " + total);
            estoqueGeral += total;
        }

        System.out.println("\nTotal de produtos do Armazém: " + estoqueGeral);

        System.out.println("Prateleira com mais produtos: Prateleira " + (pratMaior+1) + " da Seção " + (secaoMaior+1) + " (" + maior + " produtos)");
        System.out.println("Prateleira com menos produtos: Prateleira " + (pratMenor+1) + " da Seção " + (secaoMenor+1) + " (" + menor + " produtos)");
    }
}