package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JFrame frame;
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public LeapYearGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setTitle("Leap Year Checker");
        frame.setVisible(true);
        frame.add(panel1);
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year =  Integer.parseInt(tfYear.getText());
                String output = null;
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        output = "Leap year";
                    }
                    else {
                        output = "Not a leap year";
                    }
                }
                else if(year % 4 == 0){
                    output = "Leap year";
                }
                else{
                    output = "Not a leap year";
                }
                JOptionPane.showMessageDialog(frame, output);
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI lyGUI = new LeapYearGUI();
    }
}
