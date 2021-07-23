import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int[][] arrayMatrix = new int[userInput][userInput];

        for (int i = 0; i < userInput; i++) { // iterate over rows
            for (int j = 0; j < userInput; j++) { // iterate over columns
                arrayMatrix[i][j] = Math.abs(j - i); // calculate cell's value
            }
        }

        for (int[] row : arrayMatrix) {
            System.out.println();
            for (int a : row) {
                System.out.print(a + " ");
            }
        }
    }
}
