package com.company;
import static com.company.Variables.*;
import static com.company.Operations.*;

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

        /*Ряд правил продвижения типов, применяемых к выражениям.
        Сначала все значения типа byte, short и char продвигаются к типу int,
        как пояснялось выше. Затем тип всего выражения продвигается к типу long, если
        один из его операндов относится к типу long.
        Если же один из операндов относится к типу float, то тип всего выражения продвигается к типу float.
        А если любой из операндов относится к типу double, то и результат вычисления всего
        выражения относится к типу double. */

        // byte, short, char -> int -> long -> float -> double

        {
            byte b = 42;
            char c = 'а';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;

            double result = (f * b) + (i / c) - (d * s);

            /* 1)выражение f * Ь тип переменной Ь продвигается к типу float, а результат вычисления этого выражения - float
            *  2)выражение i / c тип переменной с продвигается к типу int, а результат вычисления этого выражения - int
            *  3)выражении d * s тип переменной s продвигается к типу douЬle, а результат его вычисления - douЬle
            *  4) Результат сложения значений типа float и int относится к типу float.
            *  5) тип разности суммарного значения типа float и последнего значения типа douЬle продвигается к типу douЬle,
            *  который и становится окончательным типом результата вычисления выражения в целом.
            * */

            System.out.println( (f * b) + " + " + (i / c) + " - " + (d * s));
            System.out.println("(f * b) + (i / c) - (d * s) = " + result);
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------------//


        //--------------------------------------------------------МАССИВЫ-----------------------------------------------------------

        /*---Одномерные массивы---*/
        System.out.println("Одномерные массивы:");

        {
            num.arrayInt = new int[12];

            //первый способ объявления массива
            num.arrayInt[0] = 31;
            num.arrayInt[1] = 28;
            num.arrayInt[2] = 31;
            num.arrayInt[3] = 30;
            num.arrayInt[4] = 31;
            num.arrayInt[5] = 30;
            num.arrayInt[6] = 31;
            num.arrayInt[7] = 31;
            num.arrayInt[8] = 30;
            num.arrayInt[9] = 31;
            num.arrayInt[10] = 30;
            num.arrayInt[11] = 31;

            //второй способ объявления массива
            int arrayInt[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String arrayString[] = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

            for (int i = 0; i < 12; i++) {
                System.out.println(arrayString[i] + " \t-\t " + arrayInt[i] + "\tдней");
            }

            // В этой под программе вычисляется среднее значение ряда чисел.

            double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
            double result = 0;
            for (int i = 0; i < nums.length; i++) {
                result += nums[i];
            }
            System.out.println("(10.1 + 11.2 + 12.3 + 13.4 + 14.5) / "+ nums.length + " = " + result / nums.length);

        }

        System.out.println("/------------------------/"); System.out.println();
        //------------------------//

        /*---Многомерные массивы---*/
        System.out.println("Многомерные массивы:");

        {
            // Демонстрация применения двухмерного массива
            System.out.println("Демонстрация применения двухмерного массива, заданная размерность");

            int k = 0;
            for (int i = 0; i < num.arrayIntTwoDimensional.length; ++i) // количество строк в массиве
            {
                for (int j = 0; j < num.arrayIntTwoDimensional[i].length; ++j) // длинна каждого столбцоа в массиве
                {
                    num.arrayIntTwoDimensional[i][j] = k;
                    System.out.print(num.arrayIntTwoDimensional[i][j] + "\t");
                    k++;
                }
                System.out.println();
            }
            k = 0;

            //динамическое обявление массива
            System.out.println("динамическое обявление массива");

            // При резервировании памяти под многомерный массив
            // необходимо указать память только для первого (левого) измерения массива.
            int twoD[][] = new int[5][];
            twoD[0] = new int[4];
            twoD[1] = new int[3];
            twoD[2] = new int[5];
            twoD[3] = new int[1];
            twoD[4] = new int[6];

            for (int i = 0; i < twoD.length; ++i) // twoD.length = количество всех строк в массиве
            {
                for (int j = 0; j < twoD[i].length; ++j) // twoD[i].length = длинне каждого столбцоа в массиве
                {
                    twoD[i][j] = k;
                    System.out.print(twoD[i][j] + "\t");
                    k++;
                }
                System.out.println();
            }
            k = 0;

            // каждый элемент массива заполняется произведением его индексов, и эти произведения выводятся на экран.
            System.out.println("кубический массив:");

            //первй индекс отвечает за количество матриц, второй за количество строк в матрице, третий за количество столбцов в матрице
            int threeD[][][] = new int[3][4][5];
            for (int i = 0; i < threeD.length; ++i) // threeD.length = количество всех матриц
            {
                System.out.println("Матрица №" + (i + 1));
                for (int j = 0; j < threeD[i].length; ++j) // threeD[i].length = количество всех строк в массиве
                {
                    for (k = 0; k < threeD[i][j].length; ++k) // threeD[i][j].length = длинне каждого столбцоа в массиве
                    {
                        threeD[i][j][k] = k * i * j;
                        System.out.print(threeD[i][j][k] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            k = 0;
        }

        System.out.println("/------------------------/"); System.out.println();
        //-------------------------//

        //--------------------------------------------------------ОПЕРАЦИИ-----------------------------------------------------------

        /*---Арифметические операции---*/
        System.out.println("Арифметические операции:");

        {
            // арифметические операции над
            // целочисленными значениями
            System.out.println("\nЦeлoчиcлeннaя арифметика:");

            int a = 1 + 1;
            int b = a * 3;
            int c = b / 4;
            int d = c - a;
            int e = -d;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);

            // арифметические операции над значениями типа double
            System.out.println("\nApифмeтикa с плавающей точкой:");

            double da = 1 + 1;
            double db = da * 3;
            double dc = db / 4;
            double dd = dc - da;
            double de = -dd;

            System.out.println("da = " + da);
            System.out.println("db = " + db);
            System.out.println("dc = " + dc);
            System.out.println("dd = " + dd);
            System.out.println("de = " + de);

            System.out.println("\nОперация деления по модулю:");

            // Операция деления по модулю % возвращает остаток от деления.
            // Эту операцию можно выполнять как над числовыми типами данных с плавающей точкой,
            // так и над целочисленным типами данных.

            int x = 42;
            double y = 42.25;
            System.out.println("x mod 10 = "+ x % 10);
            System.out.println("y mod 10 = "+ y % 10);

            System.out.println("\nСоставные арифметические операции с присваиванием:");

            //Пример применения нескольких операций с присваиванием

            a = 1;
            b = 2;
            c = 3;

            a += 5;
            b *= 4;
            c += a * b;
            c %= 6;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);


        }

        System.out.println("/------------------------/"); System.out.println();
        //-----------------------------//

        /*---Операции инкремента и декремента---*/
        System.out.println("Операции инкремента и декремента:");

        {
            System.out.println("\nинкремент и декремент:");

            System.out.print("(i = 0; i < 10; ++i) ->\t");
            for (int i = 0; i < 10; ++i) // пример инкримента цикл for
            {
                System.out.print(i + "\t");
            }
            System.out.println();

            System.out.print("(d= 20; d > 10; --b) ->\t");
            int d = 20;
            while(d > 10){
                System.out.print(d + "\t");
                --d;
            }

            System.out.println("\n\nпрефикс и постфикс:");

            int x = 42;
            int y = ++x;
            System.out.println("(x = 42; y = ++x;) ->\t" + "x = " + x + " y = " + y);
            System.out.println("(x = x + 1; y = x;) -> равносильно выражениям выше");
            System.out.println("в этом случае певым действием производится префикс, а только потом присваивание\n");

            x = 42;
            y = x++;
            System.out.println("(x = 42; y = x++;) ->\t" + "x = " + x + " y = " + y);
            System.out.println("(y = x; x = x + 1;) -> равносильно выражениям выше");
            System.out.println("в этом случае певым действием производится присваивание, а только потом постфикс");

        }

        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------//


        /*
        Операции
        -Арифметические операции
        -Операция деления по модулю
        -Составные арифметические операции с присваиванием
        -Операции инкремента и декремента
        -Префикс и постфикс
        */
        //--------------------------------------------------------ШАБЛОНЫ-----------------------------------------------------------

        /*---шаблон---*/
        System.out.println("шаблон");



        System.out.println("/------------------------/"); System.out.println();
        //---------------------------------//

        //-------//
    }
}
