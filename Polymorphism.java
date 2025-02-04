class HouseAllot {
    public void SquareFeet() {
        System.out.println("Square Feet depends upon LIG, MIG, HIG");
    }
}

class LIG extends HouseAllot {
    public void SquareFeet() {  // Overriding method
        System.out.println("LIG: Square feet is 3 cent.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        HouseAllot obj = new LIG();
        obj.SquareFeet();
    }
}
