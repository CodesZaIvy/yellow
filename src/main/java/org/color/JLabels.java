package org.color;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.Font.*;

public class JLabels {
    public static void main(String[] args) {
        //JLabel = a Gui Display area for a string of text ,an image or both

        ImageIcon image = new ImageIcon("/home/pc/Downloads/location.png");
        Border border = BorderFactory.createLineBorder(Color.black,4,true);


        // create a label
        JLabel label = new JLabel();
        // set text on label
        label.setText("I am learning a lot");
        label.setIcon(image);
        // Set text LEFT,CENTER or RIGHT of image icon
        label.setHorizontalTextPosition(JLabel.LEFT);
        // Set text TOP,CENTRE or BOTTOM  of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);
        // Change a JLabel's color
        label.setForeground(new Color(190,2,240));
        // Change a JLabel's Font
        label.setFont(new Font("Textura" , ITALIC, 34 ));
        // set Text near or far from an image
        label.setIconTextGap(100);
        // Change background color
        label.setBackground(new Color(40,70,255));
        // it can't just work on its own unless you set Opaque to true
        label.setOpaque(true);
        // set border
        label.setBorder(border);
        //  change vertical position of ImageIcon within Label
        label.setVerticalAlignment(JLabel.CENTER);
        //  change horizontal position of ImageIcon within Label
        label.setHorizontalAlignment(JLabel.CENTER);
        // set x,y cum dimensions position within frame
        //label.setBounds(100,100,250,250);




        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setSize(800,800);
        jFrame.setVisible(true);
        jFrame.add(label);
       //jFrame.setLayout(null);
        // had to comment the two so as to use .pack
        // it accomodates as well as asssimilate to any size you input on any component on the frame
            // add .pack after you've added all that needed to be added otherwise it won't work
        jFrame.pack();



    }
}
