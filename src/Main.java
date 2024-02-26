
import java.util.Scanner;

class MyFirstParasha {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        System.out.println(String.format("(%s) * x^2 + (%s) * x + (%s) = 0", a, b, c));
        Double D = b * b - 4 * a * c;
        if (a == 0) {
            Double x = -c / b;
            System.out.println(String.format("x = %s", x));
        } else {
            if (D == 0) {
                Double x = -b / (2 * a);
                System.out.println(String.format("D = %s, \n x = %s", D, x));
            } else {
                if (D > 0) {
                    Double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    Double x2 = (-b - Math.sqrt(D)) / (2 * a);
                    System.out.printf(String.format("D = %s, \nx1 = %s, \nx2 = %s", D, x1, x2));
                } else {
                    if (D < 0) {
                        System.out.println("Нет действительных корней");
                    }
                }
            }
        }
    }
}