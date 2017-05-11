package onePZ;
import java.util.Scanner;

/**
 * Основные операторы
 * Найдите корни квадратного уравнения A * x * x + B * x + C = 0, заданного
 * своими коэффициентами A, B, C (коэффициент A не равен 0), если известно, что
 * дискриминант уравнения положителен. Выведите значение корней на экран.
 */

import java.lang.Math;
public class Numb3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        double d,x1,x2;
        System.out.println("Введите a\n");
        a=in.nextInt();
        System.out.println("Введите b \n");
        b=in.nextInt();
        System.out.println("Введите c\n");
        c=in.nextInt();
        d=Math.pow(b,2)-4*a*c;
        if(d>0) {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Квадратные корни x1 = " + x1 + " x2 = " + x2);
        }
        else System.out.println("d<0");
    }
}
