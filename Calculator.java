import java.util.Scanner;
public class Calculator {
    public static void main(String [] args)
    {
        Scanner scnr= new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double x= scnr.nextDouble();
        System.out.print("Enter second operand: ");
        double y= scnr.nextDouble();
        System.out.println("Calculator Menu\n---------------\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Which operation do you want to perform? ");
        int function= scnr.nextInt();
        if (function==1)
        {
System.out.print("The result of the operation is " + (x+y) + ". Goodbye!");
        }
        else if (function == 2)
        {
            System.out.print("The result of the operation is " + (x-y) + ". Goodbye!");
        }
        else if (function == 3)
        {
            System.out.print("The result of the operation is " + (x*y) + ". Goodbye!");
        }
        else if (function == 4)
        {
            System.out.print("The result of the operation is " + (x/y) + ". Goodbye!");
        }
        else
        {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
    }

}
