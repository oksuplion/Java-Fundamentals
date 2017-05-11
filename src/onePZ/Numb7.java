package onePZ;
import java.util.Scanner;

/**
 *  * Логические операторы. Условные операторы
 * Даны два целых числа: A, B. Проверьте истинность высказывания:
 * «Справедливы неравенства A > 2 и B ≤ 3».
 */
public class Numb7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Введите целое число A\n");
        a=in.nextInt();
        System.out.println("Введите целое число B\n");
        b=in.nextInt();
        if(a>2&&b<=3)
        {
            System.out.println("Справедливы неравенства A > 2 и B ≤ 3");
        }
    }
}
