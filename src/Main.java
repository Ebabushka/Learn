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
        Double a = 6.0;
        Integer n = 5;
        if (n.equals(0)) {
            res.equals(1);
        } else {
            if (n > 0) {
                for (Integer i = 0; i < n; i++) {
                    res *= a;
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
            System.out.println(String.format("x = %s, \ny = %s,", x, y));
        }
    }

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }
}