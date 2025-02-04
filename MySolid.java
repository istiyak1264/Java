import java.util.Scanner;
abstract class Solid
{
    double radius;

    public abstract void surfaceArea();
    public abstract void volume();
    public abstract void readRadius();

    public double baseArea(double r)
    {
        return Math.PI * r * r;
    }
}

class Cylinder extends Solid
{
    double height;

    public Cylinder(double h)
    {
        height = h;
    }

    public void readRadius()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the radius (Cylinder): ");
            radius = sc.nextDouble();
        }
    }

    public void surfaceArea()
    {
        double bArea = baseArea(radius);
        double totalArea = 2 * Math.PI * radius * height + 2 * bArea;
        System.out.printf("Surface Area of Cylinder is: %.2f\n", totalArea);
    }

    public void volume()
    {
        System.out.printf("Volume of the Cylinder is: %.2f\n", height * baseArea(radius));
    }
}

class Cone extends Solid
{
    double height;

    public Cone(double h)
    {
        height = h;
    }

    public void readRadius()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the radius (Cone): ");
            radius = sc.nextDouble();
        }
    }

    public void surfaceArea()
    {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double area = Math.PI * radius * (radius + slantHeight);
        System.out.printf("Surface Area of Cone is: %.2f\n", area);
    }

    public void volume()
    {
        double volume = (1.0 / 3) * baseArea(radius) * height;
        System.out.printf("Volume of Cone is: %.2f\n", volume);
    }
}

class Sphere extends Solid
{
    public void readRadius()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the radius (Sphere): ");
            radius = sc.nextDouble();
        }
    }

    public void surfaceArea()
    {
        System.out.printf("Surface Area of Sphere is: %.2f\n", 4 * baseArea(radius));
    }

    public void volume()
    {
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume of Sphere is: %.2f\n", volume);
    }
}

public class MySolid
{
    public static void main(String[] args)
    {
        Solid s = new Cylinder(7);
        s.readRadius();
        s.surfaceArea();
        s.volume();

        s = new Cone(7);
        s.readRadius();
        s.surfaceArea();
        s.volume();

        s = new Sphere();
        s.readRadius();
        s.surfaceArea();
        s.volume();
    }
}