public class Operadores {
    public static void soma( double num1,double num2){
        double resultado = num1 + num2;
        System.out.println("o resultado:\n"+resultado);

    }

    public static void subtracao(double num1,double num2){
        double resultado = num1 - num2;
        System.out.println("o resultado:\n"+resultado);
    }
    public static void multiplicacao(double num1,double num2){
        double resultado = num1 * num2;
        System.out.println("o resultado:\n"+resultado);
    }
    public static void divisao(double num1,double num2){
        double resultado = num1 / num2;
        System.out.println("o resultado:\n"+resultado);
    }
    public static void potencia(double num1,double num2){
        double resultado = Math.pow(num1 , num2);
        System.out.println(" o número " + num1 + "elevado a "+ num2 + "é" + resultado);

    }
    public static void raiz(double num1, double num2){
        double resultado;
        if (num2 == 2){
            resultado = Math.sqrt(num1);
            System.out.println("a raiz quadrada de "+ num1 + " é "+ resultado);
        }
        if (num2 == 3){
            resultado = Math.cbrt(num1);
            System.out.println("a raiz cúbica de "+ num1 + " é "+ resultado);
        }
    }

}
