package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private List<JRadioButton> bgDiscounts;
    private List<JCheckBox> bgFoods;

    private int getTotalFoodPrice() {
        int total = 0;
        for(JCheckBox cb : bgFoods) {
            if(cb.isSelected()){
                if(cb == cPizza){
                    total += 100;
                } else if (cb == cBurger) {
                    total += 80;
                } else if (cb == cFries) {
                    total += 65;
                } else if (cb == cSoftDrinks) {
                    total += 55;
                } else if (cb == cTea) {
                    total += 50;
                } else {
                    total += 40;
                }
            }
        }
        return total;
    }

    private double getDiscount() {
        double discount = 0;
        for(JRadioButton rb : bgDiscounts){
            if(rb.isSelected()) {
                if(rb == rbNone) {
                    break;
                } else if (rb == rb5) {
                    discount = .05;
                    break;
                } else if (rb == rb10) {
                    discount = .10;
                    break;
                } else {
                    discount = .15;
                    break;
                }
            }
        }
        return discount;
    }

    public FoodOrderGUI() {
        bgDiscounts = new ArrayList<>();
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb5);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);
        bgFoods = new ArrayList<>();
        bgFoods.add(cPizza);
        bgFoods.add(cBurger);
        bgFoods.add(cFries);
        bgFoods.add(cSoftDrinks);
        bgFoods.add(cTea);
        bgFoods.add(cSundae);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = getTotalFoodPrice();
                double discount = getDiscount();
                double finalPrice = total - (total * discount);
                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", finalPrice));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI foGUI = new FoodOrderGUI();
        foGUI.setContentPane(foGUI.panel1);
        foGUI.setSize(600, 600);
        foGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foGUI.setTitle("Food Ordering System");
        foGUI.setVisible(true);
    }
}
