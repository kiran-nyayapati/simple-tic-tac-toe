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
        
        int maxElement = integerNumbersArray[0];
        int index = 0;

        for (int number : integerNumbersArray) {
            if (number > maxElement) {
                maxElement = number;
            }
        }
        
        for (int i = 0; i < integerNumbersArray.length; i++) {
            if (integerNumbersArray[i] == maxElement) {
                index = i;
                break;
            }
        }
        
        System.out.print(index);
    }
}
