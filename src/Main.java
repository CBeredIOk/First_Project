
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float num1 = scan.nextFloat();
        System.out.println("Enter 2st number: ");
        float num2 = scan.nextFloat();
        System.out.println("Choose one of sign:+; -; *; /; %");
        String sign = scan.next();
        float res = 0;

        switch (sign) {
            case "*":
                res = num1 * num2;
                System.out.println("Result \"" + sign + "\": " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Result \"" + sign + "\": " + res);
                break;
            case "+":
                res = num1 + num2;
                System.out.println("Result \"" + sign + "\": " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result \"" + sign + "\": " + res);
                break;
            case "%":
                res = num1 % num2;
                System.out.println("Result \"" + sign + "\": " + res);
            default: System.out.println("Wrong input");
        }
    }

}
