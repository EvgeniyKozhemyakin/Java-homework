import java.util.Scanner; 

public class task3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String masha = scanner.nextLine();
            String oleg = scanner.nextLine();
            String words = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
            String [] words_out = words.split(" ");
            int count1 = 0, count2 = 0;
            for(String word: words_out)
            {
                if (word.contains(masha)) count1++;
                if (word.contains(oleg)) count2++;
            }
            System.out.print(count1+ ", " +count2);
        }
    }
}
