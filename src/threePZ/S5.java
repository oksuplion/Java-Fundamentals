/*5. Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке без использования регулярных выражений,
 например “bob is bab” -> 2 .*/
package threePZ;
class S5 {//создаю класс с именем S5
    private String string = "bob is bab bomb bab ";//задаю строку
    public void occurrences(){//создаю ф-цию вхождений
        int ind = 0;//создаю переменную и инициализирую ее
        int count = 0;//создаю переменную и инициализирую ее
        final String sentences[] =string.split("[ ]\\s*");//разбила по словам
        for (int i=0;i<sentences.length;i++) {
            if ((sentences[i].charAt(ind) == 'b') && (sentences[i].charAt(ind + 2) == 'b')) {//и если начальная буква и вторая от нее равняется b
                count++;//довавляем 1 в счетчик
            }
        }
        System.out.println("bob is bab bomb bab = " + count);

    }
}
