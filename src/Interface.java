import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Interface {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r1 = 0, r2 = 0;
        String op1 = null;

        boolean num1Valido = false, num2Valido = false, opValido = false;
        boolean opera = false;

        while (!num1Valido) {

            try {
                System.out.println("Digite o primeiro número:");
                r1 = input.nextDouble();
                num1Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você não digitou um número válido.");
                input.nextLine();
            }
        }

        while (!num2Valido) {
            try {
                System.out.println("Digite o segundo número:");
                r2 = input.nextDouble();
                num2Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você não digitou um número válido.");
                input.nextLine();
            }
        }
        while (!opValido) {
            try {
                System.out.println("operador:");
                op1 = input.next();
                opValido = true;
            } catch (InputMismatchException e) {
                System.out.println("você não digitou um operador matemático.");
            }

            while (!opera) {
                if (Objects.equals(op1, "+")) {
                    Operadores.soma(r1 , r2);
                    opera = true;
                } else if (Objects.equals(op1, "-")) {
                    Operadores.subtracao(r1 , r2);
                    opera = true;
                } else if (Objects.equals(op1, "*")) {
                    Operadores.multiplicacao(r1, r2);
                    opera = true;
                } else if (Objects.equals(op1, "/")) {
                    Operadores.divisao(r1, r2);
                    opera = true;
                } else {
                    System.out.println("digite um dos simbolos: + , - , * , /!");
                    op1 = input.next();
                }

            }
        }
    }
}