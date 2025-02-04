import java.util.Scanner;
public class GCD
{
    public static int calculateGCD(int a, int b)
    {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = a;
            if (a < b)
            {
                a = b;
                b = temp;
            }
            System.out.println("GCD: " + calculateGCD(a, b));
        }
    }
}
