import java.util.Scanner;

public class Calculator {
void calculate(int choosen){
    Scanner scanner = new Scanner(System.in);
    double num1,num2;
    switch (choosen){
        case 1:
            System.out.println("You have Choosen Addtion");
            System.out.println("Enter Your numbers ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Addition Result : "+ (num1+num2)) ;
            break;
        case 2:
            System.out.println("You have Choosen Substraction");
            System.out.println("Enter Your numbers ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Substraction Result : "+ (num1-num2)) ;
            break;
        case 3:
            System.out.println("You have Choosen Multiplication");
            System.out.println("Enter Your numbers ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Multiplication Result : "+ (num1*num2)) ;
            break;
        case 4:
            System.out.println("You have Choosen Division");
            System.out.println("Enter Your numbers ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Division Result : "+ ((double)num1/num2)) ;
            break;
        case 5:
            System.out.println("You have Choosen Modulus");
            System.out.println("Enter Your numbers ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Division Result : "+ ((double)num1%num2)) ;
            break;
        default:if(choosen>5 || choosen<= 0  ){
            System.out.println("Please Enter a valid value Ranging from 1 to 5");

        }
    }
    scanner.close();
}

}
