import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // enter size of array
        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];
        
        // enter elements of array
        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }
        
        // get maximum value of 2 adjacent elements in array
        int maxValue = 0;

        for (int i = 0; i < integerNumbersArray.length - 1; i++) {
            int adjacentIndices = integerNumbersArray[i] * integerNumbersArray[i + 1];
            if (adjacentIndices > maxValue) {
                maxValue = adjacentIndices;
            }         
        }    
        System.out.format("%d", maxValue);
    }
}
