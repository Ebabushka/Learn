import java.util.Arrays;
import java.util.Random;

class MyFirstParasha {
    public static void main(String[] args) {
        int length = 10;
        int[] massive = new int[length];
        int minNumber = 10;
        int maxNumber = 40;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            massive[i] = random.nextInt(maxNumber-minNumber)+minNumber;
        }
        System.out.println(Arrays.toString(massive));
    }
}