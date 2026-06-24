package template;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Dimension;

public class Frame extends JFrame{

    public Frame(){


        setSize(1425,991);
        setTitle("RDB Banking");
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

}
