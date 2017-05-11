package onePZ;
import java.util.Scanner;

/**
 * Логические операторы. Условные операторы
 Даны три целых числа: A, B, C. Проверьте истинность высказывания:
 «Справедливо двойное неравенство A < B < C».
 */
public class Numb8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        System.out.println("Введите целое число B\n");
        b = in.nextInt();
        System.out.println("Введите целое число C\n");
        c = in.nextInt();
        if ((a < b) && (b < c)) {
            System.out.println("Справедливо двойное неравенство A < B < C");
        }
    }
}
