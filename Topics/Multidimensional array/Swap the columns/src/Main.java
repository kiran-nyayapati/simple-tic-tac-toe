import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nDimension = scanner.nextInt();
        int mDimension = scanner.nextInt();
        int[][] arrayMatrix = new int[nDimension][mDimension];
        
        for (int i = 0; i < nDimension; i++) {
            for (int j = 0; j < mDimension; j++) {
                arrayMatrix[i][j] = scanner.nextInt();
            }
        }
        
        int columnIndex1 = scanner.nextInt();
        int columnIndex2 = scanner.nextInt();
        
        for (int i = 0; i < nDimension; i++) {
            int temp = arrayMatrix[i][columnIndex1];
            arrayMatrix[i][columnIndex1] = arrayMatrix[i][columnIndex2];
            arrayMatrix[i][columnIndex2] = temp;
        }
        
        for (int i = 0; i < nDimension; i++) {
            for (int j = 0; j < mDimension; j++) {
                System.out.print(arrayMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
