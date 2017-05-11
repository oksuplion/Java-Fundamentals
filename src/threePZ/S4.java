/*4. Из заданной строки составьте новую, в которой каждый исходный символ представлен двумя, например “Candy” -> “CCaannddyy”.*/
package threePZ;
class S4 {//создаю класс с именем S4
    private String string = "Blessedness";//задаю строку
    public String repetition(){//ф-ция повторения каждого символа
        String str = "";//задаю строку и инициализирую ее
        for (int i = 0; i < string.length(); i++){//цикл перебора индексов строки
            str = str + string.charAt(i) + string.charAt(i);//добавляю к имеющиейся строке 2 раза 1 и тот же символ
        }
        return str;//возвращаю новую получившеюся строку
    }

}



