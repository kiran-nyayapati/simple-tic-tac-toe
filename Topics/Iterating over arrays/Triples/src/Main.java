import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }
        
        int numberOfTriples = 0;
        
        for (int i = 0; i < integerNumbersArray.length - 2; i++) {
            if (integerNumbersArray[i + 1] - integerNumbersArray[i] == 1 && 
                    integerNumbersArray[i + 2] - integerNumbersArray[i + 1] == 1) {
                numberOfTriples++;
            }
        }

        System.out.println(numberOfTriples);
    }
}
