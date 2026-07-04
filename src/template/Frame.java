package template;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Container;
import java.awt.Color;
import java.awt.BorderLayout;


public class Frame extends JFrame{

    Container container = getContentPane();
    JPanel contentContainer = new JPanel();
    public Frame(){


        setSize(1425,991);
        setTitle("RDB Banking");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(1425, 78));
        topPanel.setBackground(new Color(179,179,179));

        JPanel sideBar = new JPanel();
        sideBar.setPreferredSize(new Dimension(353,913));
        sideBar.setBackground(new Color(217,217,217));

        contentContainer.setPreferredSize(new Dimension(1072, 991));


        container.add(topPanel, BorderLayout.NORTH);
        container.add(sideBar, BorderLayout.WEST);
        container.add(contentContainer, BorderLayout.CENTER);

        setVisible(true);
    }

    public void setCurrentFrame(JPanel panel){

        contentContainer.removeAll();
        contentContainer.revalidate();
        contentContainer.repaint();
        contentContainer.add(panel);

    }

}
