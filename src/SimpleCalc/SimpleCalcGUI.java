package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        tfNumber1.setHorizontalAlignment(SwingConstants.CENTER);
        tfNumber2.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());
                    char op =  cbOperations.getSelectedItem().toString().charAt(0);
                    int result;
                    if(op == '+') {
                        result = num1 + num2;
                    } else if (op == '-') {
                        result = num1 - num2;
                    }
                    else if(op == '*') {
                        result = num1 * num2;
                    }
                    else {
                        result = num1 / num2;
                    }
                    lblResult.setText(Integer.toString(result));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(panel1, "Please enter an Integer Number");
                    lblResult.setText("");
                } catch (ArithmeticException ae) {
                    JOptionPane.showMessageDialog(panel1, "Cannot divide by Zero");
                    lblResult.setText("");
                } catch (Exception oe) {
                    JOptionPane.showMessageDialog(panel1, "Other Exception");
                    lblResult.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI scGUI = new SimpleCalcGUI();
        scGUI.setContentPane(scGUI.panel1);
        scGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        scGUI.setSize(600, 300);
        scGUI.setTitle("Simple Calculator");
        scGUI.setVisible(true);
    }
}
