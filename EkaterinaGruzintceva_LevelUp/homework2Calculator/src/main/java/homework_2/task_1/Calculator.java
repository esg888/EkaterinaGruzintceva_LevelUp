package homework_2.task_1;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startApplication();
    }

    public void startApplication() {
        double num1;
        double num2;
        int a;
        int b;
        int tp;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("\n* Для арифметических действий введите: +, -, *, / " +
                "\n* Для вычисления числа в степени введите s " +
                "\nпотом введите число, потом его степень, " +
                "\n* Для вычисления факториала введите f" +
                "\n* Для вычисления n-го члена последовательности Фибоначии введите n  ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print("Введите числа для суммирования: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                ans = num1 + num2;
                System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case '-':
                System.out.print("Введите числа для вычисления разности: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                ans = num1 - num2;
                System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case '*':
                System.out.print("Введите перемножаемые числа: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                ans = num1 * num2;
                System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case '/':
                System.out.print("Деление Введите делимое и делитель: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                ans = num1 / num2;
                System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case 's':
                System.out.print("введите число, потом его степень: ");
                a = reader.nextInt();
                b = reader.nextInt();
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result = result * a;
                }
                tp = result;
                System.out.printf(a + " в степени " + b + " будет " + tp);
                break;
            case 'f':
                System.out.print("введите число для факториала ");
                b = reader.nextInt();
                int rf = 1;
                for (int i = 1; i <= b; i++) {
                    rf = rf * i;
                }
                tp = rf;
                System.out.printf(" факториал числа " + b + " будет " + tp);
                break;
            case 'n':
                System.out.print("введите номер числа Фибоначчи ");
                b = reader.nextInt();
                int n0 = 1;
                int n1 = 1;
                int n2 = 2;
                for (int i = 3; i <= b; i++) {
                    n2 = n0 + n1;
                    n0 = n1;
                    n1 = n2;
                }
                tp = n2;
                System.out.printf(b + "-й член последовательности Фибоначчи равен " + tp);
                break;
            default:
                System.out.printf("Ошибка! Что-то пошло не так");
                return;
        }

    }
}
