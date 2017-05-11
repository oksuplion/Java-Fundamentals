package onePZ;
import java.util.Scanner;

/**
 *  * Циклы (for)
 * Дано целое число N (N > 0). Найдите произведение N! = 1 * 2 * … * N.
 */
public class Numb15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, pr = 1;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        if (a > 0)
            for (int i = 1; i <= a; i++) {

                pr *= i;
            }
        System.out.println(pr);
    }
}
