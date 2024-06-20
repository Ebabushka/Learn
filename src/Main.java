import java.util.Random;

class MyFirstParasha {
    public static int[] createMassive(int length, int minNumber, int maxNumber) {
        int[] massive = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            massive[i] = random.nextInt(maxNumber - minNumber) + minNumber;
        }
        return massive;
    }

    public static String printMassive(int[] massive) {
        String stringMassive = "";
        for (int i = 0; i < massive.length; i++) {
            stringMassive = stringMassive + massive[i] + " ";
        }
        return stringMassive;
    }

    public static void task_1() {
        System.out.println(String.format("Задание №1: Нахождение суммы всех элементов массива:"));
        int sumResult = 0;
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        for (int i = 0; i < massive.length; i++) {
            sumResult = sumResult + massive[i];
        }
        System.out.println(String.format("\nОтвет: %s.", sumResult));
    }

    public static void task_2() {
        System.out.println(String.format("Задание №2: Нахождение среднего арифметического значения четных элементов массива:"));
        int arithmeticMean = 0;
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        Integer firstNumberDigit = 0;
        Integer secondNumberDigit = 0;
    }

    public static void main(String[] args) {
        task_1();
        task_2();
    }
}
