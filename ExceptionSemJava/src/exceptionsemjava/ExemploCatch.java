package exceptionsemjava;

public class ExemploCatch {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int [] numero = {1,2,3};
        try{
            int resultado = a/b;
            System.out.println("Resultado " + resultado);
            System.out.println(numero[4]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
