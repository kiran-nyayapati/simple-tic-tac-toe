import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int externalSize = scanner.nextInt();
        int internalSize = scanner.nextInt();
        int[][] cinemaMatrix = new int[externalSize][internalSize];
        
        for (int i = 0; i < cinemaMatrix.length; i++) {
            for (int j = 0; j < cinemaMatrix[i].length; j++) {
                cinemaMatrix[i][j] = scanner.nextInt();
            }
        }
        
        int tickets = scanner.nextInt();
        int row = 0;
        int maximum = 0;
        
        for (int i = 0; i < cinemaMatrix.length; i++) {
            int rowMax = 0;
            for (int j = 0; maximum == 0 && j < cinemaMatrix[i].length; j++) {
                if (cinemaMatrix[i][j] == 0) {
                    rowMax++;
                } else {
                    rowMax = 0;
                }
                if (rowMax >= tickets) {
                    row = i;
                    maximum = rowMax;
                    break;
                }
            }
        }
        int result = maximum == 0 ? 0 : ++row;
        System.out.println(result);
    }
}
