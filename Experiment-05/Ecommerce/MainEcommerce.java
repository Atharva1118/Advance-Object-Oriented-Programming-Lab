package Ecommerce;

public class MainEcommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Atharva", 201);
        Order o1 = new Order(p1, 2);

        c1.displayCustomer();
        System.out.println("\n--- Order Details ---");
        o1.placeOrder();
    }
}