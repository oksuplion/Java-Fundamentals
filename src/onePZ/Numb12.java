package onePZ;
import java.util.Scanner;

/**
 *  * Условные операторы
 * Арифметические действия над числами пронумерованы следующим
 * образом: 1 – сложение, 2 – вычитание, 3 – умножение, 4 – деление. Дан номер
 * действия N (целое число в диапазоне 1–4) и вещественные числа A и B ( В не
 * равно 0). Выполните над числами указанное действие и выведите результат.
 */
public class Numb12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, n;
        System.out.println("Введите целое число 1\n");
        a = in.nextInt();
        System.out.println("Введите целое число 2\n");
        b = in.nextInt();
        System.out.println("Введите номер действия:  1 – сложение, 2 – вычитание, 3 – умножение, 4 – деление\n");
        n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("сложение " + (a + b));
                break;
            case 2:
                System.out.println("вычитание " + (a - b));
                break;
            case 3:
                System.out.println("умножение " + (a * b));
                break;
            case 4:
                System.out.println("деление " + (a / b));
                break;
        }

    }
}

