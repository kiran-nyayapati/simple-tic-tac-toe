import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        boolean isNextToEachOtherCheck = true;
        
        for (int i = 1; i < integerNumbersArray.length; i++) {
            if (integerNumbersArray[i - 1] == firstNumber && integerNumbersArray[i] == secondNumber) {
                isNextToEachOtherCheck = true;
                break;
            } 
            if (integerNumbersArray[i - 1] == secondNumber && integerNumbersArray[i] == firstNumber) {              
                isNextToEachOtherCheck = true;
                break;
            } else {
                isNextToEachOtherCheck = false;
            }
        }    
        System.out.print(isNextToEachOtherCheck);
    }
}
