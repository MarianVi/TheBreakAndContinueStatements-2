import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int leftEnd = scanner.nextInt();
        int rightEnd = scanner.nextInt();
        int cnt = 0;

        while (leftEnd <= rightEnd) {
            if (cnt > 4) {
                break;
            }
            if (leftEnd % 2 == 1) {
                System.out.println(leftEnd);
                cnt++;
            }
            leftEnd++;
        }
    }
}