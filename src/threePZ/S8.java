/*8. Заданы две строки. Создайте новую строку, состоящую из первой строки, в которой удалены все вхождения второй строки.*/
package threePZ;
class S8 {//создаю класс с именем S8
    private String string = "We went to the country when it was raining";//задаю строку
    private String unstring = "when it was raining";//задаю подстроку
    public void change() {//ф-ция изменения строки
        System.out.println(string.replaceAll(unstring, ""));//заменяю все вхожденя подстрок на пустое значение
    }
}
