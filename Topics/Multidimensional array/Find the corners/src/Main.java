class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int n = twoDimArray.length;
        int m = twoDimArray[0].length;
        
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][m - 1]);
        System.out.println(twoDimArray[n - 1][0] + " " + twoDimArray[n - 1][m - 1]);
    }
}
