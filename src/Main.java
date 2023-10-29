import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество раз в неделю: ");
        int timesPerWeek = scanner.nextInt();

        System.out.print("Введите количество литров жидкости за каждый раз: ");
        int litersPerTime = scanner.nextInt();

        if (timesPerWeek <= 0 || litersPerTime <= 0) {
            System.out.println("Введены некорректные данные");
        } else {
            int totalLiters = timesPerWeek * litersPerTime * 16;

            System.out.println("Суммарное количество литров за каждую неделю:");

            for (int week = 1; week <= 16; week++) {
                int weeklyTotal = timesPerWeek * litersPerTime * week;
                System.out.println("К " + week + " неделе будет выпито  " + weeklyTotal + " литров жидкости");
            }

            if (totalLiters >= 120) {
                System.out.println("Студент принят в IT-клуб!");
            } else {
                System.out.println("К сожалению, студент не принят в клуб");
            }
        }
    }
}
