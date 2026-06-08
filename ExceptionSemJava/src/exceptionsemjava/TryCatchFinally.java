package exceptionsemjava;

public class TryCatchFinally {

    public static void main(String[] args) {
        try{
            int resultado = 10/2;
            System.out.println("Resultado " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Divisão por zero! :(");
        }finally{
            System.out.println("Sempre passo aqui.");
        }
    }
    
}
