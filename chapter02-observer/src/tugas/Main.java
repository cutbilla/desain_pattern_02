package tugas;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        shoppingCart.registerObserver(customer1);
        shoppingCart.registerObserver(customer2);

        shoppingCart.addItem("Laptop", 2);
        shoppingCart.addItem("Phone", 3);
    }
}

