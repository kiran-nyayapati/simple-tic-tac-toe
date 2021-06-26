package tictactoe;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        String inputGrid = scanner.nextLine();

        System.out.println("---------");
        int index = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("| ");
            for(int j = 1; j <= 3; j++) {
                char impression = inputGrid.charAt(index++);
                System.out.print(impression + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }
}
