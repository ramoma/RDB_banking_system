package template;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;

public class optionsPane extends JPanel{

    public static JButton checkBalance = new JButton();
    public static JButton withdraw = new JButton();
    public static JButton transactions = new JButton();

    public optionsPane(){

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(1072, 470));
//        setBackground(Color.RED);
        setBorder(new EmptyBorder(100,0,0,0));

        checkBalance.setText("Check Balance");
        checkBalance.setFont(new Font("MV Boli",Font.PLAIN,30 ));
        checkBalance.setPreferredSize(new Dimension(281,370));
        checkBalance.setFocusable(false);

        withdraw.setText("Withdraw");
        withdraw.setFont(new Font("MV Boli",Font.PLAIN,30 ));
        withdraw.setPreferredSize(new Dimension(281,370));
        withdraw.setFocusable(false);

        transactions.setText("View Transactions");
        transactions.setFont(new Font("MV Boli",Font.PLAIN,30 ));
        transactions.setPreferredSize(new Dimension(281,370));
        setFocusable(false);


        add(checkBalance);
        add(withdraw);
        add(transactions);

    }

    public void addListener(ActionListener listener){

        checkBalance.addActionListener(listener);
        withdraw.addActionListener(listener);
        transactions.addActionListener(listener);

    }

}
