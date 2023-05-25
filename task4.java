import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String alpha = scanner.nextLine().toLowerCase();
        int count = 0;
        char[] text_out = text.toCharArray();
        for (char symbol : text_out) {
            if (symbol == alpha.charAt(0))
                count++;
        }
        System.out.println(count);

    }

}
