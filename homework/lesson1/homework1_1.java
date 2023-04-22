package homework.lesson1;

// Вывести все простые числа от 1 до 1000
public class homework1_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isNatural(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNatural(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
