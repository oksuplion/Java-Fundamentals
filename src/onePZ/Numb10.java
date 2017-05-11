package onePZ;
import java.util.Scanner;

/**
 * * Дано целое число K. Выведите строку-описание оценки, соответствующей
 * числу K (1 – «плохо», 2 – «неудовлетворительно», 3 – «удовлетворительно», 4 –
 * «хорошо», 5 – «отлично»). Если K не лежит в диапазоне 1–5, то вывести строку
 * «ошибка».
 */
public class Numb10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K;
        System.out.println("Введите целое число\n");
        K = in.nextInt();
        switch (K){
            case 1 :System.out.println("плохо\n");break;
            case 2:System.out.println("неудовлетворительно\n");break;
            case 3:System.out.println("удовлетворительно\n");break;
            case 4:System.out.println("хорошо\n");break;
            case 5:System.out.println("отлично\n");break;
        default:System.out.println("ошибка\n");
        }
    }
}
