/*9) Две переменные типа int, имеют положительные значения int a - начало диапазона, int b - конец диапазона, a>b.
 Вычислить среднее значение чисел в заданном диапазоне. */
package two;

public class Nine {
    public static void main(String[] args) {
        int a = 2, b = 15;
        int middle=0;
        for(int i=a;i<=b; i++)
            middle +=i;
        middle/=(b-a);
        System.out.println("Среднее значение чисел в диапазоне от " + a + " до " + b + " = " + middle);
    }
}
