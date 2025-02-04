import java.util.Scanner;
public class switchCase
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int day;
            day = input.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("The day is Saturday.");
                    break;
                case 2:
                    System.out.println("The day is Sunday.");
                    break;
                case 3:
                    System.out.println("The day is Monday.");
                    break;
                case 4:
                    System.out.println("The day is Tuesday.");
                    break;
                case 5:
                    System.out.println("The day is Wednesday.");
                    break;
                case 6:
                    System.out.println("The day is Thursday.");
                    break;
                case 7:
                    System.out.println("The day is Friday.");
                    break;
            
                default:
                    System.out.println("The day is Invalid.");
                    break;
            }
        }
    }
    
}
