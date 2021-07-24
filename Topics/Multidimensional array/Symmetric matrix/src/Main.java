import java.util.Scanner;

class Main {
    public static boolean checkSymmetry(int[][] squareMatrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (squareMatrix[i][j] != squareMatrix[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[][] squareMatrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareMatrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println(checkSymmetry(squareMatrix, size) ? "YES" : "NO");
    }
}
