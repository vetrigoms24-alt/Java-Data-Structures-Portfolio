package DataStructureProjects;

import java.util.Stack;

public class TextEditor {
    private StringBuilder currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        currentText = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void type(String text) {
        undoStack.push(currentText.toString());//making sure to save currentText
        currentText.append(text);
        redoStack.clear(); // Clear redo history on new typing action
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText.toString());
            currentText = new StringBuilder(undoStack.pop());
            System.out.println("[Undo performed]");
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText.toString());
            currentText = new StringBuilder(redoStack.pop());
            System.out.println("[Redo performed]");
        } else {
            System.out.println("Nothing to redo!");
        }
    }

    public void printText() {
        System.out.println("Current Text: " + currentText.toString());
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello ");
        editor.type("World!");
        editor.printText(); // Hello World!

        editor.undo();
        editor.printText(); // Hello 

        editor.redo();
        editor.printText(); // Hello World!
    }
}