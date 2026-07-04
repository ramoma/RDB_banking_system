package template;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

public class withdrawPane extends JPanel{

    public static JButton savings = new JButton();
    public static JButton current = new JButton();

    public withdrawPane(){

        setPreferredSize(new Dimension(437,540));
//        setBorder(new EmptyBorder(100,100,0,0));
        setLayout(new FlowLayout());


        savings.setPreferredSize(new Dimension(487,238));
        savings.setText("Savings");
        savings.setFont(new Font("MV Boli",Font.PLAIN, 50));

        current.setPreferredSize(new Dimension(487,238));
        current.setText("Current");
        current.setFont(new Font("MV Boli",Font.PLAIN, 50));

        add(savings);
        add(current);

    }

    public void addListeners(ActionListener listener){

        savings.addActionListener(listener);
        current.addActionListener(listener);

    }

}
