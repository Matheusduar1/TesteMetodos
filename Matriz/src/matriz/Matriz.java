package matriz;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz =
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Elemento da linha 1, coluna 2: " + matriz[0][1]);
        System.out.println("Elemento da linha 3, coluna 1: " + matriz[2][0]);
        for (int i = 0;i < matriz.length; i++){
            for(int j = 0;j < matriz[i].length;j++){
                System.out.println(matriz[i][j] + " ");
            }
        }
        int[][] matriz2 = new int [3][3];
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;
        matriz2[2][0] = 7;
        matriz2[2][1] = 8;
        matriz2[2][2] = 9;
        
        System.out.println("\nElemento da linha 1, coluna 2: " + matriz2[0][1]);
        System.out.println("Elemento da linha 3, coluna 1: " + matriz2[2][0]);
        
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length;j++){
                System.out.println(matriz2[i][j] + " ");
            }
        }
        /*
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;
        matriz2[2][0] = 7;
        matriz2[2][1] = 8;
        matriz2[2][2] = 9;
        
        Teste Soma
        */
        System.out.println("\nTeste Soma");
        System.out.println("");
        int soma = 0;
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length;j++){
                soma += matriz2[i][j];
            }
            System.out.println("Soma Atual da " + (i+1) + " linha " + soma);
            soma = 0;
        }
        System.out.println("\nTeste Subtração");
        System.out.println("");
        int sub = 0;
        for (int i = 0; i < 1; i++){
            for(int j = 0; j < matriz2[i].length;j++){
                sub -= matriz2[i][j];
            }
            System.out.println("Sub Atual da " + (i+1) + " linha " + sub);
            sub = 0;
        }
                
        int maior = matriz[0][0];
        for(int[] linha: matriz){
            for(int valor: linha){
                if(valor > maior){
                    maior = valor;
                }
            }
        }
        System.out.println("\nMaior elemento: " + maior);
        
        int menor = matriz[0][0];
        for(int[] linha: matriz){
            for(int valor: linha){
                if(valor < menor){
                    menor = valor;
                }
            }
        }
        System.out.println("\nMenor elemento: " + menor);
    }
}
