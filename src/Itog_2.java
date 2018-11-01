import java.util.Arrays;
import java.util.Scanner;

public class Itog_2 {
    public static void main(String[] args) {
        //* Написать программу сортировки по возрастанию заданного пользователем массива чисел
        //Создание массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int mas_long = in.nextInt();
        System.out.println("длина массива: " + mas_long);
        int[] massiv = new int[mas_long];
        System.out.println("Заполните числами массив: ");
        for (int i = 0; i < mas_long; i++) {
            massiv[i] = in.nextInt();
        }
        System.out.println("Массив =");
        System.out.println(Arrays.toString(massiv));
        System.out.println("Результат: " );

        Arrays.sort(massiv);// сортировка заданного массива
        for(int i = 0; i <  mas_long; i++) {  //вывод массива
            System.out.print(massiv[i] + "  ");
        }
    }

}