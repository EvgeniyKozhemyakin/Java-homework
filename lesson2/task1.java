// Определите индексы первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 28


package lesson2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String n = scanner.next();
        System.out.print(text.indexOf(n) + ", ");
        System.out.print(text.lastIndexOf(n));
        scanner.close();        
    }
}
