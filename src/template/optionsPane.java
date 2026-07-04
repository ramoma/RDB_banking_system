package template;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class optionsPane extends JPanel{

    public static JButton tempButton = new JButton("button");

    public optionsPane(){

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(1072, 370));
        setBackground(Color.RED);

        tempButton.setPreferredSize(new Dimension(281,370));

        add(tempButton);

    }

    public void addListener(ActionListener listener){

        tempButton.addActionListener(listener);

    }

}
