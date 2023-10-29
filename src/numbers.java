import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите натуральное число N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(inputString);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(inputString);
            }
        }
    }
}
