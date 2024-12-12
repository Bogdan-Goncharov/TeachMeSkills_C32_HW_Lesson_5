import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to increase each element by: ");
        int increment = scanner.nextInt();

        int[][][] array = {
                {{1, 2, 3},{4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        System.out.println("Array after incrementing each element by " + increment + ":");
        for (int[][] matrix : array) {
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
