# Java Data Structures & Algorithms Portfolio

Welcome to my portfolio repository! This project contains four independent, custom-built applications designed from scratch. While the core algorithmic concepts (Stacks, Linked Lists, Hash Maps, and Dynamic Arrays) were originally explored through my university computer science coursework, these specific projects were built independently to solidify my understanding, keep my code clean and original, and showcase my practical Java skills for internships and career fairs.

---

## 📂 Project Directory

### 1. Text Editor (`TextEditor.java`)
* **Core Concept:** Stacks (LIFO)
* **Description:** A text editing simulation that maintains state history using an undo and redo system. Every typing action pushes states onto a history stack, allowing seamless navigation back and forth through text changes.

### 2. PlayList (`PlayList.java`)
* **Core Concept:** Custom Doubly-Linked Lists
* **Description:** A media player queue built from scratch using manual node traversal (`next` and `prev` pointers) rather than Java's built-in libraries. It supports adding songs, skipping forward, and navigating backward through the playlist.

### 3. Inventory System (`InventorySystem.java`)
* **Core Concept:** Hash Maps
* **Description:** A retail stock management tool that maps item names to their quantities. It utilizes hash-based key lookups to achieve fast $O(1)$ updates and inventory checking.

### 4. Task Board (`DynamicArray.java`)
* **Core Concept:** Dynamic Arrays
* **Description:** A custom-built array wrapper that mimics how Java's `ArrayList` functions under the hood. When capacity is reached, it automatically allocates a larger array and manually copies elements over.

---

## 🚀 How to Run
Each project is self-contained and includes a `main` method for immediate testing. You can compile and run any file in your terminal:

```bash
javac FileName.java
java FileName