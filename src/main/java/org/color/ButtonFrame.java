package org.color;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;


    ButtonFrame (){
        ImageIcon icon = new ImageIcon("pray.png");
        ImageIcon icon1;
        icon1 = new ImageIcon("zoom.png");

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        button = new JButton();
        button.setBounds(100,100,300,100);
        button.addActionListener(this);
        // Look into Lambda expressions for less of this above
        button.setText("Click me ,Daddy");
        //removes the text around the text
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Textura",Font.BOLD,20));
        // To set the text in closer
        button.setIconTextGap(-6);
        button.setForeground(Color.RED);
        button.setBackground(Color.DARK_GRAY);
        button.setBorder(BorderFactory.createDashedBorder(Color.red,23,30));
        // to disable a button
        //button.setEnabled(false);





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);


}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==button){
            //System.out.println("Prove");
            // to click button once then it's disabled
            //button.setEnabled(false);
            label.setVisible(true);

        }
    }
}
