/*7) Подсчитать сумму простых чисел в диапазоне от 1 до 20. */
package twoLB;

public class Seven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            boolean counter = false;
            for (int j = 2; j < 20; j++) {
                if (i == j)
                    continue;
                if (i % j == 0)
                    counter=true;
            }
            if(!counter)
                sum += i;
        }
        System.out.println("Cуммa простых чисел в диапазоне от 1 до 20 = " + sum);
    }
}