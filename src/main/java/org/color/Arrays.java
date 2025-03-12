package org.color;

import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {

        // Arrays -> Used to store multiple values in a single variable
        System.out.println("Welcome to our bra drawer!!");

        // Declare an array for different types of bras
        String drawer[] = {"Bralette", "Sports-bra", "Underwired-bra", "Plunge-bra", "Racerback-bra"};

        // Declare an array for different types of outfits
        String outfit[] = {"All", "T-shirts", "Crop tops", "Wife beaters", "V-Neckline Dresses"};

        // Declare an array for bra colors
        String colors[] = {"Black", "White", "Nude", "Red", "Blue"};

        // Use JOptionPane to prompt the user to choose an outfit
        String selectedOutfit = (String) JOptionPane.showInputDialog(null,
                "Choose your outfit:",
                "Outfit Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                outfit,
                outfit[0]);

        // Function to pick the fitting bra based on the outfit
        String selectedBra = pickFittingBra(selectedOutfit, drawer);

        // Function to suggest a bra color
        String selectedColor = suggestColor(selectedOutfit, colors);

        // Show the selected bra and color in a message dialog
        JOptionPane.showMessageDialog(null,
                "For " + selectedOutfit + ": " + selectedBra + " in " + selectedColor + " color.",
                "Bra Selection",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Function to pick a fitting bra based on the outfit
    public static String pickFittingBra(String outfit, String[] drawer) {
        switch (outfit) {
            case "T-shirts":
                return drawer[2];
            case "Crop tops":
                return drawer[0];
            case "Wife beaters":
                return drawer[1];
            case "V-Neckline Dresses":
                return drawer[3];
            default:
                return drawer[4];
        }
    }

    // Function to suggest a color based on the outfit
    public static String suggestColor(String outfit, String[] colors) {
        switch (outfit) {
            case "T-shirts":
                return colors[1];
            case "Crop tops":
                return colors[2];
            case "Wife beaters":
                return colors[0];
            case "V-Neckline Dresses":
                return colors[3];
            default:
                return colors[4];
        }
    }

    public static Object stream(String[] days) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }
}
