import java.util.Scanner;
public class hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
                System.out.println("Hourglass at (" + i + ", " + j + "), sum: " + sum + ", maxSum: " + maxSum);
            }
        }

        System.out.println("Maximum hourglass sum: " + maxSum);

        scanner.close();
    }

    static int calculateHourglassSum(int[][] arr, int row, int column) {
        int sum = 0;
        sum += arr[row][column] + arr[row][column + 1] + arr[row][column + 2];
        sum += arr[row + 1][column + 1];
        sum += arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
        return sum;
    }
}


