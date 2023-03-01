/*
 * Реализовать простой калькулятор.
 */
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        Double a = iScanner.nextDouble();

        System.out.print("Введите арифметическое действие (+,-,*,/): ");
        int act = System.in.read();
        char activ = (char) act;

        System.out.print("Введите второе число: ");
        Double b = iScanner.nextDouble();

        iScanner.close();

        System.out.printf("\nРезультат %.1f %c %.1f = ", a, activ, b);

        switch (activ) {
            case '+':

                System.out.printf(" %.1f", a + b);
                break;
            case '-':
                System.out.printf(" %.1f", a - b);
                break;
            case '/':
                System.out.printf(" %.1f", a / b);
                break;
            case '*':
                System.out.printf(" %.1f", a * b);
                break;
        }
    }  
}
