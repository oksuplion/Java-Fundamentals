/*7.  В заданной строке подсчитайте количество слов, заканчивающихся на ‘a’ или ‘s’, без учета регистра символов.*/
package threePZ;
class S7 {//создаю класс с именем S7
    private String string = "SummerS nice stay days goa holA ";
    private int a = 0;
    private int s = 0;

    public void count() {//ф-ция кол-ва слов
        string = string.toLowerCase();//перевожу строку в маленькие буквы
        final String sentences[] = string.split("[ ]\\s*");//разбила по словам
        for (int i = 0; i < sentences.length; i++) {
            if ((sentences[i].charAt(0) == 's')&& (sentences[i].charAt(sentences[i].length()-1) == 's')) {
                s++;
            }
            if ((sentences[i].charAt(0) == 'a')&& (sentences[i].charAt(sentences[i].length()-1) == 'a')) {
                a++;
            }
        }
        System.out.println("a = " + a + "  " + "s = " + s);
    }
}
