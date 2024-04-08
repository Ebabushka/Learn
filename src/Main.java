import java.util.Scanner;
import java.lang.Math;

class MyFirstParasha {
    public static void task_1() {
        System.out.println(String.format("Задание №1: \nВывод квадратов натуральных чисел."));
        Integer i = 0;
        Integer x = i + 1;
        Integer n = 50;
        while (x * x < n) {
            System.out.println(String.format("Ответ: %s", (Math.pow(x, 2))));
            x++;
        }
    }

    public static void task_2() {
        System.out.println(String.format("Задание №2: \nКубы чисел от A до B."));
        Integer b = 6;
        for (Integer a = 0; a <= b; a++) {
            System.out.println(String.format("Ответ: %s", (Math.pow(a, 3))));
        }
    }

    public static Double task_3() {
        System.out.println(String.format("Задание №3: \nВозведение числа в степень."));
        Double res = 1.0;
        Double a = -6.0;
        Integer n = 5;
        if (n.equals(0)) {
            res.equals(1);
        } else {
            if (n > 0) {
                for (Integer i = 0; i < n; i++) {
                    res = res * a;
                }
            } else {
                for (Integer i = n; i < 0; i++) {
                    res = 1 / (res * a);
                }
            }
        }
        System.out.println(String.format("Ответ: %s", res));
        return res;
    }

    public static void task_4() {
        System.out.println(String.format("Задание №5: Вывести таблицу значений функции y = 5 - x^2/2 на отрезке [-5;5] с шагом 0,5"));
        Double a = -5.0;
        Double b = 5.0;
        Double st = 0.5;
        for (Double x = a; x <= b; x += st) {
            Double y = 5 - x * x / 2;
            System.out.println(String.format("x: %s; y: %s;", x, y));
        }
    }

    public static Integer task_5() {
        System.out.println(String.format("Задание №5: \nВычисление факториала числа."));
        Integer n = 0;
        Integer a = 4;
        for (Integer i = 1; i <= a; i++) {
            n = n * i;
        }
        System.out.println(String.format("Ответ: %s", n));
        return n;
    }

