package onePZ;
import java.util.Scanner;

/**
 *  * Даны положительные числа A и B (A > B)!!!!!!!!!!. На отрезке длины A размещено
 * максимально возможное количество отрезков длины B (без наложений). Не
 * используя операции умножения и деления, найдите длину незанятой части
 * отрезка A.
 */
public class Numb16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, len = 0;
        System.out.println("Введите целое число A\n");
        a = in.nextInt();
        System.out.println("Введите целое число B, меньше А\n");
        b = in.nextInt();
       while (a>b)
       {
           a-=b;
           len++;
       }
        System.out.println(len);
    }
}
