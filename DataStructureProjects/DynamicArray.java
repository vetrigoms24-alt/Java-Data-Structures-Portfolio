package DataStructureProjects;

public class DynamicArray {
    private String[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2; // Start small so we can trigger a resize quickly
        data = new String[capacity];
        size = 0;
    }

    public void add(String task) {
        // Check if the array is full before adding a new item
        if (size == capacity) {
            resize();
        }
        
        data[size] = task;
        size = size + 1; // Move our size counter up
        System.out.println("Added task: " + task);
    }

    // Manual resizing (instead of using Arrays.copyOf)
    private void resize() {
        capacity = capacity * 2; // Double the capacity
        String[] temp = new String[capacity]; // Create a bigger array
        
        // Copy old elements over one by one manually
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        
        data = temp; // Point our main data variable to the new array
        System.out.println("--> [System Alert]: Array capacity doubled to " + capacity);
    }

    public String get(int index) {
        // Simple check to make sure we don't crash
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds!");
            return null;
        }
        return data[index];
    }

    public static void main(String[] args) {
        DynamicArray board = new DynamicArray();
        board.add("Finish Java project");
        board.add("Push code to GitHub");
        board.add("Write a clean README.md"); // This third item will trigger the resize alert!
        
        System.out.println("Task at index 1: " + board.get(1));
    }
}
