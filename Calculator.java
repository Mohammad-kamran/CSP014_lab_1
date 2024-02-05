package CSP014_lab_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends Frame implements ActionListener {
    // Components
    TextField textField;
    Button[] buttons;

    // Variables
    String currentInput, operator, result;

    // Constructor
    Calculator() {
        // Initialize components
        textField = new TextField();
        buttons = new Button[20];

        // Set layout
        setLayout(new GridLayout(5, 4));
        setResizable(false);

        // Initialize variables
        currentInput = operator = result = "";

        // Add components to the frame
        add(textField);

        // Add buttons
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
        }

        buttons[10] = new Button("+");
        buttons[11] = new Button("-");
        buttons[12] = new Button("*");
        buttons[13] = new Button("/");

        buttons[14] = new Button(".");
        buttons[15] = new Button("=");
        buttons[16] = new Button("C");

        // Add ActionListener to buttons
        for (int i = 0; i < 17; i++) {
            buttons[i].addActionListener(this);
        }

        // Add buttons to the frame
        for (int i = 7; i <= 9; i++) add(buttons[i]);
        add(buttons[10]);

        for (int i = 4; i <= 6; i++) add(buttons[i]);
        add(buttons[11]);

        for (int i = 1; i <= 3; i++) add(buttons[i]);
        add(buttons[12]);

        add(buttons[16]);  // Clear button

        add(buttons[0]);
        add(buttons[14]);  // Decimal point button
        add(buttons[15]);  // Equals button
        add(buttons[13]);  // Division button

        // Set frame properties
        setTitle("Calculator");
        setSize(300, 400);
        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            currentInput += command;
            textField.setText(currentInput);
        } else if (command.charAt(0) == 'C') {
            currentInput = operator = result = "";
            textField.setText("");
        } else if (command.charAt(0) == '=') {
            calculate();
            operator = "";
        } else {
            if (!operator.isEmpty()) {
                calculate();
            }
            operator = command;
            result = currentInput;
            currentInput = "";
        }
    }

    // Method to perform calculation
    private void calculate() {
        double operand1 = Double.parseDouble(result);
        double operand2 = Double.parseDouble(currentInput);

        switch (operator) {
            case "+":
                result = String.valueOf(operand1 + operand2);
                break;
            case "-":
                result = String.valueOf(operand1 - operand2);
                break;
            case "*":
                result = String.valueOf(operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {
                    result = String.valueOf(operand1 / operand2);
                } else {
                    result = "Error";
                }
                break;
        }

        textField.setText(result);
        currentInput = result;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
