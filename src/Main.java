import java.util.Scanner;
class MyFirstParasha {
    public static void main (String [] args) {
        double x, x1, x2, D;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение переменной: a");
        double a = s.nextInt();
        System.out.println("Вы ввели "+a);
        System.out.println("Введите значение переменной: b");
        double b = s.nextInt();
        System.out.println("Вы ввели: "+b);
        System.out.println("Введите значение переменной: c");
        double c = s.nextInt();
        System.out.println("Вы ввели: "+c);
        D = b*b - 4 * a * c;
        if (a == 0) {
            x = -c / b;
            System.out.printf ("x = %s", x);
        }

        else if (D == 0) {
            x = x1 = x2 = -b / (2 * a);
            System.out.printf ("D = %s, \n x = %s", D, x);
        }
        else if (D > 0) {
            x1 = (-b+Math.sqrt(D))/(2 * a);
            x2 = (-b-Math.sqrt(D))/(2 * a);
            System.out.printf ("D = %s, \nx1 = %s, \nx2 = %s", D, x1, x2);
        }
        else if (D < 0) {
            System.out.println ("Нет действительных корней");
        }
    }
}