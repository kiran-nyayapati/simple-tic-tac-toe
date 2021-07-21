package tictactoe;

import java.util.Scanner;

public class Main {
    static char[] grid;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter grid: ");
        String inputGrid = scanner.next();
        grid = inputGrid.toCharArray();

        showGame();
        analyzeGame();
    }

    public static void showGame() {
        System.out.println("---------");
        System.out.format("| %c %c %c |\n", grid[0], grid[1], grid[2]);
        System.out.format("| %c %c %c |\n", grid[3], grid[4], grid[5]);
        System.out.format("| %c %c %c |\n", grid[6], grid[7], grid[8]);
        System.out.println("---------");
    }

    public static void analyzeGame() {
        boolean impossible;
        boolean threeX;
        boolean threeO;
        boolean aGridEmpty;

        impossible = invalidGrid();
        threeO = isThree('O');
        threeX = isThree('X');
        aGridEmpty = isAGridEmpty();

        if (impossible || (threeO && threeX)) {
            System.out.println("Impossible");
        } else if (threeO) {
            System.out.println("O wins");
        } else if (threeX) {
            System.out.println("X wins");
        } else if (aGridEmpty) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }

    public static boolean isThree(char element) {
        if (isThreeInARow(grid[0], grid[4], grid[8], element) ||
                isThreeInARow(grid[6], grid[4], grid[2], element)) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            if (isThreeInARow(grid[i], grid[i + 3], grid[i + 6], element)) return true;
            if (isThreeInARow(grid[i * 3], grid[i * 3 + 1], grid[i * 3 + 2], element)) return true;
        }
        return false;
    }

    public static boolean isThreeInARow(char a, char b, char c, char element) {
        return a == b && b == c && b == element;
    }

    public static boolean invalidGrid() {
        int countO = 0;
        int countX = 0;
        for (char ch: grid) {
            if (ch == 'O') {
                countO++;
            } else if (ch == 'X') {
                countX++;
            }
        }
        return Math.abs(countO - countX) > 1;
    }

    public static boolean isAGridEmpty() {
        for (char ch: grid) {
            if (ch == '_') return true;
        }
        return false;
    }
}
