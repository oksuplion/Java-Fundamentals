/*10) Написать программу расчета обязательных платежей кредитора при пользовании банковским кредитом.

Задание:

а) Для каждого месяца вывести на экран сумму к оплате по телу кредита и начисленные проценты

б) Суммарное значение выплаченных процентов за период пользования кредитом.

Исходные данные: Сумма кредита, процентная ставка, срок кредитования. */
package threeLB;
public class Ten {
    public static void main(String[] args) {
        Creditor Ivan = new Creditor(11000, 4.6, 12);
        System.out.println();
        System.out.println("Переплата за все время "+Ivan.getCredit());
    }
}