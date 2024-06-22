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
        StringBuilder stringMassive = new StringBuilder();
        for (int i = 0; i < massive.length; i++) {
            stringMassive.append(massive[i]).append(" ");
        }
        return stringMassive.toString();
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
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        int counter = 0;
        double sumEvenNumber = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                counter = counter + 1;
                sumEvenNumber = sumEvenNumber + massive[i];
            }
        }
        double arithmeticMean = sumEvenNumber / counter;
        System.out.print(String.format("\nОтвет: %s\n", arithmeticMean));
    }

    public static void task_3() {
        System.out.println(String.format("Задание №3: Нахождение номеров (индексов) простых чисел элементов массива:"));
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        StringBuilder index = new StringBuilder();
        for (int i = 0; i < massive.length; i++) {
            boolean isSimple = true;
            for (int j = 2; j <= Math.sqrt(massive[i]); j++) {
                if (massive[i] % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                index.append(i).append(" ");
            }
        }
        System.out.println(String.format("\nОтвет: %s", index));
    }

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }
}
