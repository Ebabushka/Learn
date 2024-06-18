import java.util.Arrays;
import java.util.Random;

class MyFirstParasha {
    public static void main(String[] args) {
        int length = 10;
        int[] massive = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            massive[i] = random.nextInt(201) - 100;
        }
        System.out.println(Arrays.toString(massive));
        int min, max;
        min = max = massive[0];
        for (int i = 1; i < length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
            if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println(min + " " + max);
    }
}