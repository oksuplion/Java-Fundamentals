/*6) Подсчитать сумму четных целых цисел от 1 до 20. */
package twoLB;

public class Six {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            if(i%2==0)
                sum+=i;
        }
        System.out.println("Cуммa чётных целых чисел в диапазоне от 1 до 20(включая) = " + sum);
    }
}