package tugas;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Observer interface
interface Observer {
    void update(String itemName, int quantity);
}

// Concrete Subject
class ShoppingCart implements Subject {
    private List<Observer> observers;
    private String itemName;
    private int quantity;

    public ShoppingCart() {
        this.observers = new ArrayList<>();
    }

    public void addItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(itemName, quantity);
        }
    }
}

// Concrete Observer
class Customer implements Observer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String itemName, int quantity) {
        System.out.println(customerName + " memesan " + quantity + " " + itemName);
    }
}

