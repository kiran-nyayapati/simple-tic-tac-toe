class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] cubeArray = new int[3][3][3];

        for (int i = 0; i < cubeArray.length; i++) {
            for (int j = 0; j < cubeArray[i].length; j++) {
                for (int k = 0; k < cubeArray[i][j].length; k++) {
                    cubeArray[i][j][k] = j * cubeArray.length + k; // j * 3 + k;
                }
            }
        }
        return cubeArray;
    }
}
