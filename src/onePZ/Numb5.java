package onePZ;
/**
 ** Операторы сравнения. Условные операторы
 * Даны три числа. Не используя логические операторы, найдите сумму двух
 * наибольших из них.
 */
public class Numb5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 52;
        int c = 5;
        int min = 0, sum = 0;
        min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.println("Minimum = " + min);
        sum = a + b + c - min;
        System.out.println("Sum of largest two numbers is: " + sum);
    }

}
