package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JFrame frame;
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setTitle("Simple Calculator");
        frame.setVisible(true);
        frame.add(panel1);
        tfNumber1.setHorizontalAlignment(SwingConstants.CENTER);
        tfNumber2.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI scGUI = new SimpleCalcGUI();
    }
}
