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

    public static Integer task_5() {
        System.out.println(String.format("Задание №5: \nВычисление факториала числа."));
        Integer n = 0;
        Integer a = 4;
        for (Integer i = 1; i <= a; i++) {
            n *= i;
        }
        System.out.println(String.format("Ответ: %s", n));
        return n;
    }

    public static void task_6() {
        System.out.println(String.format("Задание №6: \nЧисла Фибоначчи."));
        Integer a = 0;
        Integer b = 1;
        System.out.print(a + " " + b + " ");
        for(Integer i = 3; i <= 15; i++) {
            Integer c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void task_7() {
    Integer I
}
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
    }
}