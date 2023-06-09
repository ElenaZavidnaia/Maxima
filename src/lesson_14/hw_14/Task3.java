package lesson_14.hw_14;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {
        /**3
         1. Создай список слов, заполни его самостоятельно.
         2. Метод fix должен:
         2.1. удалять из списка строк все слова, содержащие букву "р"
         2.2. удваивать все слова содержащие букву "л".
         2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
         2.4. с другими словами ничего не делать.

         public static void main(String[] args) {
         ArrayList<String> strings = new ArrayList<String>();
         strings.add("роза");
         strings.add("лоза");
         strings.add("лира");
         strings = fix(strings);

         for (String string : strings) {
         System.out.println(string);
         }
         }

         public static ArrayList<String> fix(ArrayList<String> strings) {
         //напишите тут ваш код
         return null;
         }**/

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ListIterator<String> itr = strings.listIterator();
        String str;
        while (itr.hasNext()) {
            str = itr.next();
            if (str.contains("р") && str.contains("л")) {
            } else if (str.contains("р")) {
                itr.remove();
            } else if (str.contains("л")) {
                itr.set(str.concat(str));
            }
        }
        return strings;
    }
}
