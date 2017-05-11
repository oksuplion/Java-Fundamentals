/*Второй способ:
3) Найти, каких букв, гласных или согласных, больше в каждом предложении заданного текста. Указать на сколько одних букв больше других. */
package twoPZ;
public class Letters2 {
    private static final String VOWELS = "aeiouyAEIOUY";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";

    public static boolean isVowel(char ch) {//статическая ф-ция типа boolean, для определения - есть ли переданная буква в строке гласных

        return VOWELS.indexOf(ch) >= 0;//возвращает индекс в строке VOWELS, начиная с 0 и если там есть буква на выходе получаем true
    }

    public static boolean isConsonants(char ch) {//для согласных

        return CONSONANTS.indexOf(ch) >= 0;
    }

    public static int Vowel(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); ++i)
            if (Letters2.isVowel(line.charAt(i)))
                ++counter;
        return counter;
    }

    public static int Consonants(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); ++i)
            if (Letters2.isConsonants(line.charAt(i)))
                ++counter;
        return counter;
    }

    public static void main(String[] args) {
        String str = "Let me introduce myself, my name is Olga Petrova. " +
                "I am sixteen. I am a pupil. I study in the 11 th form.  " +
                "Our family is big. My father is 41. He is a journalist." +
                "He likes his work very much. ";
        //разбиваю предложения \\s* - разбивание текста по пробелам, игнорирует несколько пробелов, воспринимая их как 1.
        final String sentences[] = str.split("[.!?]\\s*");

        for(int i = 0; i<sentences.length;i++) {
            if( Letters2.Consonants(sentences[i])>Letters2.Vowel(sentences[i]))
            System.out.println("В " + (i+1) + " предложении согласных букв на "+(Letters2.Consonants(sentences[i])-Letters2.Vowel(sentences[i]))+" больше, чем гласных" );
            else if(Letters2.Vowel(sentences[i])>Letters2.Consonants(sentences[i]))
            System.out.println("В " + (i+1) + " предложении гласных букв на "+(Letters2.Vowel(sentences[i])-Letters2.Consonants(sentences[i]))+" больше, чем coгласных" );
       else
           System.out.println("Количество букв одинаковое в предложении под номером " + (i+1));//вывожу текст на экран
        }
         }
    }
