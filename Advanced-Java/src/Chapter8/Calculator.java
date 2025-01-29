package Chapter8;

public class Calculator {
    private int num1, num2;

    public Calculator(int num1, int num2) {
        setNum1(num1);
        setNum2(num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Second number cannot be zero");
        }
        this.num2 = num2;
    }

    public double getSum() {
        return this.num1 + this.num2;
    }

    public double getDifference() {
        return this.num1 - this.num2;
    }

    public double getProduct() {
        return this.num1 * this.num2;
    }

    public double getQuotient() throws ArithmeticException {
        return this.num1 / this.num2;
       /* if(num2 != 0) {
            return num1 / num2;
        }
        else return 0;*/

    }

    @Override
    public String toString() {
        return "Number 1: " + num1 + "\n" +
                "Number 2: " + num2 + "\n" +
                "Sum of " + num1 + " + " + num2 + " = " + getSum() +
                "\nDifference: " + getDifference() +
                "\nProduct: " + getProduct() +
                "\nQuotient: " + getQuotient();
    }
}
