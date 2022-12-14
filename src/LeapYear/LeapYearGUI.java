package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JFrame frame;
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JOptionPane opResult;

    public LeapYearGUI(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setTitle("Leap Year Checker");
        frame.setVisible(true);
        frame.add(panel1);

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    boolean isLeapYear;
                    String output = null;

                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            isLeapYear = true;
                        }
                        else {
                            isLeapYear = false;
                        }
                    }
                    else if(year % 4 == 0){
                        isLeapYear = true;
                    }
                    else {
                        isLeapYear = false;
                    }
                    if(isLeapYear){
                        output = "Leap year";
                    }
                    else{
                        output = "Not a leap year";
                    }

                    JOptionPane.showMessageDialog(frame, output);
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame, "Please enter a valid year");
                } catch (Exception oe){
                    JOptionPane.showMessageDialog(frame, "Other Exception");
                } finally {
                    tfYear.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI lyGUI = new LeapYearGUI();
    }
}
