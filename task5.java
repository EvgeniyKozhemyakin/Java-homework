import java.util.Scanner; 
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String[] ip_out = ip.split("\\.");
        boolean flag = true;
        if (ip.length() > 15) {
            flag = false;
        }
        if (ip_out.length != 4) {
            flag = false;
        }
        for (String numb: ip_out) {
            if ((Integer.parseInt(numb) < 0) || (Integer.parseInt(numb) > 255))
                flag = false;
        }
        if (!flag)
            System.out.print("NO");
        else
            System.out.print("YES");

    }
}
