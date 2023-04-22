package homework.lesson1;
import java.util.Scanner;

// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить
public class homework2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            Calculate(num1, num2, operation);
           
        }
    }

    public static void Calculate(double numb1, double numb2, char mathematicalOperation) {
        double result = 0.0;
        switch (mathematicalOperation) {
            case '+':
                result = numb1 + numb2;
                break;
            case '-':
                result = numb1 - numb2;
                break;
            case '*':
                result = numb1 * numb2;
                break;
            case '/':
                if (numb2 == 0) {
                    System.out.println("Деление на 0 невозможно!");
                    return;
                }
                result = numb1 / numb2;
                break;
            default:
                System.out.println("Неверный оператор!");
        }
        System.out.println("Результат = " + result);
    }
}