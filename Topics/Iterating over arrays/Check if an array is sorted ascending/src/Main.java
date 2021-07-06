import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] integerNumbersArray = new int[size];

        for (int i = 0; i < size; i++) {
            integerNumbersArray[i] = scanner.nextInt();
        }
        
        boolean isArraySorted = true;
             
        for (int i = 0; i < integerNumbersArray.length - 1; i++) {
            if (integerNumbersArray[i] > integerNumbersArray[i + 1]) {
                isArraySorted = false;
                break;
            }
        }     
        System.out.println(isArraySorted);
    }
}
