import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorClass {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Calculator");

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        JTextField jTextFieldFirstNumber =
                new JTextField("Enter First",10);
        jFrame.add(jTextFieldFirstNumber);
        JTextField jTextFieldForSecondNumber =
                new JTextField("Enter Second",10);
        jFrame.add(jTextFieldForSecondNumber);
        jFrame.setSize(400,300);
        JButton jButton = new JButton("Calculate Sum");
        jFrame.add(jButton);
        JLabel jLabel = new JLabel("The result is");
        jFrame.add(jLabel);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstNumber = jTextFieldFirstNumber.getText();
                String secondNumber = jTextFieldForSecondNumber.getText();
                int firstNumberInInt = Integer.parseInt(firstNumber);
                int secondNumberInInt = Integer.parseInt(secondNumber);
                int sum = firstNumberInInt + secondNumberInInt;
                jLabel.setText("Sum is "+sum);
            }
        });
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
