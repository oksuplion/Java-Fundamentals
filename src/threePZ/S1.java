/*1.  	Заданы 2 произвольных строки. Из этих строк создать одну объединенную без первых символов в каждой из строк*/
package threePZ;
class S1 {//создаю класс с именем S1
    private String string1;//создаю строку 1
    private String string2;//создаю строку 2
    public S1(String s1, String s2) {//создала конструктор класса S1
        string1 = s1;//присвоила строке передаваемое значение s1
        string2 = s2;//присвоила строке передаваемое значение s2
    }
    public String add() {//ф-ция объеденения без 1-ых символов
        String str;//новая объедененная строка
        str = string1.substring(1) + string2.substring(1);//соеденяю строки начиная со 2-ых символов
        return str;//передаю объедененную строку
    }
}
