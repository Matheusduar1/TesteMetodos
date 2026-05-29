package trabalhandovetores;

public class MatrizTransposta {

    public static void main(String[] args) {
        int[][] matriz =
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0;i < matriz.length; i++){
            for(int j = 0;j < matriz[i].length;j++){
                System.out.println(matriz[i][j] + " ");
            }
        }
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int [][] transposta = new int[linhas][colunas];
        
        for (int i = 0;i < linhas; i++){
            for(int j = 0;j < colunas; j++){
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transposta:");
        for (int[] linha: transposta){
            for (int valor: linha){
                System.out.println(valor + " ");
            }
            System.out.println();
        }
    }
}
