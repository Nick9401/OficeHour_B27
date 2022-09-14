package day03_07_13_2022;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 14;
        char ch = '/';
        double result = 0;

        switch (ch) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result=0;
                System.err.println("invalid operator");
                break;

        }
        System.out.println("result = " + result);
    }

}
