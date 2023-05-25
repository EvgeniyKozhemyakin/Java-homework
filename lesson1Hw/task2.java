// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить

package lesson1Hw;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на 0 невозможно!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверный оператор!");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
