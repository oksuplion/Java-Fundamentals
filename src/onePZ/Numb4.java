package onePZ;
import java.util.Scanner;

/**
 *  Операторы сравнения. Условные операторы
 Дано целое число. Если оно является положительным, то прибавьте к нему
 1; если отрицательным, то вычтите из него 2; если нулевым, то замените его на
 10. Выведите полученное число

 */
public class Numb4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Введите целое число\n");
        a=in.nextInt();
        if(a>0)
            a++;
        else if(a<0)
            a-=2;
        else if(a==0)
            a=10;
        System.out.println("число " + a);
    }
}
