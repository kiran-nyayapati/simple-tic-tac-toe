import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int number : integerNumbersArray) {
            sum += number;
        }
        System.out.format("%d", sum);
    }
}
