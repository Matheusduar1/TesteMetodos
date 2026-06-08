package exceptionsemjava;

public class TryCatchExemplo {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        
        try {
            int resultado = a/b;
            System.out.println("Resultado " + resultado);
        }catch (ArithmeticException e)  {
            System.out.println("Erro: não é possível dividir por 0.");
        }
        System.out.println("Vida normal do programa.");   
    }   
}
