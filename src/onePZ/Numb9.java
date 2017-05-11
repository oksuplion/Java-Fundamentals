package onePZ;
import java.util.Scanner;

/**
 * * Логические операторы. Условные операторы
 * Даны четыре целых числа, одно из которых отлично от трех других,
 * равных между собой. Определите порядковый номер числа, отличного от
 * остальных.
 */
public class Numb9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Введите целое число 1\n");
        a = in.nextInt();
        System.out.println("Введите целое число 2\n");
        b = in.nextInt();
        System.out.println("Введите целое число 3\n");
        c = in.nextInt();
        System.out.println("Введите целое число 4\n");
        d = in.nextInt();
        if((a==b)&&(b==c))
        { System.out.println("Число 4 - отличается от остальных\n");}
        if((a==c)&&(d==c))
        { System.out.println("Число 2 - отличается от остальных\n");}
        if((a==d)&&(d==b))
        { System.out.println("Число 3 - отличается от остальных\n");}
        if((b==c)&&(d==c))
        { System.out.println("Число 1 - отличается от остальных\n");}
    }
}
