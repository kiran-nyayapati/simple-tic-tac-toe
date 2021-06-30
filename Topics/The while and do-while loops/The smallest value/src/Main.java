import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number = scanner.nextLong();
        long factorial = 1L;
        int count = 1;
        
        // loop to determine the smallest number
        while (factorial <= number) {
            count++;
            factorial = factorial * count;
        }
        System.out.println(count);
    }
}
