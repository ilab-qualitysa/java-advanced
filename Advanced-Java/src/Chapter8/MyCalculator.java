package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, age = 0;
        double sum = 0, difference = 0, product = 0, quotient = 0;
        String name = null;

        try{
            System.out.print("Please enter your name: ");
            name = sc.next();
            System.out.print("Please enter your age: ");
            age = sc.nextInt();
            System.out.print("Please enter number 1: ");
            num1 = sc.nextInt();
            System.out.print("Please enter number 2: ");
            num2 = sc.nextInt();

            sum = getSum(num1, num2);
            difference = getDifference(num1, num2);
            product = getProduct(num1, num2);
            quotient = Math.round(getQuotient(num1, num2));
        } catch (InputMismatchException ex) {
            System.err.println(ex.fillInStackTrace());
        } catch (ArithmeticException ex) {
            System.err.println("Cannot devide by zero");
        } finally {
            System.out.println("");
        }


        System.out.println("+++++++++++++++++++++++++++++\n" +  "Name: " + name + " Age: (" + age + ")\n" +
                "Number 1: " + num1 + "\n" +
                "Number 2: " + num2 + "\n" +
                "Sum of " + num1 + " + " + num2 + " = " + sum +
                "\nDifference: " + difference +
                "\nProduct: " + product +
                "\nQuotient: " + quotient);

        /**
         * Create 4 methods that will return:
         * sum
         * product
         * quotient
         * difference
         */

    }

    static double getSum(int num1, int num2) {
        return num1 + num2;
    }

    static double getDifference(int num1, int num2) {
        return num1 - num2;
    }

    static double getProduct(int num1, int num2) {
        return num1 * num2;
    }

    static double getQuotient(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
       /* if(num2 != 0) {
            return num1 / num2;
        }
        else return 0;*/

    }

}
