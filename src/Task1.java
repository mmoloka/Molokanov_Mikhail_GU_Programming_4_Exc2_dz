
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
 введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
 повторно запросить у пользователя ввод данных. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getRealNumber());
    }

    public static float getRealNumber() {
        boolean flag = true;
        float number = 0;

        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите вещественное число: ");
                number = sc.nextFloat();
                flag = false;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели некорректное значение!");
            }
        }
        return  number;
    }
}
