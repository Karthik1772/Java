import java.util.ArrayList;
import java.util.List;

public class NarcissisticNumbers {
    public static boolean isNarcissistic(int n) {
        int original = n, sum = 0, numDigits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }
        return sum == original;
    }

    public static List<Integer> findNarcissisticNumbers(int count) {
        List<Integer> found = new ArrayList<>();
        int num = 1;
        while (found.size() < count) {
            if (isNarcissistic(num)) {
                found.add(num);
            }
            num++;
        }
        return found;
    }

    public static void main(String[] args) {
        List<Integer> first15NarcissisticNumbers = findNarcissisticNumbers(15);
        System.out.println("First 15 Narcissistic Numbers: " + first15NarcissisticNumbers);
    }
}
