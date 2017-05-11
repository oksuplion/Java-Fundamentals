package onePZ;
import java.util.Scanner;

/**
 *  * Условные операторы
 * Дан номер месяца – целое число в диапазоне 1-12 (1 – январь, 2 – февраль и
 * т.д.). Выведите название соответствующего времени года (зима, весна, лето,
 * осень).
 */
public class Numb11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K;
        System.out.println("Введите целое число\n");
        K = in.nextInt();
        if (K == 12 || K == 1 || K == 2) {
            System.out.println("зима\n");
        }
        if (K == 3 || K == 4 || K == 5) {
            System.out.println("весна\n");
        }
        if (K == 6 || K == 7 || K == 8) {
            System.out.println("лето\n");
        }
        if (K == 9 || K == 10 || K == 11) {
            System.out.println("осень\n");
        }
    }
}