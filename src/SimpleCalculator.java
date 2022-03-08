import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String [] args) {
        System.out.println("Hello!,\nWhat do you want to do ?\n");
        do{
            double outcome;
            System.out.println("Press number 1 for Summation (+)\nPress number 2 for Subtraction (-)\nPress number 3 for Multiplication (*)\nPress number 4 for Division (/)\nPress 0 to Exit \n\nPress your option....");
            CalculatorOperators operator = new CalculatorOperators();
            Scanner scan = new Scanner(System.in);
            int SelectOperator = scan.nextInt();
            if(SelectOperator!=0){
                if (SelectOperator==1 || SelectOperator==2 || SelectOperator==3 || SelectOperator==4) {
                    System.out.println("Enter the first number : ");
                    double num1 = scan.nextDouble();
                    System.out.println("Enter the second number : ");
                    double num2 = scan.nextDouble();

                    switch (SelectOperator) {
                        case 1 -> {
                            outcome = operator.summation(num1,num2);
                            System.out.println(num1 + " + " + num2 + " = " + outcome + "\n");
                        }
                        case 2 -> {
                            outcome = operator.subtraction(num1,num2);
                            System.out.println(num1 + " - " + num2 + " = " + outcome + "\n");
                        }
                        case 3 -> {
                            outcome = operator.multiplication(num1,num2);
                            System.out.println(num1 + " * " + num2 + " = " + outcome + "\n");
                        }
                        case 4 -> {
                            outcome = operator.division(num1,num2);
                            System.out.println(num1 + " / " + num2 + " = " + outcome + "\n");
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
