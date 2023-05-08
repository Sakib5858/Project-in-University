package Universit_Management;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    private ImageIcon imageicon;
    public Splash() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,50,1000,700);
        imageicon = new ImageIcon(getClass().getResource("im 2.png"));
        this.setIconImage(imageicon.getImage());
    }



    public static void main(String[] args) {

        new Splash();
    }
}
