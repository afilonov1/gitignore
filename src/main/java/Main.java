import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Hi mom!");
        System.out.println("Введите перое число");
        Double a = sc.nextDouble();
        System.out.println("Введите второе число");
        Double b = sc.nextDouble();
        System.out.println("Выберите операцию");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - деление");
        System.out.println("4 - умножение");

        Calculator calculator = new Calculator();
        Integer operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(calculator.add(a, b));
                break;
            case 2:
                System.out.println(calculator.sub(a, b));
                break;
            case 3:
                System.out.println(calculator.div(a, b));
                break;
            case 4:
                System.out.println(calculator.mul(a, b));
                break;
            default:
                System.out.println("Введено неверное число операции");
        }

    }
}