/**
 * The TextEditorUndo class provides a stack-based mechanism to manage undo actions in a text editor.
 * It allows adding new actions, undoing the last action, viewing the last action, and displaying all actions.
 */
public class TextEditorUndo {
    private String[] stack; // Array to store stack elements
    private int top; // Index of the top element in the stack

    /**
     * Constructs a new TextEditorUndo with a specified size.
     *
     * @param size the maximum number of actions the stack can hold
     */
    public TextEditorUndo(int size) {
        this.stack = new String[size]; // Initialize the stack array
        this.top = -1; // Set initial top index to -1, indicating an empty stack
    }

    /**
     * Adds a new action to the stack.
     *
     * @param action the action to be added to the stack
     */
    public void push(String action) {
        // Check if the stack is full
        if (top == stack.length - 1) {
            System.out.println("The stack is full"); // Message if the stack is full
            return;
        }
        // Increment top and add the action to the stack
        stack[++top] = action;
        System.out.println("Added '" + action + "' to the stack."); // Print a confirmation message
    }

    /**
     * Removes and returns the most recent action from the stack.
     *
     * @return the most recent action, or null if the stack is empty
     */
    public String pop() {
        // Check if the stack is empty
        if (top == -1) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return null;
        }
        // Retrieve and remove the top action from the stack
        String action = stack[top--];
        System.out.printf("The action '%s' was removed%n", action); // Print confirmation message
        return action;
    }

    /**
     * Views the most recent action in the stack without removing it.
     *
     * @return the most recent action, or null if the stack is empty
     */
    public String peek() {
        // Check if the stack is empty
        if (top == -1) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return null;
        }
        return stack[top];
    }

    /**
     * Displays all actions in the stack.
     */
    public void display() {
        // Check if the stack is empty
        if (top == -1) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return;
        }
        // Iterate through the stack and print each action
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[stack.length - 1 - i]);
        }
        System.out.println(); // Print a new line for better formatting
    }
}