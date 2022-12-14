package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
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

                    JOptionPane.showMessageDialog(panel1, output);
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(panel1, "Please enter a valid year");
                } catch (Exception oe){
                    JOptionPane.showMessageDialog(panel1, "Other Exception");
                } finally {
                    tfYear.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI lyGUI = new LeapYearGUI();
        lyGUI.setContentPane(lyGUI.panel1);
        lyGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lyGUI.setSize(500, 300);
        lyGUI.setTitle("Leap Year Checker");
        lyGUI.setVisible(true);
    }
}
