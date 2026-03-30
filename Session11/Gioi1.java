package Session11;

class Computer {

    // 1. Chỉ giá gốc
    public double calculatePrice(double basePrice) {
        System.out.println("Tính theo giá gốc");
        return basePrice;
    }

    // 2. Giá gốc + thuế
    public double calculatePrice(double basePrice, double tax) {
        System.out.println("Tính theo giá gốc + thuế");
        return basePrice + basePrice * tax;
    }

    // 3. Giá gốc + thuế + giảm giá
    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Tính theo giá gốc + thuế + giảm giá");
        return basePrice + basePrice * tax - discount;
    }
}

public class Gioi1 {
    public static void main(String[] args) {
        Computer c = new Computer();

        double price1 = c.calculatePrice(1000);
        System.out.println("Giá 1: " + price1);

        double price2 = c.calculatePrice(1000, 0.1);
        System.out.println("Giá 2: " + price2);

        double price3 = c.calculatePrice(1000, 0.1, 50);
        System.out.println("Giá 3: " + price3);
    }
}