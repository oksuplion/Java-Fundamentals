/*Сделать систему расчета заработной платы на предприятии.
Сделать базовый класс Employee. Производные классы от базового класса Employee являются:
класс Boss - начисляется еженедельный фиксированный оклад независимо от числа отработанных часов;
класс HourlyWorker - служащим начисляется почасовая з/п за часы, отработанные в основное время, и повышенная плата за часы, отработанные сверхурочно;
класс PieceWorker - служащим начисляется сдельная плата по количеству изготовленных изделий;
класс CommissionWorker - служащим начисляется базовая з/п плюс комиссионный процент от продаж.
В базовом классе определить 2 метода: расчет з/п сотрудника и вывод на экран имени и фамилии рабочего. В главной программе показать обработку информации всех типов служащих.
Можно создать массив или ArrayList типа Employee и добавить туда разные объекты.

Сделайте подсчет сколько денег нужно выплать в месяц всем рабочим. */
package four;
import four.inheritance.*;
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss("Алексей", 5500, "Иванов");
        boss.setWeek(5);

        CommissionWorker commissionWorker = new CommissionWorker("Вадим", 500, "Юрьевич");
        commissionWorker.setPercent(0.5);

        HourlyWorker hourlyWorker = new HourlyWorker("Виктория", 500, "Кирне");
        hourlyWorker.setHours(7);

        HourlyWorker hourlyWorker1 = new HourlyWorker("Ирина", 500, "Плюшкина");
        hourlyWorker1.setHours(10);

        PieceWorker pieceWorker = new PieceWorker("Назар", 500, "Арнид");
        pieceWorker.setProducts(25);

        Employee[] staff = new Employee[5];
        staff[0] = boss;
        staff[1] = commissionWorker;
        staff[2] = hourlyWorker;
        staff[3] = hourlyWorker1;
        staff[4] = pieceWorker;

        double pay_all_month =0;
        for (Employee e : staff) {
            System.out.println("имя: " + e.getName() + ", фамилия: " + e.getSurname() + ", зарплата: " + e.getSalary());
            pay_all_month+=e.getSalary();
        }
        System.out.println("Выплатить в месяц всем рабочим: " + pay_all_month );
    }
}