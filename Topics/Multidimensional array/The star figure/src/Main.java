import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Given an odd number n
        int oddNumber = scanner.nextInt();
        int middleRow = oddNumber / 2;
        int middleColumn = oddNumber / 2;
        
        for (int i = 0; i < oddNumber; i++) {
            for (int j = 0; j < oddNumber; j++) {
                // Main Diagonal condition: i==j, Secondary Diagonal condition: i = n - j + 1
                if (i == j || i == oddNumber - j - 1 || j == middleRow || i == middleColumn) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
