package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField display;
    private Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();
        setTitle("Calculator App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "(", ")", "C"
        };

        ActionListener listener = e -> {
            String cmd = e.getActionCommand();
            if (cmd.equals("=")) {
                try {
                    double result = calculator.evaluate(display.getText());
                    display.setText(Double.toString(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else if (cmd.equals("C")) {
                display.setText("");
            } else {
                display.setText(display.getText() + cmd);
            }
        };

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(listener);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
