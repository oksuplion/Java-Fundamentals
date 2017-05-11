/*7.  В заданной строке подсчитайте количество слов, заканчивающихся на ‘a’ или ‘s’, без учета регистра символов.*/
package threePZ;
class S7 {//создаю класс с именем S7
    private String string = "SummerS nice stay days goa holA ";
    private int a= 0;//создаю переменную и инициализирую ее
    private int s = 0;//создаю переменную и инициализирую ее
    public void count(){//ф-ция кол-ва слов
        string = string.toLowerCase();//перевожу строку в маленькие буквы
        for (int i = 0; i<string.length(); i++){//цикл индексов строки
            if(string.charAt(i) == ' '){//если символ на позиции i равен пробелу
                if (string.charAt(i-1) == 'a')//и символ пере пробелом равен a
                    a++;//увеличиваю счетчик для а
                if (string.charAt(i-1) == 's')//и символ пере пробелом равен s
                    s++;//увеличиваю счетчик для s
            }
        }
        System.out.println("a = " + a + "  " + "s = " + s);//вывожу строку на экран
    }
}
