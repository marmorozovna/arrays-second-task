import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] numbers = {34, 59, 4, 0};
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                if (numbers[0] > numbers[1]) {
                    int x = numbers[0];
                    int y = numbers[1];
                    numbers[0] = y;
                    numbers[1] = x;
                }
                if (numbers[0] > numbers[2]) {
                    int x = numbers[0];
                    int y = numbers[2];
                    numbers[0] = y;
                    numbers[2] = x;
                }
                if (numbers[0] > numbers[3]) {
                    int x = numbers[0];
                    int y = numbers[3];
                    numbers[0] = y;
                    numbers[3] = x;
                }
            }
            if (i == 1) {
                if (numbers[1] > numbers[2]) {
                    int x = numbers[1];
                    int y = numbers[2];
                    numbers[1] = y;
                    numbers[2] = x;
                }
                if (numbers[1] > numbers[3]) {
                    int x = numbers[1];
                    int y = numbers[3];
                    numbers[1] = y;
                    numbers[3] = x;
                }
            }
            if (i == 2) {
                if (numbers[2] > numbers[3]) {
                    int x = numbers[2];
                    int y = numbers[3];
                    numbers[2] = y;
                    numbers[3] = x;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }
    }
}
