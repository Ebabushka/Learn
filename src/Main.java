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
        Integer number = 42542;
        Integer deleteDigit = 2;
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
        System.out.println(String.format("Число после удаления цифры: %s", resultNumber));
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
    }
}