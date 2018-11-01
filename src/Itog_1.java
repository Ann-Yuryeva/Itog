import java.util.Arrays;
import java.util.Scanner;

public class Itog_1 {
    public static void main(String[] args) {
        // Написать программу,которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.
        Scanner in = new Scanner((System.in));
        System.out.println("Ввести число для которого будет выведена таблица умножения:  ");
        int matrix_long = in.nextInt();
        int[][] matrix = new int[matrix_long][matrix_long];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
            System.out.print("");
        }
        System.out.println("Таблица умножения =");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}