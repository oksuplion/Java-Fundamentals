/**
 * Основные операторы
 * Скорость первого автомобиля V1 км/ч, второго – V2 км/ч, расстояние
 * между ними S км. Определите расстояние между ними через T часов, если
 * автомобили первоначально движутся навстречу друг другу. Данное расстояние
 * равно модулю время * суммарная скорость. Значения V1, V2, S, T
 * – задает пользователь.
 Разность начального расстояния S = |t*v1-t*v2|
 */
package onePZ;
import java.util.Scanner;
import java.lang.Math;
public class Numb2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1, v2, s,t,s1;
        System.out.println("Введите скорость первой машины \n");
        v1=in.nextInt();
        System.out.println("Введите скорость второй машины \n");
        v2=in.nextInt();
        System.out.println("Введите время, которое машины уже пробыли в дороге\n");
        t=in.nextInt();
        System.out.println("Введите весь путь\n");
        s=in.nextInt();
        s1 =Math.abs(v1*t-v2*t);//разность первоначельного состояния
        if(s>s1)
        System.out.println("Осталось проехать " + (s-s1)+"км\n");
        else System.out.println("Машины уже пересеклись ");

    }
}
