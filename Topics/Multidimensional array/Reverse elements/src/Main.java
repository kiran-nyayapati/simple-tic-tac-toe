class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int n = twoDimArray.length;
        
        for (int i = 0; i < n; i++) {
            int m = twoDimArray[i].length;
            for (int j = 0; 2 * j < m; j++) {
                int tempArray = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][m - j - 1];
                twoDimArray[i][m - j - 1] = tempArray;
            }
        }
    }
}
