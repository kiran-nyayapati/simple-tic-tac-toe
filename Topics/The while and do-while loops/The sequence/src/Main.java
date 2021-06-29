import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNumber = 0;
        
        while (scanner.hasNext()) {
            int userInput = scanner.nextInt();
            if (userInput % 4 == 0 && userInput > maxNumber) {
                maxNumber = userInput;
            }
        }
        System.out.format("%d", maxNumber);
    }
}

/*

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        int[] userInput = new int[size];

        for (int i = 0; i < size; i++) {
            userInput[i] = scanner.nextInt();
        }

        int maxNumber = 0;

        for (int number : userInput) {
            if (number % 4 == 0 && number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.format("%d", maxNumber);
    }
}
*/
