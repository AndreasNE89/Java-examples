package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main{
    private JFrame ramme = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel hoyre = new JPanel();
    private JPanel mid = new JPanel();
    private JPanel bottom = new JPanel();
    private JButton hKnapp = new JButton();
    private JButton venstre = new JButton();
    private JButton bottomB = new JButton();
    private JButton midB = new JButton();
    private JLabel leftB = new JLabel();
    private JLabel rightB = new JLabel();
    private JLabel midBu = new JLabel();
    private JLabel bottomL = new JLabel();


    public Main (){
        makeFrame();


    }
    public static void main(String[] args) {
        new Main();

    }
    public void makeFrame(){
        ramme = new JFrame("Ramme");
        panel = new JPanel();
        hoyre = new JPanel();
        mid = new JPanel();
        bottom = new JPanel();
        leftB = new JLabel("Left");
        midBu = new JLabel("Middle");
        rightB = new JLabel("Right");
        bottomL = new JLabel("Bottom");
        JPanel main = new JPanel(new BorderLayout(1,1));

        midB = new JButton("Mid");
        venstre = new JButton("Left");
        hKnapp = new JButton("Right");
        bottomB = new JButton("Bottom");

        mid.add(midB);
        mid.add(midBu);
        panel.add(venstre);
        panel.add(leftB);
        hoyre.add(hKnapp);
        hoyre.add(rightB);
        bottom.add(bottomB);
        bottom.add(bottomL);
        panel.setBackground(Color.GREEN);
        hoyre.setBackground(Color.PINK);
        mid.setBackground(Color.LIGHT_GRAY);
        bottom.setBackground(Color.orange);

        main.add(panel, BorderLayout.WEST);
        main.add(hoyre, BorderLayout.EAST);
        main.add(mid, BorderLayout.CENTER);
        main.add(bottom, BorderLayout.SOUTH);
        ramme.setSize(400,200);
        ramme.add(main);
        ramme.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ramme.setVisible(true);

    }



}
