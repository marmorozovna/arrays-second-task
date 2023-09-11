public class _Main {
    public static void main(String[] args) {
        int[] numbers = {1, 109, 4, 89};
        for (int i = 0; i < numbers.length; i++) {
            for (int a = i + 1; a < numbers.length; a++) {
                if (numbers[i] > numbers[a]) {
                    int x = numbers[i];
                    numbers[i] = numbers[a];
                    numbers[a] = x;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
