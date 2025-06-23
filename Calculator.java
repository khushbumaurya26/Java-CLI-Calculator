import java.util.Scanner;

class Calculator {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Choose operation: + - * / or type 'exit' to quit");
      String input = sc.next();

      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Exiting Calculator. Thank you");
        break;
      }

      System.out.println("Enter first number: ");
      double a = sc.nextDouble();

      System.out.println("Enter second number: ");
      double b = sc.nextDouble();

      switch (input) {
        case "+" -> System.out.println("Result: " + add(a, b));
        case "-" -> System.out.println("Result: " + subtract(a, b));
        case "*" -> System.out.println("Result: " + multiply(a, b));
        case "/" -> {
          if (b != 0)
            System.out.println("Result: " + divide(a, b));
          else
            System.out.println("Error: Cannot divide by zero");
        }
        default -> System.out.println("Invalid opertion");
      }
    }

    sc.close();

  }

  static double add(double x, double y) {
    return x + y;
  }

  static double subtract(double x, double y) {
    return x - y;
  }

  static double multiply(double x, double y) {
    return x * y;
  }

  static double divide(double x, double y) {
    return x / y;
  }

}