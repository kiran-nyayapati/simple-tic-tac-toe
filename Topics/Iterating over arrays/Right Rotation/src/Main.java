import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array we want to work with
        String[] stringArray = scanner.nextLine().split(" ");

        // Converts String Array to an Integer Array
        int[] intArray = new int[stringArray.length];

        // Finish converting string into an Int array & fill elements in the array
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        // Rotate the given array by n times toward right
        int numberOfRotations = scanner.nextInt();
        numberOfRotations = numberOfRotations % intArray.length;

        // Our loop that moves the array everywhere
        for (int i = 0; i < numberOfRotations; i++) {
            // Store last element of the array
            int lastElement = intArray[intArray.length - 1];
            // Shift element of array by one
            System.arraycopy(intArray, 0, intArray, 1, intArray.length - 1);

            /*
            for (int j = intArray.length - 1; j > 0; j--) {
                intArray[j] = intArray[j - 1];
            }
            */

            // store last element of the array to start of the array
            intArray[0] = lastElement;
        }

        // display resulting array after rotation & print out the array without brackets
        for (int number : intArray) {
            System.out.print(number + " ");
        }

    }
}
