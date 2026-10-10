package DataStructureProjects;

import java.util.HashMap;

public class InventorySystem {
    // A HashMap that stores item names (String) and their quantities (Integer)
    private HashMap<String, Integer> items;

    public InventorySystem() {
        items = new HashMap<>();
    }

    public void addItem(String name, int amount) {
        // Check if the item is already in our map
        if (items.containsKey(name)) {
            // If it exists, get the current amount and add the new amount to it
            int currentAmount = items.get(name);
            items.put(name, currentAmount + amount);
        } else {
            // If it's brand new, just put it in the map
            items.put(name, amount);
        }
        System.out.println("Updated " + name + "! Total quantity: " + items.get(name));
    }

    public void checkItem(String name) {
        // Check if the key exists before trying to get its value
        if (items.containsKey(name)) {
            int amount = items.get(name);
            System.out.println("Stock check -> " + name + ": " + amount + " units available.");
        } else {
            System.out.println("Stock check -> " + name + " not found in system.");
        }
    }

    public static void main(String[] args) {
        InventorySystem store = new InventorySystem();
        
        // Add some items
        store.addItem("Apple", 10);
        store.addItem("Banana", 25);
        
        // Add more of an item we already have
        store.addItem("Apple", 5); 
        
        // Check stock levels
        store.checkItem("Apple");
        store.checkItem("Orange");
    }
}