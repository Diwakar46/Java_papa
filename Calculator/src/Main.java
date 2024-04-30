import  java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
        System.out.println("!!!! Welcome to JavaCalculator !!!!!!!");
        System.out.println("Choose which operation you want to perform");
        System.out.println("Addition : 1");
        System.out.println("Substraction : 2");
        System.out.println("Multiplication : 3");
        System.out.println("Division : 4");
        System.out.println("Modulus : 5");
     int choosen = scanner.nextInt();
     calculator.calculate(choosen);
     scanner.close();
    }
}