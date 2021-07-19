import java.util.Scanner;

class TheLongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input length of array
        int size = scanner.nextInt();
        // build empty array to fill
        int[] array = new int[size];

        // create an array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int longest = 1;
        int tempLongest = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                tempLongest++;
                if (tempLongest > longest) {
                    longest = tempLongest;
                }
            } else {
                tempLongest = 1;
            }
        }
        System.out.println(longest);
    }
}
