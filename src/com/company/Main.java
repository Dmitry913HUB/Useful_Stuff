package com.company;
import static com.company.Variables.*;

public class Main {

    public static void main(String[] args) {

        // --------------------------------------------------ПРИМИТИВНЫЕ ТИПЫ-------------------------------------------------------------

        /*---Целые числа---*/
        System.out.println("Целые числа:");

            Variables num = new Variables();//создаем обект типа Variables, для того чтобы мы могли обращаться к полям объекта
        {
            System.out.println("Значение целочисленной переменной по умолчанию = " + num.num0);

            int number = 0;

            number++;
            number = number + 1;
            number += 1;

            System.out.println("number++, number = number + 1, number += 1 => " + number);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-----------------//

        /*---Числа с плавающей точкой---*/
        System.out.println("Числа с плавающей точкой:");

        {
            double pi, r, аrea;
            r = 10.8; // радиус окружности
            pi = 3.1416; // приблизительное значение числа пи
            аrea = pi * r * r; // вычислить площадь круга
            System.out.println("Плoщaдь круга равна " + аrea);
        }

        System.out.println("/------------------------/"); System.out.println();
        //------------------------------//

        /*---Символы---*/
        System.out.println("Символы:");

        {
            char chl, ch2;

            chl = 88; // код символа X
            ch2 = 'Y';

            System.out.println("chl и ch2: " + chl + " " + ch2);

            chl = 'x';
            System.out.println("chl содержит " + chl);
            chl++; //увеличить на единицу значение переменной chl
            System.out.println("chl теперь содержит " + chl);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------//

        /*---Логические значения---*/
        System.out.println("Логические значения:");

        {
            boolean b;

            b = false;
            System.out.println("b равно " + b);

            b = true;
            System.out.println("b равно " + b);

            //значение типа boolean может управлять оператором if
            if (b) System.out.println("Этoт код выполняется.");

            b = false;
            if (b) System.out.println("Этoт код не выполняется.");

            //результат сравнения - значение типа boolean
            System.out.println("10 > 9 равно " + (10 > 9));
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------//

        // -----------------------------------------------------ЛИТЕРАЛЫ----------------------------------------------------------

        /*---Целочисленные литералы---*/
        System.out.println("Целочисленные литералы:");

        {
            System.out.println("максимальное значение по типу long = " + num.litLong);
            System.out.println("максимальное значение по типу int = " + num.litInt);
            System.out.println("максимальное значение по типу byte = " + num.litByte);
            System.out.println("максимальное значение по типу short = " + num.litShort);

            short litshort = num.litByte;// ошибки не происходит, если значение литерала находится в диапазоне допустимых значений данного типа.
            System.out.println("присваивается переменной типа short переменную типа byte = " + litshort);

            byte litbyte = (byte) num.litInt;//если значение превосходит тип то нужно кастовать
            System.out.println("преобразованное значение из int в byte = " + litbyte);//???????why -1

            System.out.println("111___222___333 = " + num.litIntUnderline2);
            System.out.println("двоичное число в виде 0b1101_0101_0001_1010 = " + num.litIntUnderline3);
        }

        System.out.println("/------------------------/"); System.out.println();
        //----------------------------//

        /*---Литералы с плавающей точкой---*/
        System.out.println("Литералы с плавающей точкой:");

        {
            System.out.println("число с плавающей точкой в 2-ном порядке litdoublehex = 0x12.2p3 = 18.125*2^3 = " + num.litDoubleHex);
            System.out.println("9_423_497.1_0_9 = " + num.litDoubleUnderline);
        }

        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------//

        /*---Логические литералы---*/
        System.out.println("Логические литералы:");

        {
            //num.litBoolean = false;
            System.out.println(num.litBoolean);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------//

        /*---Символьные литералы---*/
        System.out.println("Символьные литералы:");

        {
            System.out.println("символ 'a' в 8-ой форме (141) = " + num.litChar8A);
            System.out.println("символ 'a' в 16-ой форме (u0061) = " + num.litChar16A);
            System.out.println("символ кавычка = " + num.litCharQuotes);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------//

        /*---Строковые литералы---*/
        System.out.println("Строковые литералы:");

        {
            System.out.println("строковый литерал = " + num.litString);
        }

        System.out.println("/------------------------/"); System.out.println();
        //------------------------//

        //-----------------------------------------------------ОБЛАСТЬ ВИДИМОСТИ----------------------------------------------------------

        /*---Динамическая инициализация---*/
        System.out.println("Динамическая инициализация");

        // В этом примере демонстрируется динамическая инициализация переменных
        {
            double a = 3.0, c = 4.0;
            // динамическая инициализация переменной 'd'
            double d = Math.sqrt(a * a + c * c);
            System.out.println("Гипoтeнyзa равна = " + d);
        }

        System.out.println("/------------------------/"); System.out.println();
        //--------------------------------//

        /*---Видимость в условиях if, else---*/
        System.out.println("Видимость в условиях if, else:");

        // Продемонстрировать область видимости блока кода
        {
            int x; // эта переменная доступна всему
            //коду из метода main()
            x = 10;
            if (x == 10) { // начало новой области действия,
                int y = 20; //доступной только этому блоку кода
                // обе переменные х и у доступны в
                // этой области действия
                System.out.println("x и у: " + x + " " + y);
                x = y * 2;
            }
            // у= 100; //ОШИБКА! переменная у недоступна
            // в этой области действия, тогда как
            // переменная х доступна и здесь
            System.out.println("x равно " + x);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-----------------------------------//

        /*---Видимость в цикле for---*/
        System.out.println("Видимость в цикле for:");

        {
            for (int x = 0; x < 2; x++) {
                int y = -1; // переменная у инициализируется при
                // каждом вхождении в блок кода
                System.out.println("y равно: " + y);
                // здесь всегда выводится значение -1
                y = 100;
                System.out.println("у теперь равно: " + y);
            }
        }

        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------//

        //--------------------------------------------------ПРЕОБРАЗОВАНИЕ ТИПОВ----------------------------------------------------------

        /*---Приведение несовместимых типов---*/
        System.out.println("Приведение несовместимых типов:");

        {
            num.numInt = 257;
            num.numDouble = 323.142;

            System.out.println("Преобразование типа int в тип byte.");
            num.numByte = (byte) num.numInt;
            System.out.println("int to Ьyte - " + num.numInt + " -> " + num.numByte);
            System.out.println("257 приводится к типу bytе, его результатом будет остаток от деления 257 на 256");

            System.out.println("\nПреобразование типа double в тип int.");
            num.numInt = (int) num.numDouble;
            System.out.println("double to int - " + num.numDouble + " -> " + num.numInt);
            System.out.println("когда значение переменной double преобразуется в тип int, его дробная часть отбрасывается");

            System.out.println("\nПреобразование типа douЫe в тип byte.");
            num.numByte = (byte) num.numDouble;
            System.out.println("double to byte - " + num.numDouble + " -> " + num.numByte);
            System.out.println("когда значение переменной double преобразуется в тип byte, его дробная часть отбрасывается " +
                    "\nзначение уменьшается до результата деления по модулю на 256, который в данном случае равен 67.");
        }

        System.out.println("/------------------------/"); System.out.println();
        //------------------------------------//

        /*---Автоматическое продвижение типов в выражениях---*/
        System.out.println("Автоматическое продвижение типов в выражениях:");

        //Java тип каждого операнда byte, short или char автоматически продвигается к типу int.

        {
            byte a = 40;
            byte b = 50;
            byte c = 100;

            int d = a * b / c;
            // а * Ь вполне может выйти за пределы диапазона допустимых значений его операндов типа byte.
            System.out.println("a * b / c = " + d);

            b = (byte)(b * 2); //т.к byte автоматически продвигается к типу int нужно явно указывать тип
            System.out.println("(byte)(b * 2) = " + b);
        }

        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------------------------//

        /*---Правила продвижения типов---*/
        System.out.println("Правила продвижения типов:");

        {
            byte b = 42;
            char c = 'а';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;

            double result = (f * b) + (i / c) - (d * s);

            System.out.println( (f * b) + " + " + (i / c) + " - " + (d * s));
            System.out.println("result = " + result);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------------//



        //--------------------------------------------------------ШАБЛОНЫ-----------------------------------------------------------

        /*---шаблон---*/
        System.out.println("шаблон");



        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------//

        //-------//
    }
}
