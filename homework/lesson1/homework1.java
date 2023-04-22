package homework.lesson1;
import java.util.Scanner;

// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class homework1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n:");
            int n = scanner.nextInt();
            int triangleNumb = TriangularNumber(n);
            int factorialNumb = Factorial(n);
            System.out.println("n-ое треугольное число = " + triangleNumb);
            System.out.println("факториал числа n = " + factorialNumb);
        }
    }

    public static int TriangularNumber(int n) {
        return n * (n - 1) / 2;
    }

    public static int Factorial(int n) {
        if (n == 0)
            return 1;
        return n * Factorial(n - 1);
    }
}
