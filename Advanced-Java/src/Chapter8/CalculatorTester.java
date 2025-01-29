package Chapter8;

public class CalculatorTester {
    public static void main(String[] args) {

        Calculator calc = null;
        try{
            calc = new Calculator(8,5);
            //calc.setNum2(0);
            System.out.println(calc.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
