import java.util.Arrays;
import java.util.Scanner;
//Cтрёхмерный массив из целых чисел
//с помощью циклов пройти по всему массиву и увеличить каждый элемент на целое число
//пусть число на которое увеличивается каждый элемент задаётся с консоли

public class Main {
    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3}, {4, 5, 6}}, {{1, 2, 3}, {4, 5, 6}}, {{1, 2, 3}, {4, 5, 6}}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиче число на которое хотите увеличить числа в массивах");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array [i][j][k] +=number;

                }

            }

        }
        System.out.println(Arrays.deepToString(array));

    }
}