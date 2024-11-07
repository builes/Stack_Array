# Text Editor Undo Mechanism

## Overview
This project implements a simple text editor undo mechanism using a stack data structure. The application allows users to add edit actions, undo the last edit, view the last edit, display all actions, and exit the program.

## Features
- **Add Edit Action**: Users can add new edit actions to the stack.
- **Undo Last Edit**: Users can undo the most recent edit action.
- **View Last Edit**: Users can view the most recent edit action without removing it from the stack.
- **Display All Actions**: Users can display all the edit actions currently in the stack.
- **Exit**: Users can exit the application.

## Classes

### Main
The `Main` class provides the entry point for the application. It includes a menu-driven interface for users to interact with the text editor undo mechanism.

#### Main Methods
- `main(String[] args)`: The entry point of the application. It provides a menu for users to interact with the text editor undo mechanism.

### TextEditorUndo
The `TextEditorUndo` class provides a stack-based mechanism to manage undo actions in a text editor. It allows adding new actions, undoing the last action, viewing the last action, and displaying all actions.

#### TextEditorUndo Methods
- `TextEditorUndo(int size)`: Constructs a new `TextEditorUndo` with a specified size.
- `void push(String action)`: Adds a new action to the stack.
- `String pop()`: Removes and returns the most recent action from the stack.
- `String peek()`: Views the most recent action in the stack without removing it.
- `void display()`: Displays all actions in the stack.

## Usage
1. **Run the application**: Execute the `Main` class to start the application.
2. **Interact with the menu**: Use the menu options to add, undo, view, and display actions.

## Example
```plaintext
Text Editor Undo Mechanism
1. Add Edit Action
2. Undo Last Edit
3. View Last Edit
4. Display All Actions
5. Exit
Enter your choice: 1
Enter edit action: Added a new paragraph.
Added 'Added a new paragraph.' to the stack.

Text Editor Undo Mechanism
1. Add Edit Action
2. Undo Last Edit
3. View Last Edit
4. Display All Actions
5. Exit
Enter your choice: 3
Last edit action: "Added a new paragraph."