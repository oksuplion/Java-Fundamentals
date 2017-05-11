/*1) Создайте класс, в котором присутствуют переменные класса всех примитивных типов.
 Выведите на экран значение полей класса без предварительной инициализации.
 Повторите тоже самое для локальных переменных. */
package one;

public class One {

    private static int a;
    private static byte b;
    private static short c;
    private static char d;
    private static long e;
    private static float f;
    private static double g;
    private static boolean h;

    public static void main(String[] args) {
        System.out.println("Значение\n");
        System.out.println("int : " + a + "\n");
        System.out.println(" byte : " + b + "\n");
        System.out.println(" short : " + c + "\n");
        System.out.println(" char : " + d + "\n");
        System.out.println(" long : " + e + "\n");
        System.out.println(" float : " + f + "\n");
        System.out.println(" double : " + g + "\n");
        System.out.println(" boolean : " + h + "\n");
    }
}

