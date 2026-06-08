package exceptionsemjava;

public class MultiplosCatch {

    public static void main(String[] args) {
        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[2]);
            int resultado = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Erro de divisão por zero.");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Indice do Array fora do permitido.");
        }
    }
    
}
