/*6. Создайте подстроку из исходной строки, где в каждом слово, содержащем символ “*”
 удалены соседние левый и правый символы, например “th*is is sum*mer” -> “ts is suer”. */
package threePZ;
class S6 {//создаю класс с именем S6
    private String string = "th*is is sum*mer";//задаю строку
    public void delete(){//создаю ф-цию удаления
        int index;//создаю переменную
        for (int i = 0; i<string.length(); i++){//цикл индексов строки
            if (string.charAt(i) == '*'){//если символ на позиции i равен *
                index = i;//присваиваю переменной индекс переменную i
                string = string.substring(0,  index-1) + string.substring( index+2);//сливаю строку от символа до * к символу после *
            }
        }
        System.out.println(string);//вывожу строку на экран
    }
}
