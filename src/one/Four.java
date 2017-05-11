/*4) Заданы значения 2-х катетов и гипотенузы треугольника.
 Проверить является ли данный треугольник прямоугольным.
 Вычисления записать выражением, состоящим из одной строки (используя оператор “?:”). */
package one;
import java.lang.Math;

public class Four {

    public static void main(String[] args) {
        int catet1 = 3;
        int catet2 = 4;
        int hypot = 5;
        //?: - тернарная операция. Условие ? "Если true" : "Если false"
        System.out.println("Треугольник со сторонами : " + catet1 + " " + catet2+" "+hypot);
        System.out.println(IsTriangleRectangular(catet1,catet2,hypot)?"Прямоугольный":"Не прямоугольный");
        catet1 = 3;
        catet2 = 4;
        hypot = 9;
        System.out.println();
        System.out.println("Треугольник со сторонами : " + catet1 + " " + catet2+" "+hypot);
        System.out.println(IsTriangleRectangular(catet1,catet2,hypot)?"Прямоугольный":"Не прямоугольный");
    }

    public static boolean IsTriangleRectangular(int cathetus1, int cathetus2, int hypotenuse){
        if(Math.pow(hypotenuse,2)==Math.pow(cathetus1,2)+Math.pow(cathetus2,2))
            return true;
        else
            return false;
    }
}

