import java.util.Scanner;

public class Trade {
    public static double FahrenheittoCelsius(double F) {
        double C = (F - 32) / 1.8;
        return C;
    }

    public static double CelsiustoFahrenheit(double C) {
        double F = C * 1.8 + 32;
        return F;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose 1 or 2 or 3");
        System.out.println("1. FahrenheittoCelsius ");
        System.out.println("2. CelsiustoFahrenheit ");
        System.out.println("3. Exit");
        int x = 0;
        do {
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter number F ");
                    double F = scanner.nextDouble();
                    System.out.println("F trade C is" + FahrenheittoCelsius(F));
                    break;
                case 2:
                    System.out.println("Enter number C");
                    double C = scanner.nextDouble();
                    System.out.println("C Trade F is " + CelsiustoFahrenheit(C));
                    break;
                default:
                    System.out.println("Enter number 1 or 2 or 3");

            }
            System.out.println("Enter 1 or 2 or 3");
        } while (x != 3);
    }
}
