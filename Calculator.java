import java.util.Scanner;

public class Calculator {
    private static double addition (double a, double b) {
        double answer = a + b;
        return answer;
    }
    private static double subtraction (double a, double b) {
        double answer = a - b;
        return answer;
    }
    private static double multiplication (double a, double b) {
        double answer = a * b;
        return answer;
    }
    private static double division (double a, double b) {
        double answer = a / b;
        return answer;
    }
    private static double square (double a) {
        double answer = Math.pow(a, 2);
        return answer;
    }
    private static double factorial(double a) {
        double answer=1;
        for(int x=1;x<(a+1);x++){
           answer *= x;
        }
        return answer;
    }
    private static String choice(){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Choose the operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Power\n6.Factorial");
        String sign = Obj.nextLine();
        return sign;
    }
    private static int numb(){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = Obj.nextInt();
        return value;
    }
    public static void main(String[] args) {
        String choice = choice();
        double firstValue = numb();
        double secondValue;
        double answer = 0;
        switch (choice) {
            case "1":
                secondValue = numb();
                answer = addition(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "2":
                secondValue = numb();
                answer = subtraction(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "3":
                secondValue = numb();
                answer = multiplication(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "4":
                secondValue = numb();
                answer = division(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "5":
                answer = square(firstValue);
                System.out.println(answer);
                break;
            case "6":
                answer = factorial(firstValue);
                System.out.println(answer);
                break;

        }

    }
}