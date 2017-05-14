/*5) Подсчитать сумму целых чисел от 1 до 20. */
package twoLB;

public class Five {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum+=i;
        }

        System.out.println("Cуммa целых чисел в диапазоне от 1 до 20(включая) = " + sum);
    }
}
