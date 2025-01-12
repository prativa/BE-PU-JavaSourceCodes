import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create a panel for the text fields
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create two text fields
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        // Add text fields to the panel
        textFieldPanel.add(textField1);
        textFieldPanel.add(textField2);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create two buttons
        JButton clearButton = new JButton("Clear");
        JButton calculateButton = new JButton("Calculate");

        // Add buttons to the panel
        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);

        // Create a label
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listener to the clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                resultLabel.setText("Result: ");
            }
        });

        // Add action listener to the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });

        // Add panels and label to the frame
        frame.add(textFieldPanel);
        frame.add(buttonPanel);
        frame.add(resultLabel);

        // Display the frame
        frame.setVisible(true);
    }
}

