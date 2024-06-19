import java.util.Arrays;
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

    public static int[] printMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        return massive;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Задание №1: Нахождение суммы всех элементов массива:"));
        int sumResult = 0;
        int[] massive = createMassive(10, 5, 20);
        printMassive(massive);
        for (int i = 0; i < massive.length; i++) {
            sumResult = sumResult + massive[i];
        }
        System.out.println(String.format("\nОтвет: %s.", sumResult));
    }

}