    public static void task_6() {
        System.out.println(String.format("Задание №6: \nЧисла Фибоначчи."));
        Integer a = 0;
        Integer b = 1;
        System.out.print(a + " " + b + " ");
        for (Integer i = 3; i <= 15; i++) {
            Integer c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void task_7() {
        System.out.println(String.format("\nЗадание №7: \nПроверка гипотезы Сиракуз."));
        for (Integer i = 20; i <= 30; i++) {
            Integer res = i;
            while (res != 1) {
                if (res % 2 == 0) {
                    res = res / 2;
                } else {
                    res = (res * 3 + 1) / 2;
                }
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

    public static void task_8() {
        System.out.println(String.format("Задание №8: \nИзвлечение цифр числа."));
        Integer number = 1458;
        while (number > 0) {
            System.out.println(String.format("Ответ: %s.", number % 10));
            number = number / 10;
        }
    }

    public static void task_9() {
        Integer number = 29256;
        System.out.println(String.format("Задание №9: \nНайти сумму четных цифр числа: %s.", number));
        Integer firstNumberDigit = 0;
        Integer secondNumberDigit = 0;
        while (number > 0) {
            firstNumberDigit = number % 10;
            if (firstNumberDigit % 2 == 0) {
                secondNumberDigit = secondNumberDigit + firstNumberDigit;
            }
            number = number / 10;
        }
        System.out.println(String.format("Ответ: %s.", secondNumberDigit));
    }

    public static void task_10() {
        Integer number = 2548;
        System.out.println(String.format("Задание №10: \nКоличество четных и нечетных цифр числа: %s.", number));
        Integer evenNumber = 0;
        Integer unevenNumber = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                evenNumber = evenNumber + 1;
            } else {
                unevenNumber = unevenNumber + 1;
            }
            number = number / 10;
        }
        System.out.println(String.format("Количество четныех чисел: %s; \nКоличество нечетных чисел: %s.", evenNumber, unevenNumber));
    }

    public static void task_11() {
        Integer number = 1458;
        System.out.println(String.format("Задание №11: \nСумма и произведение цифр числа %s.", number));
        Integer numberDigit = 0;
        Integer sum = 0;
        Integer multiply = 1;
        while (number > 0) {
            numberDigit = number % 10;
            sum = sum + numberDigit;
            multiply = multiply * numberDigit;
            number = number / 10;
        }
        System.out.println(String.format("Сумма цифр числа: %s; \nПроизведение цифр числа: %s. ", sum, multiply));
    }

    public static void task_12() {
        Integer number = 2459;
        Integer maxNumberDigit = 0;
        System.out.println(String.format("Задание №12: \nИзвлечение цифр числа: %s.", number));
        if (number < 0) {
            number = Math.abs(number);
        } else {
            while (number > 0) {
                if (number % 10 > maxNumberDigit) {
                    maxNumberDigit = number % 10;
                }
                number = number / 10;
            }
            System.out.println(String.format("Максимальное значение: %s", maxNumberDigit));
        }
    }

    public static void task_13() {
        Integer number = 9287543;
        System.out.println(String.format("Задание № 13: \nСумма первой и последней цифр числа: %s.", number));
        Integer lastNumberDigit = 0;
        Integer firstNumberDigit = 0;
        lastNumberDigit = number % 10;
        number = number / 10;
        while (number > 0) {
            firstNumberDigit = number % 10;
            number = number / 10;
        }
        Integer sumNumberDigit = lastNumberDigit + firstNumberDigit;
        System.out.println(String.format("Ответ: %s", sumNumberDigit));
    }

    public static void task_14() {
        Integer number = 100;
        System.out.println(String.format("Задание № 14: \nПереворот числа: %s.", number));
        Integer invNumber = 0;
        while (number > 0) {
            Integer a = number % 10;
            invNumber = invNumber * 10 + a;
            number = number / 10;
        }
        System.out.println(String.format("Ответ: %s", invNumber));
    }

    public static void task_15() {
        Integer firstNumber = 123;
        Integer secondNumber = 234;
        Integer copySecondNumber = secondNumber;
        System.out.println(String.format("Задание № 15: \nНайти одинаковые цифры двух чисел: %s и %s.", firstNumber, secondNumber));
        Integer firstNumberDigit = 0;
        Integer secondNumberDigit = 0;
        while (firstNumber > 0) {
            firstNumberDigit = firstNumber % 10;
            firstNumber = firstNumber / 10;
            secondNumber = copySecondNumber;
            while (secondNumber > 0) {
                secondNumberDigit = secondNumber % 10;
                secondNumber = secondNumber / 10;
                if (firstNumberDigit == secondNumberDigit) {
                    System.out.println(String.format("Ответ: %s.", secondNumberDigit));
                }
            }
        }
    }

    public static void task_16() {
        System.out.println(String.format("Задание №16: \nУдалить цифру из числа."));
        Integer number = 42542;
        Integer deleteDigit = 5;
        Integer digitNumber = 0;
        Integer resultNumber = 0;
        Integer multiplier = 1;
        while (number != 0) {
            digitNumber = number % 10;
            number = number / 10;
            if (digitNumber != deleteDigit) {
                resultNumber = resultNumber + digitNumber * multiplier;
                multiplier = multiplier * 10;
            }
        }
        System.out.println(String.format("Число после удаления цифры: %s.", resultNumber));
    }

    public static void task_17() {
        System.out.println(String.format("Задание №17: \nОпределить количество простых чисел."));
        Integer counter = 0;
        Integer number = 25;
        for (Integer i = 2; i <= Math.sqrt(number); i++) {
            if (number % i != 0) {
                counter = counter + 1;
            }
        }
        System.out.println(String.format("Количество простых чисел: %s.", counter));
    }

    public static void task_18() {
        System.out.println(String.format("Задание №18: \nВывести делители чисел в промежутке от 100 до 110."));
        Integer end = 110;
        for (Integer beginning = 100; beginning <= end; beginning++) {
            for (Integer i = 1; i <= end / 2; i++) {
                if (beginning % i == 0) {
                    System.out.print(beginning + ":" + " " + i);
                }

            }
            System.out.println();
        }
    }

    public static void task_19() {
        System.out.println(String.format("Задание №19: \nСовершенные числа."));
        Integer number = 10000;
        for (Integer i = 2; i <= number; i++) {
            Integer sum = 0;
            Integer j = 1;
            while (j <= i / 2) {
                if (i % j == 0) {
                    sum = sum + j;
                }
                j++;
            }
            if (sum == i) {
                System.out.println(String.format("%s - является совершенным числом.", i));
            }
        }
    }

    public static void task_20() {
        System.out.println(String.format("Задание №20: \nВычисление сумм различных рядов чисел  1, -0.5, 0.25, -0.125, ..."));
        Double sumNthElementsSeries = 0.0;
        Double values = 1.0;
        Integer nthRowElement = 3;
        for (Integer firstElementRow = 1; firstElementRow <= nthRowElement; firstElementRow++) {
            sumNthElementsSeries = sumNthElementsSeries + values;
            values = -values / 2;
        }
        System.out.println(String.format("Сумма %s элементов ряда: %s.", nthRowElement, sumNthElementsSeries));
    }

    public static void task_21() {
        System.out.println(String.format("Задание №21: \nВывод на экран таблицы символов ASCII."));
        for (int i = 32; i <= 126; i++) {
            System.out.println(String.format("%s: %s", i, (char) i));
        }
    }

    public static void task_22() {
        System.out.println(String.format("Задание №22: \nТаблица умножения."));
        for (Integer colum_1 = 1; colum_1 <= 9; colum_1++) {
            for (Integer colum_2 = 1; colum_2 <= 9; colum_2++) {
                System.out.print(colum_1 + " x " + colum_2 + " = " + (colum_1 * colum_2) + "\t");
            }
            System.out.println();
        }
    }

    public static void task_23() {
        Integer limitNumber = 5;
        Integer requiredAmount = 10;
        System.out.println(String.format("Задание №23: \nКомбинации из трех чисел, дающие в сумме заданное число: %s.", requiredAmount));
        for (Integer number_1 = 1; number_1 <= limitNumber; number_1++) {
            for (Integer number_2 = 1; number_2 <= limitNumber; number_2++) {
                for (Integer number_3 = 1; number_3 <= limitNumber; number_3++) {
                    Integer sum = number_1 + number_2 + number_3;
                    if (sum.equals(requiredAmount)) {
                        System.out.println(String.format("Комбинация чисел: %s; %s; %s.", number_1, number_2, number_3));
                    }
                }
            }
        }
    }

    public static void task_24() {
        Integer a = 10;
        Integer b = 5;
        Integer c = 2;
        Integer result_1 = 100;
        Integer result_2 = 30;
        System.out.println(String.format("Решить систему уравнений: \n%s * x + %s * y + %s * z = %s \nx + y + z = %s.", a, b, c, result_1, result_2));
        for (Double x = 0.0; x <= result_1 / a; x++) {
            for (Double y = 0.0; y <= result_1 / b; y++) {
                for (Double z = 0.0; z <= result_1 / c; z++) {
                    if (a * x + b * y + c * z == result_1 && x + y + z == result_2) {
                        System.out.println(String.format("Корни уравнений: \nx = %s; y = %s; z = %s", x, y, z));
                    }
                }
            }
        }
    }

    public static void task_25() {
        System.out.println(String.format("Задание №25: \nПростейший калькулятор."));
        double a = 4;
        double b = 6;
        for (int i = 42; i <= 47; i++) {
            if ((char) i == (char) 42) {

                System.out.println(String.format("Умножение: \nОтвет: %s.", a * b));
            } else {
                if ((char) i == (char) 43) {
                    System.out.println(String.format("Сложение: \nОтвет: %s.", a + b));
                } else {
                    if ((char) i == (char) 45) {
                        System.out.println(String.format("Вычетание: \nОтвет: %s.", a - b));
                    } else {
                        if ((char) i == (char) 47) {
                            System.out.println(String.format("Деление: \nОтвет: %s.", a / b));
                        }
                    }
                }
            }
        }
    }

    public static void task_26() {
        System.out.println(String.format("Задание №26: \nПрограмма угадай число."));
        Integer hiddenNumber = 0;
        Integer enteredNumber = 0;
        Scanner input = new Scanner(System.in);
        hiddenNumber = (int) Math.floor(Math.random() * 100);
        while (enteredNumber != hiddenNumber) {
            System.out.println(String.format("Введите число: "));
            enteredNumber = input.nextInt();
            if (enteredNumber > hiddenNumber) {
                System.out.println(String.format("Загаданное число меньше."));
            } else {
                if (enteredNumber < hiddenNumber) {
                    System.out.println(String.format("Загаданное число больше."));
                } else {
                    System.out.println(String.format("Вы угадали!"));
                }
            }
        }
    }

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
        task_9();
        task_10();
        task_11();
        task_12();
        task_13();
        task_14();
        task_15();
        task_16();
        task_17();
        task_18();
        task_19();
        task_20();
        task_21();
        task_22();
        task_23();
        task_24();
        task_25();
        task_26();
    }
}