package armazem;
import java.util.Scanner;

public class Armazem02 {

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
        int estoqueGeral = 0;
        int maior = -1;
        int menor = 9999999;
        int pratMaior = 0;
        int secaoMaior = 0;
        int secaoMenor = 0;
        int pratMenor = 0;
        int soma = 0;
        for (int i = 0; i < estoque.length; i++){
            
            for (int j = 0; j < estoque[i].length; j++){
                soma += estoque[i][j];
                if(estoque[i][j] > maior){
                    maior = estoque[i][j];
                    secaoMaior = i;
                    pratMaior = j;
                }
                if(estoque[i][j] < menor){
                    menor = estoque[i][j];
                    secaoMenor = i;
                    pratMenor = j;
                }
            }
            int total = (int)estoque[i].length;
            System.out.println("Estoque da Seção " + (i+1) + ": " + soma);
            estoqueGeral += total;
        }
        System.out.println("Total de produtos do Armazém: " + estoqueGeral);
        System.out.println("Prateleira com mais produtos: Prateleira " + (pratMaior+1) + " da Seção " + (secaoMaior+1) + " com " + maior + " produtos.");
        System.out.println("Prateleira com menos produtos: Prateleira " + (pratMenor+1) + " da Seção " + (secaoMenor+1) + " com " + menor + " produto(os).");
        

           
      


    }
    
}