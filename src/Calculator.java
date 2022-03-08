import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        do{
            double outcome;
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an operator (+,-,*,/) or press 0 to exit : ");
            char operator = scan.next().charAt(0);
            if(operator!='0'){
                if (operator=='+' || operator=='-' || operator=='*' || operator=='/') {
                    System.out.println("Enter the first number : ");
                    double num1 = scan.nextDouble();
                    System.out.println("Enter the second number : ");
                    double num2 = scan.nextDouble();

                    switch (operator) {
                        case '+' -> {
                            outcome = num1 + num2;
                            System.out.println(num1 + " + " + num2 + " = " + outcome);
                        }
                        case '-' -> {
                            outcome = num1 - num2;
                            System.out.println(num1 + " - " + num2 + " = " + outcome);
                        }
                        case '*' -> {
                            outcome = num1 * num2;
                            System.out.println(num1 + " * " + num2 + " = " + outcome);
                        }
                        case '/' -> {
                            outcome = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + outcome);
                        }
                    }
                }
                else
                    System.out.println("You have entered an invalid operator !!!! ");}
            else
                System.exit(0);
        }while(true);

    }
}
