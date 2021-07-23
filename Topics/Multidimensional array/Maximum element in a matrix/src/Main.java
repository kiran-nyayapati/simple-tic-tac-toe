import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sizeN = scanner.nextInt();
        int sizeM = scanner.nextInt();
        int[][] arrayMatrix = new int[sizeN][sizeM];
        
        for (int i = 0; i < sizeN; i++) {
            for (int j = 0; j < sizeM; j++) {
                arrayMatrix[i][j] = scanner.nextInt();
            }
        }
        
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int columnIndex = -1;
        
        for (int i = 0; i < sizeN; i++) {
            for (int j = 0; j < sizeM; j++) {
                if (arrayMatrix[i][j] > max) {
                    max = arrayMatrix[i][j];
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.println(rowIndex + " " + columnIndex);
    }
}
