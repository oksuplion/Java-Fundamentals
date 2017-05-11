/*Реализовать программу учета среднесуточной температуры на протяжении месяца.
Ввод данных реализовать с консоли. Вначале должен быть выведен запрос названия месяца, затем значений температуры для каждого числа.
 Количество дней в месяце программа должна определять автоматически. Значения хранить в ArrayList.
 При вводе реализовать проверку корректности вводимых данных, если данные введены не корректно - запросить ввод повторно.
  После введения данных вывести среднемесячную температуру, дату когда была максимальная температура и минимальная с указанием ее значения. */
package threePZ;
import java.util.*;

public class Homework {
    public static void main(String[] args) {

        ArrayList<java.lang.Integer> t = new ArrayList<>();
        //кол-во дней в месяце
        Calendar calendar = GregorianCalendar.getInstance();// возвращает объект класса GregorianCalendar, инициированный текущей датой и временем согласно региональным настройкам
        calendar.set(Calendar.MONTH, 0);//нумерация месяцев с нуля, пишем сюда номер нужного месяца
        int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//возвращает максимальное значение, которое Calendar.DAY_OF_MONTH может иметь
        for (int i = 0; i < maxDays; i++) {
            Scanner in = new Scanner(System.in);
            boolean a=false;
            System.out.println("Введите температуру для "+(i+1)+" дня: ");
            if (in.hasNextInt()) {//вот єто проверка - является ли числом
                t.add(in.nextInt());//если это число то добавляю значение в конец списка
                a=true;//присваиваю переменной а значение true
            }
            else {//если же ввели не число
                k://Оператор прерывания логики управления программой, метка
                while (!a) {//пока мы вводим не число
                    Scanner in1 = new Scanner(System.in);//запрашивать все время ввод
                    System.out.println("Введите число");
                    if(in1.hasNextInt()){//если все таки мы ввели число
                        t.add(in1.nextInt());// то добавляю значение в конец списка
                        a=true;//присваиваю переменной а значение true
                        break k;//выкидываю по метке
                    }
                }
                //выход сюда по метке k
            }
        }
        System.out.println("Максимальное количество дней в заданном месяце: "+maxDays);
        getMaxAndMin(t, maxDays);
        getMiddle(t, maxDays);
    }

    static void getMaxAndMin(ArrayList t, int maxDays) {
        int min = (int) t.get(0);
        int max = (int) t.get(0);
        int indexMin=0, indexMax=0;
        for (int i = 0; i < maxDays; i++)
        {
            if(min>(int)t.get(i))
            {
                min =(int) t.get(i);
                indexMin = i;
            }
            if(max<(int)t.get(i))
            {
                max =(int) t.get(i);
                indexMax = i;
            }
        }
        System.out.println("Минимальная температура в заданном месяце = "+min + " , под датой: " + (indexMin+1));
        System.out.println("Максимальная темпретарутра в заданном месяце = "+max+ " , под датой: " + (indexMax+1));
    }



    static void getMiddle(ArrayList t, int maxDays) {
        double sum = 0;
        double middle;
        for (int i = 0; i < maxDays; i++)
            sum += (int) t.get(i);//плюсую все температуры месяца
        middle = sum / maxDays;//делю их на кол-во дней
        System.out.println("Средняя темпреатура "+ (int)Math.round(middle));
    }
}

