/*3) Создайте переменную типа short. Инициализаируйте ее результатом выполнения следующих операций:

- суммой двух целых чисел;

- суммой целого и дробного чисел;

- суммой значений переменных типов float и int;

- суммой значений переменных типа byte + short;

- суммой значений переменных типа float + double; */
package oneLB;

public class Three {

    public static void main(String[] args) {
        short a;
        int b =9;
        double d =4.2;
        float e = 7.6f;
        byte f = 5;
        short g = 4;

        a=1+6;
        System.out.println("суммой двух целых чисел " + a + "\n");
        a=(short)2.6+9;
        System.out.println("суммой целого и дробного чисел " +a + "\n");
        a= (short)(b+e);
        System.out.println("суммой значений переменных типов float и int " +a + "\n");
        a= (short)(f+g);
        System.out.println("суммой значений переменных типа byte + short " +a + "\n");
        a= (short)(e+d);
        System.out.println("суммой значений переменных типа float + double " +a + "\n");
    }
}

