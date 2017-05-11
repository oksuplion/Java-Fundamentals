package onePZ;
import java.util.Scanner;

/**
 *  Циклы (for)
 Даны два целых числа A и B ( A < B). Выведите в порядке возрастания все
 целые числ а, расположенные между A и B (включая сами числа A и B), а также
 количество N этих чисел.
 */
public class Numb13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        System.out.println("Введите целое число B\n");
        b = in.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
