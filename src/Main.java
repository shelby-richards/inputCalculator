import java.util.Scanner;

public class Main {
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        double sum = 0;
        int count = 0;
        double avg = 0;
        do {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                go = false;
            }
        } while (go);
        if (sum != 0) {
            avg = sum / count;
        }
        int newAvg = (int) Math.round(avg);
        int newSum = (int) Math.round(sum);
        System.out.println("SUM = " + newSum + " AVG = " + newAvg);
    }
}