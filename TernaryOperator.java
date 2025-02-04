import java.util.Scanner;
public class TernaryOperator
{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in))
        {
            int x;
            x = input.nextInt();
            String str;
            str = (x % 2 == 0) ? "Even" : "Odd";
            System.out.println(str);
        }
    }
}
