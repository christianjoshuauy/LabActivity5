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
    }

    public static void main(String[] args) {
        LeapYearGUI lyGUI = new LeapYearGUI();
    }
}
