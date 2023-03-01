/*
 * Вычислить n-ое треугольное число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n).
 */

import java.util.Scanner;

public class task1 {

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static int triangle(int n) {
        if (n == 1)
            return 1;
        return n + triangle(n - 1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n ");
        Integer n = iScanner.nextInt();
        iScanner.close();
        int result = 1;

        System.out.printf("Сумма чисел от 1 до %d = %d\n", n, triangle(n));
        result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        System.out.printf("Факториал числа %d = %d\n", n, result);

    }
}