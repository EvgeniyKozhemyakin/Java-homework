// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Перейти по ссылке, реализовать формулу на Java.

// Вывести все простые числа от 1 до 1000

// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить

package lesson1Hw;

public class task1 {
    public static void main(String[] args) {
        int n = 7; 
        int triangleNumber = getTriangleNumber(n);
        int factorial = getFactorial(n);
        System.out.println("n-ое треугольное число: " + triangleNumber);
        System.out.println("Факториал числа n: " + factorial);
    }

    public static int getTriangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
