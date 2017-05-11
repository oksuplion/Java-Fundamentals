package onePZ;
import java.util.Scanner;

/**
 * Циклы (while)
 * Дано целое число N (N > 1). Найдите наименьшее целое число K, при
 * котором выполняется неравенство 3 * K > N.
 */
public class Numb17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k=1;
        System.out.println("Введите целое положительное число\n");
        n = in.nextInt();
        if(n>1){
        while (n>3*k)
        {
        k++;
        }
            System.out.println("наименьшее целое число K, при\n" +
                    " * котором выполняется неравенство 3 * K > N = "+k);
    }

    }
}
