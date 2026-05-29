package armazem;
import java.util.Scanner;

public class Armazem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] estoque = new int[3][4];
        
        for (int i = 0; i < estoque.length;i++){
            System.out.println("Seção " + (i+1));
            
            for (int j = 0; j < estoque[i].length;j++){
                System.out.print("Prateleira " + (j+1) + ": ");
                estoque[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 0; i < estoque.length; i++){
            int soma = 0;
            for (int j = 0; j < estoque[i].length; j++){
                soma += estoque[i][j];
            }
            int total = (int)estoque[i].length;
            System.out.println("Estoque da Seção " + (i+1) + ": " + total);
        }
        for (int i = 0; i < estoque.length; i++){
            int soma = 0;
            for (int j = 0; j < estoque[i].length; j++){
                soma += estoque[i][j];
        }
        int estoqueGeral = (int)estoque[i][j].length;
        
        
        System.out.println("Total de produtos do Armazém: " + estoqueGeral);
    }
    
}
