import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sizeN = scanner.nextInt();
        int sizeM = scanner.nextInt();
        int[][] rectangleArray = new int[sizeN][sizeM];
        
        for (int i = 0; i < sizeN; i++) {
            for (int j = 0; j < sizeM; j++) {
                rectangleArray[i][j] = scanner.nextInt();
            }
        }
        
        for (int j = 0; j < sizeM; j++) {
            for (int i = sizeN - 1; i >= 0; i--) {
                System.out.print(rectangleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
