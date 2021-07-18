import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	// reads an array of lowercase strings and checks whether the array is in alphabetical order or not:
        Scanner scanner = new Scanner(System.in);
	
	    // convert String to Array 
        String[] inputStrings = scanner.nextLine().split(" ");

        boolean isOrdered = true;
	
	    // compareTo method
        for (int i = 0; i < inputStrings.length - 1; i++) {
            if (inputStrings[i].compareTo(inputStrings[i + 1]) > 0) {
            	// if previous > next, isOrdered = false
                isOrdered = false;
                break;
            }
        }
        System.out.println(isOrdered);
    }
}
