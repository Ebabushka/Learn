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

    public static void task_4() {
        System.out.println(String.format("Задание №4: Определение индекса элемента массива, равного некоторому числу:"));
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        StringBuilder index = new StringBuilder();
        int enterNumber = 15;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == enterNumber) {
                index.append(i).append(" ");
            }
        }
        if (index.length() == 0) {
            System.out.println(String.format("\nНет такого числа."));
        } else {
            System.out.println(String.format("\nОтвет: %s", index));
        }
    }

    public static void task_5() {
        System.out.println(String.format("Задание №5:Определение максимального элемента массива:"));
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        int maxNumber = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > maxNumber) {
                maxNumber = massive[i];
            }
        }
        System.out.println(String.format("\nОтвет: %s", maxNumber));
    }

    public static void task_6() {
        System.out.println(String.format("Задание №6:Удаление из массива k-го элемента со сдвигом всех расположенных справа от него элементов на одну позицию влево"));
        int[] massive = createMassive(10, 5, 20);
        int[] newMassive = new int[massive.length - 1];
        System.out.print(printMassive(massive));
        int deleteIndex = 0;
        for (int i = 0; i < massive.length - 1; i++) {
            if (i < deleteIndex) {
                newMassive[i] = massive[i];
            } else {
                if (i >= deleteIndex) {
                    newMassive[i] = massive[i + 1];
                }
            }
        }
        System.out.println(String.format("\nОтвет: %s", printMassive(newMassive)));
    }

    public static void task_7() {
        System.out.println(String.format("Задание №7: Перемещение элементов массива: первый элемент массива записать на место последнего, при этом сдвинув второй, третий, …, последний элементы на одну позицию влево:"));
        int[] massive = createMassive(10, 5, 20);
        int[] newMassive = new int[massive.length];
        System.out.print(printMassive(massive));
        newMassive[massive.length - 1] = massive[0];
        for (int i = massive.length - 1; i >= 0; i--) {
            if (i < massive.length - 1) {
                newMassive[i] = massive[i + 1];
            } else {
                if (i == massive[massive.length - 1]) {
                    newMassive[i] = massive[0];
                }
            }
        }
        System.out.println(String.format("\nОтвет: %s", printMassive(newMassive)));
    }

    public static void task_8() {
        System.out.println(String.format("Задание №8: Вставка в массив заданного числа на k-е место со сдвигом k-го, (k + 1)-го, (k + 2)-го, …, последнего элемента на одну позицию вправо:"));
        int[] massive = createMassive(10, 5, 20);
        int[] newMassive = new int[massive.length + 1];
        System.out.print(printMassive(massive));
        int number = 16;
        int k = 5;
        for (int i = 0; i < massive.length + 1; i++) {
            if (i < k) {
                newMassive[i] = massive[i];
            } else {
                if (i == k) {
                    newMassive[k] = number;
                } else {
                    newMassive[i] = massive[i - 1];
                }
            }
        }
        System.out.println(String.format("\nОтвет: %s", printMassive(newMassive)));
    }

    public static void task_9() {
        System.out.println(String.format("Задание №9: Проверка массива на упорядоченность по неубыванию, т. е. определение того, верно ли, что каждый его элемент, начиная со второго, не меньше предыдущего:"));
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] > massive[i + 1]) {
                System.out.println(String.format("Есть последовательность."));
            } else {
            }
        }
    }

    public static void task_10() {
        System.out.println(String.format("Задание №10:Проверка наличия в массиве одинаковых элементов:"));
        int[] massive = createMassive(10, 5, 20);
        System.out.print(printMassive(massive));
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] == massive[i + 1]) {
                System.out.println(String.format("Похожие элементы массива: %s, %s", massive[i], massive[i + 1]));
            } else {
                System.out.println(String.format("Похожие элементы массива не найдено"));
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
    }
}
