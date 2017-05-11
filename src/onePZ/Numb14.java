package onePZ;
import java.util.Scanner;

/**
 *  Циклы (for)
 Даны два целых числа A и B ( A < B). Найдите сумму всех целых чисел от A
 до B включительно.
 */
public class Numb14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b,sum=0;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        System.out.println("Введите целое число B\n");
        b = in.nextInt();
        for (int i = a; i <= b; i++) {

            sum+=i;
        }
        System.out.println(sum);
    }
}
