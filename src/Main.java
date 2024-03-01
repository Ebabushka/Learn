import java.util.Scanner;

class MyFirstParasha {

    public static void task1() {
        Double a = 11.0;
        Double b = 9.0;
        Double c = 10.0;
        System.out.println(String.format("Задание №1"));
        System.out.println(String.format("Найти наибольшее из трех чисел: a = %s, b = %s, c = %s.", +a, +b, +c));
        if (a > b && a > c) {
            System.out.println(String.format("Ответ: a = %s", +a));
        } else {
            if (b > a && b > c) {
                System.out.println(String.format("Ответ: b = %s", +b));
            } else {
                if (c > a && c > b) {
                    System.out.println(String.format("Ответ: c = %s", +c));
                }
            }
        }
    }

    public static void task2() {
        Double a = 4.0;
        Double b = 5.0;
        Double c = 4.0;
        System.out.println(String.format("Задание №2"));
        System.out.println(String.format("Найти среднее из трех чисел: a = %s, b = %s, c = %s.", +a, +b, +c));
        if (a.equals(b) || a.equals(c) || b.equals(c)) {
            System.out.println(String.format("Ошибка"));
        } else {
            if (a < b && a > c) {
            } else {
                if (a > b && a < c) {
                    System.out.println(String.format("Ответ: a = %s", +a));
                } else {
                    if (b < a && b > c) {
                    } else {
                        if (b > a && b < c) {
                            System.out.println(String.format("Ответ: b = %s", +b));
                        } else {
                            if (c < a && c > b) {
                            } else {
                                if (c > a && c < b) {
                                    System.out.println(String.format("Ответ: c = %s", +c));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void task3() {
        int a = 4;
        int b = 4;
        System.out.println(String.format("Задание №3"));
        System.out.println(String.format("Вывести нечетное число из двух чисел: a = %s, b = %s.", +a, +b));
        if (a % 2 != 0) {
            System.out.println(String.format("Ответ: a = %s", +a));
        } else {
            if (b % 2 != 0) {
                System.out.println(String.format("Ответ: b = %s", +b));
            } else {
                System.out.println(String.format("Нет нечетных чисел"));
            }
        }
    }
    public static void task4() {
        int a = 5;
        int b = 4;
        System.out.println(String.format("Задание №4"));
        System.out.println(String.format("Проверка кратности числа: a = %s и b = %s.", +a, +b));
        if ((a % b) == 0) {
            System.out.println(String.format("Первое число кратно второму"));
        } else {
            System.out.println(String.format("Второе число некратно второму"));
            System.out.println(String.format("Остаток: %d", a % b));
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
