package org.color;
import javax.swing.JOptionPane;

public class SimpleGui {
    public static void main(String[] args) {
        //Enables a popup box
        String plant = JOptionPane.showInputDialog("Enter the Plant Name:");
        //Displays Information
        JOptionPane.showMessageDialog(null, "This are "+ plant);

        //The Integer.parseInt is converting the JOptionPane into an Integer even though it's a string
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of plants"));
       JOptionPane.showMessageDialog(null,"There are "  +  number  + " " +   plant );
        //" " added is to enable a space between plant and number

        double litres = Double.parseDouble(JOptionPane.showInputDialog("Enter how many litres they consume per week"));
        JOptionPane.showMessageDialog(null,plant + " consumes " + litres + " per week");

    }
}

