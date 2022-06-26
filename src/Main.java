import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        --- Test Values ---
//        System.out.println(AreaCalculator.area(5.0));
//        System.out.println(AreaCalculator.area(-1));
//        System.out.println(AreaCalculator.area(5.0, 4.0));
//        System.out.println(AreaCalculator.area(-1.0, 4.0));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to find the circumference of a circle.");
        System.out.println("Enter 2 to find the area of a square or rectangle.");
        int choice = input.nextInt();
        System.out.println();

        if (choice == 1)
        {
            System.out.println("Enter the radius");
            double num1 = input.nextDouble();

            System.out.println("Circumference = " + AreaCalculator.area(num1));
        }
        else if (choice == 2)
        {
            System.out.println("Enter the length and width");
            System.out.print("First number = ");
            double num1 = input.nextDouble();
            System.out.print("Second number = ");
            double num2 = input.nextDouble();

            System.out.println("Area = " + AreaCalculator.area(num1, num2));
        }
        else
        {
            System.out.println(choice + " is not a valid option");
        }


    }
}
