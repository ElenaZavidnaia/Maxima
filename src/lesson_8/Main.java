package lesson_8;

public class Main {
    /**
     * Методы-
     * Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы. Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;
     * Формула создания метода-
     * 1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом: public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
     * protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте; - будет доступен только внутри текущего пакета (текущей папки);
     * private - только внутри текущего класса (файла);
     * -Статичность - два варианта: может быть указан признак статичности, либо нет:
     * - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
     * -Возвращаемый тип или слово void если метод ни чего не возвращает:
     * public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
     * public static String - если возвращает строку;
     * public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
     * 4 - Название метода: поясняющее его суть, с моленькай буквы;
     * 5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
     * 6 - тело метода (то что должно происходить, когда метод вызовут);
     * public static void printMassiveToConsole(int[][] mass)
     * Модификаторы доступа метода Сигнатура метода
     **/

    public static void main(String[] args) {
        Cat snezhok = new Cat();
        String name = "snezhok";
        int age = 10;
        snezhok.sayHello(name, age);
        snezhok.sayGoodBye();
        int pyat = snezhok.giveMeFive();
        System.out.println("Number pyat is" + pyat);
        double pi = snezhok.giveMePiNumber();
        System.out.println("Number pi is" + pi);
        int result = snezhok.multiple(3, 5);
        System.out.println("Result of multiple is " + result);
        Cat snezhok2 = new Cat("Snezhok Bro", 150);
        System.out.println("My name is " + snezhok2.getName());
        snezhok2.setName("Snezhok Velikiy");
        snezhok.setName("Snezhok Obychniy");
        System.out.println("U obychnogo snezhka name is " + snezhok2.getName());
    }
}
