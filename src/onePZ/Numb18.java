package onePZ;
import java.util.Scanner;

/**
 * Циклы (while)
 * Дано целое число N (>0). Используя операции деления нацело и взятия
 * остатка от деления, выведите все его цифры, начиная с самой правой (разряда
 * единиц).
 */
public class Numb18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите целое положительное число\n");
        n = in.nextInt();
        while (n>0)
        {
            System.out.println(n%10);
            n/=10;
        }
    }
}
