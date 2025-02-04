import java.util.Scanner;

public class ExceptionHandling
{
    public static int Division(int numerator, int denominator)
    {
        return numerator / denominator;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Enter a numerator: ");
            int numerator = input.nextInt();

            System.out.print("Enter a denominator: ");
            int denominator = input.nextInt();

            // Catch ArithmeticException
            int result = Division(numerator, denominator);
            System.out.println("Result: " + result);

            // Accessing array element to demonstrate ArrayIndexOutOfBoundsException
            System.out.print("Enter an array index to access (0 to 4): ");
            int index = input.nextInt();
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println("Array element at index " + index + ": " + numbers[index]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid array index accessed.");
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally
        {
            System.out.println("Program execution completed.");
        }
        input.close();
    }
}
