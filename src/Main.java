
import template.*;
import Controllers.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static Frame frame = new Frame();
    static void main(String[] args) {

        optionsPane optionPane = new optionsPane();
        optionPane.addListener(e -> {

            if(e.getSource() == optionsPane.tempButton){

                System.out.println("this works");
                checkBalancePane checkBalanc = new checkBalancePane();
                frame.setCurrentFrame(checkBalanc);

            }
        });


        frame.setCurrentFrame(optionPane);

    }

}
