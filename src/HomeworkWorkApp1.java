public class HomeworkWorkApp1 {
    public static void main(String[] args) {
        // 1.
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }

        // 2.
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }

        // 3.
        int[] arrayLessThan6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayLessThan6.length; i++) {
            if (arrayLessThan6[i] < 6) {
                arrayLessThan6[i] *= 2;
            }
        }

        // 4.
        int n = 5; // Размер массива
        int[][] squareArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            squareArray[i][i] = 1;
        }

        System.out.println("1. " + java.util.Arrays.toString(binaryArray));
        System.out.println("2. " + java.util.Arrays.toString(array100));
        System.out.println("3. " + java.util.Arrays.toString(arrayLessThan6));
        for (int[] row : squareArray) {
            System.out.println(java.util.Arrays.toString(row));

            //6.

            int[] array = {10, 5, 8, 3, 15, 7, 20};
            int min = array[0];
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        }
    }
}