// Если необходимо, исправьте данный код:

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите целое число: ");       // считаем, что пользователь вводит корректно целые
        int d = scanner1.nextInt();                        // числа
        System.out.println("Введите размерность массива");
        int capacity = scanner2.nextInt();
        int[] array = new int[capacity];
        for (int i = 0; i < array.length ; i++) {
            array[i] = rnd.nextInt(-10, 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        try {
            int result1 = array[8] / d;
            System.out.println("result1 = " + result1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
        scanner1.close();
        scanner2.close();
    }

}
