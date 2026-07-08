
import template.*;
import Controllers.*;

public class Main {

    static Frame frame = new Frame();
    static void main(String[] args) {

        optionsPane optionPane = new optionsPane();
        optionPane.addListener(e -> {

            if(e.getSource() == optionsPane.checkBalance){

                System.out.println("this works");
                checkBalancePane checkBalanc = new checkBalancePane();
                withdrawPane withdraw = new withdrawPane();
                frame.setCurrentFrame(withdraw);

            } else if (e.getSource() == optionsPane.withdraw){

                System.out.println("this works too");

            }
        });


        frame.setCurrentFrame(optionPane);

    }

}
