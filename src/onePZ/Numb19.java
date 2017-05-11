package onePZ;
import java.util.Scanner;

/**
 *  * Циклы
 * Даны целые числа A и B (A < B). Выведите все целые числа от A до B
 * включительно; при этом число A должно выводиться 1 раз, число A + 1 должно
 * выводиться 2 раза и т.д.
 */
public class Numb19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        System.out.println("Введите целое число B\n");
        b = in.nextInt();
        for (int i = a;i<=b;i++)
        {
            for (int j=a;j<=i;j++)
                {
                    System.out.println(i);
                }
        }
    }
}
