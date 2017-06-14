/*5. Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке без использования регулярных выражений,
 например “bob is bab” -> 2 .*/
package threePZ;
class S5 {//создаю класс с именем S5
    private String string = "bob is bab bomb bab ";//задаю строку
    public void occurrences(){
        int ind = 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++){//цикл индексов строки
            if (string.charAt(i) == ' '){//если буква на позиции i равняется пробелу
                if((string.charAt(ind) == 'b') && (string.charAt(ind+2) == 'b'))//и если начальная буква и вторая от нее равняется b
                    count++;//довавляем 1 в счетчик
                ind = i+1;//увеличиваем индекс буквы на 1
            }
        }
        System.out.println ("bob is bab bomb bab = " + count );//вывожу строку на экран
    }
}
/*package threePZ;
class S5 {//создаю класс с именем S5
    private String string = "bob is bab bomb bab ";//задаю строку
    public void occurrences(){
        int ind = 0;
        int count = 0;
        final String sentences[] =string.split("[ ]\\s*");//разбила по словам
        for (int i=0;i<sentences.length;i++) {
            if ((sentences[i].charAt(ind) == 'b') && (sentences[i].charAt(ind + 2) == 'b')) {//и если начальная буква и вторая от нее равняется b
                count++;//довавляем 1 в счетчик
            }
        }
        System.out.println("bob is bab bomb bab = " + count);
    }
}*/
