import java.util.Scanner;
class Fruit
{
    public float unitprice;
    public int quantity;
    public float totalCost()
    {
        return quantity*unitprice;
    }
    public void readData()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the price per kg: ");
            unitprice = sc.nextFloat();
            System.out.println("How many kg you want to purchase?");
            quantity = sc.nextInt();
        }
    }
    public void display()
    {
        System.out.printf("Price = Tk. %.2f per Kg.\n", unitprice);
        System.out.printf("Purchased Quantity = %d Kg.\n", quantity);
        System.out.printf("Cost = Tk. %.2f\n", totalCost());
    }
}
class Mango extends Fruit
{
    public String name, taste;
    public Mango(String n, String t)
    {
        name = n;
        taste = t;
    }
    public void makeJuice()
    {
        System.out.println("Peel off and slice the fruit.");
        System.out.println("Crush the fruit slices to make juice.");
    }
}
public class EatFruit
{
    public static void main(String[] args)
    {
        Mango m1 = new Mango("Lengra", "Sweet");
        System.out.printf("Taste of %s is very %s\n", m1.name, m1.taste);
        m1.readData();
        m1.display();
        m1.makeJuice();
    }   
}
