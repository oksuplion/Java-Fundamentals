/*8) Имея три переменных типа int a, b, c выведите на экран “true”, если сумма значений двух любых из этих переменных равна значению третьей. */
package twoLB;

public class Eight {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 1;
        if(a+b==c||b+c==a||a+c==b)
        {
            System.out.println("true");
        }
    }
}
