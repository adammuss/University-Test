import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task3();
    }

    public static void Task1(){
        float num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextFloat();

        System.out.println("Enter the second number:");
        num2 = sc.nextFloat();

        System.out.printf("Sum is: %.2f\n", (num1 + num2));
        System.out.printf("Difference is: %.2f\n", (num1 - num2));
        System.out.printf("Product is: %.2f\n", (num1 * num2));
        System.out.printf("Quotient is: %.2f\n", (num1 / num2));
    }

    public static void Task2() {
        double height, weight = 1, bmi;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        weight = sc.nextDouble();

        System.out.println("Enter your height in meters:");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if(bmi < 16) {
            System.out.println("you have starvation");
        }else if(bmi >= 16 && bmi <= 16.99) {
            System.out.println("you have emaciation");
        }else if(bmi >= 17 && bmi <= 18.49){
            System.out.println("you have underweight");
        }else if(bmi >= 18.5 && bmi <= 22.99){
            System.out.println("you have normal, low range");
        }else if(bmi >= 23 && bmi <= 24.99){
            System.out.println("you have normal, high range");
        }else if(bmi >= 25 && bmi <= 27.49){
            System.out.println("you have overweight, low range");
        }else if(bmi >= 27.5 && bmi <= 29.99){
            System.out.println("you have overweight, high range");
        }else if(bmi >= 30 && bmi<= 34.99){
            System.out.println("you have 1st degree obesity");
        }else if(bmi >= 35 && bmi <= 39.9){
            System.out.println("you have 2st degree obesity");
        }else if(bmi >= 40){
            System.out.println("you have 3st degree obesity");
        }
    }

    public static void Task3() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            double a = input.nextDouble();

            if (a >= 0) {
                System.out.print("Enter the value of b: ");
                double b = input.nextDouble();
                System.out.print("Enter the value of c: ");
                double c = input.nextDouble();
                double d = b * b - 4.0 * a * c;
                if (d > 0.0) {
                    double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                    double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                    System.out.println("The roots are " + x1 + " and " + x2);
                } else if (d == 0.0) {
                    double x1 = -b / (2.0 * a);
                    System.out.println("The root is " + x1);
                } else {
                    System.out.println("Roots are not real.");
                }
            }else{
                System.out.println("Roots are not real.");
            }
    }

    public static void Task4() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void Task5() {


    }
}
