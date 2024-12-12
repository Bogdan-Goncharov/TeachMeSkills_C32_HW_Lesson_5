public class Task_3 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int[] row : array) {
            for (int elem : row) {
                sum += elem;
            }
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}