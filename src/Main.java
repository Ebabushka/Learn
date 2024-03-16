class MyFirstParasha {

    public static void task1() {
        Double a = 11.0;
        Double b = 9.0;
        Double c = 12.0;
        System.out.println(String.format("Задание №1: \nНайти наибольшее из трех чисел: a = %s, b = %s, c = %s.", +a, +b, +c));
        if (a > b && a > c) {
            System.out.println(String.format("Ответ: a = %s", a));
        } else {
            if (b > a && b > c) {
                System.out.println(String.format("Ответ: b = %s", b));
            } else {
                System.out.println(String.format("Ответ: c = %s", c));
            }
        }
    }

    public static void task2() {
        Double a = 4.0;
        Double b = 5.0;
        Double c = 4.0;
        System.out.println(String.format("Задание №2: \n среднее из трех чисел: a = %s, b = %s, c = %s.", +a, +b, +c));
        if (a.equals(b) || a.equals(c) || b.equals(c)) {
            System.out.println(String.format("Ошибка"));
        } else {
            if (a < b && a > c && a > b && a < c) {
                System.out.println(String.format("Ответ: %s", a));
            } else {
                if (b < a && b > c && b > a && b < c) {
                    System.out.println(String.format("Ответ: %s", b));
                } else {
                    System.out.println(String.format("Ответ: %s", c));
                }
            }
        }
    }

    public static void task3() {
        Integer a = 4;
        Integer b = 4;
        System.out.println(String.format("Задание №3: \nВывести нечетное число из двух чисел: a = %s, b = %s.", +a, +b));
        if (a % 2 != 0) {
            System.out.println(String.format("Ответ: a = %s", a));
        } else {
            if (b % 2 != 0) {
                System.out.println(String.format("Ответ: b = %s", b));
            } else {
                System.out.println(String.format("Нет нечетных чисел"));
            }
        }
    }

    public static void task4() {
        Integer a = 5;
        Integer b = 4;
        System.out.println(String.format("Задание №4: \nПроверка кратности числа: a = %s и b = %s.", a, b));
        if ((a % b) == 0) {
            System.out.println(String.format("Первое число кратно второму."));
        } else {
            System.out.println(String.format("Первое число некратно второму. \nОстаок: %d", a % b));
        }
    }

    public static void task5() {
        System.out.println(String.format("Задание №5: \nВычислить значения функции: y=f(x)"));
        Double x = -4.0;
        if (x > 0) {
            Double y = x - 2;
            System.out.println(String.format("Ответ: y = %s", y));
        } else {
            if (x == 0) {
                Double y = 0.0;
                System.out.println(String.format("Ответ: y = %s", y));
            } else {
                Double y = Math.abs(x);
                System.out.println(String.format("Ответ: y = %s", y));
            }
        }
    }

    public static void task6() {
        System.out.println(String.format("Задание №6: \nОпределение четверти на координатной плоскости"));
        Double x = 0.0;
        Double y = 8.0;
        if (x == 0) {
            System.out.println(String.format("Точка лежит на оси: X"));
        } else {
            if (y == 0) {
                System.out.println(String.format("Точка лежит на оси: Y"));
            } else {
                if (x > 0 && y > 0) {
                    System.out.println(String.format("Ответ: I четверть"));
                } else {
                    if (x < 0 && y > 0) {
                        System.out.println(String.format("Ответ: II четверть"));
                    } else {
                        if (x < 0 && y < 0) {
                            System.out.println(String.format("Ответ: III четверть"));
                        } else {
                            if (x > 0 && y < 0) {
                                System.out.println(String.format("Ответ: IV четверть"));
                            }
                        }
                    }
                }
            }
        }
    }

    public static void task7() {
        System.out.println(String.format("Задание №7 \nОпределить возможность существования треугольника по сторонам"));
        Double a = 4.0;
        Double b = 5.0;
        Double c = 6.0;
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println(String.format("Ответ: Треугольник существует"));
        } else {
            System.out.println(String.format("Ответ: Треугольник не существует"));
        }
    }

    public static void task8() {
        System.out.println(String.format("Задача №8 \nПринадлежит ли точка кругу с центром в начале координат"));
        Double x = 4.0;
        Double y = 5.0;
        Double r = 3.0;
        Double hyp = Math.sqrt(x * x + y * y);
        if (hyp <= r) {
            System.out.println(String.format("Точка принадлежит кругу"));
        } else {
            System.out.println(String.format("Точка не принадлежит кругу"));
        }
    }

    public static void task9() {
        Integer pl = 1;
        System.out.println(String.format("Задание №9 \nВычисление площади геометрических фигур"));
        if (pl == 1) {
            Double a = 4.0;
            Double b = 2.0;
            Double s_pr = a * b;
            System.out.println(String.format("Площадь прямоугольника: = %s", s_pr));
        } else {
            if (pl == 2) {
                Double d = 4.0;
                Double h = 8.0;
                Double s_tr = 1 / 2 * d * h;
                System.out.println(String.format("Площадь треугольника: = %s", s_tr));
            } else {
                if (pl == 3) {
                    Double r = 4.0;
                    Double s_kr = 4 * Math.PI * r * r;
                    System.out.println(String.format("Площадь круга: s_k r= %s", s_kr));
                }
            }
        }
    }

    public static void task10() {
        Integer year = 2000;
        System.out.println(String.format("Задание №10 \nОпределить високосный год или нет: %s.", year));
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(String.format("Год: %s - является вискокосным.", year));
        } else {
            System.out.println(String.format("Год: %s не является вискокосным.", year));
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
}
