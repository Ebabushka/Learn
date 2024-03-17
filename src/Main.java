class MyFirstParasha {
    public static void task_1() {
        System.out.println(String.format("Задание №1: \nВывод квадратов натуральных чисел."));
        Integer i = 0;
        Integer x = i + 1;
        Integer n = 50;
        while (x*x < n) {
            System.out.println(String.format("Ответ: %s", (Math.pow(x, 2))));
            x ++;
        }
    }
    public static void task_2() {
        System.out.println(String.format("Задание №2: \nКубы чисел от A до B."));
        Integer b = 6;
        for (Integer a = 0; a <= b; a ++) {
            System.out.println(String.format("Ответ: %s", (Math.pow(a, 3))));
        }
    }
    public static void main(String[] args) {
        task_1();
        task_2();
    }
}