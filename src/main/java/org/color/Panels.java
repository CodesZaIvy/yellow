package org.color;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("pray.png");

        JLabel jLabel = new JLabel();
        jLabel.setText("Heeey");
        jLabel.setIcon(icon);
        jLabel.setVerticalAlignment(JLabel.BOTTOM);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        jLabel.setBounds(0,0,75,75);

        JPanel tealPanel = new JPanel();
        tealPanel.setBackground(new Color(0,128,128));
        tealPanel.setBounds(0,0,250,250);
        tealPanel.setLayout(null);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(new Color(255,0,255));
        magentaPanel.setBounds(250,0,250,250);
        magentaPanel.setLayout(null);

        JPanel goldPanel = new JPanel();
        goldPanel.setBackground(new Color(255,215,0));
        goldPanel.setBounds(0,250,500,250);
        goldPanel.setLayout(null);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(750,750);
        jFrame.setVisible(true);
        magentaPanel.add(jLabel);
        jFrame.add(tealPanel);
        jFrame.add(magentaPanel);
        jFrame.add(goldPanel);

    }
}
