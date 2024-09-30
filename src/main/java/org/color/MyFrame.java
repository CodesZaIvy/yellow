package org.color;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

            this.setSize(420, 420);
            //sets title of Frame
            this.setTitle("Title Here");
            // exit out of application
            this.getDefaultCloseOperation();
            // Resize the window
            this.setResizable(true);
            // make the frame visible
            this.setVisible(true);
            // Create an Image Icon
            ImageIcon image = new ImageIcon("/home/pc/Desktop/Bega-.png");
            // change icon of frame
            this.setIconImage(image.getImage());
            //change color of frame
            this.getContentPane().setBackground(new Color(130, 170, 100));


        }
    }
