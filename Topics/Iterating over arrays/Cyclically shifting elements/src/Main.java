import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }
        
        System.out.print(integerNumbersArray[size - 1] + " ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(integerNumbersArray[i] + " ");
        }
        /*
        int lastElementArray = integerNumbersArray[integerNumbersArray.length - 1];

        for (int i = integerNumbersArray.length - 1; i > 0; i--) {
            integerNumbersArray[i] = integerNumbersArray[i - 1];
        }

        integerNumbersArray[0] = lastElementArray;

        for (int number : integerNumbersArray) {
            System.out.print(number + " ");
        }
        */
    }
}
