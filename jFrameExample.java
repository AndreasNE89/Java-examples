/**
 * Created by Andreas on 01.06.2017.
 */
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class jFrameExample {
    private static JFrame ramme;
    private static JPanel panel;
    private static JLabel topLabel;
    private static JLabel bottomLabel;
    private static JButton knapp;
    private static int number = 0;
    private static JPanel panel2;

    public jFrameExample(){
        createFrame();

    }


    public static void main(String [] args)
    {

        new jFrameExample();
        ClickListener cl = new ClickListener();
        knapp.addActionListener(cl);






    }
        private void createFrame(){
            ramme = new JFrame("Frame");
            ramme.setBackground(Color.YELLOW);
            topLabel = new JLabel("0");
            topLabel.setFont(topLabel.getFont().deriveFont(30.0f));
            bottomLabel = new JLabel(" Clicks !");
            bottomLabel.setFont(bottomLabel.getFont().deriveFont(30.0f));
            knapp = new JButton("Click here");
            knapp.setSize(5,5);
            ramme.setSize(400,400);
            ramme.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            ramme.setLayout(new GridLayout(3,3));
            panel = new JPanel(new FlowLayout(1));
            panel.setBackground(Color.pink);
            panel2 = new JPanel(new FlowLayout(1));
            panel2.setBackground(Color.MAGENTA);
            ramme.add(panel);
            ramme.add(panel2);
            panel2.add(topLabel);
            panel2.add(bottomLabel);
            panel.add(knapp, JButton.CENTER);
            panel.setSize(200,200);
            ramme.setVisible(true);
            panel.setVisible(true);


    }



    private static class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            number +=1;
            topLabel.setText(String.valueOf(number));


        }
    }
}
